package com.poecpoec.agence.dao;
/**
 * 
 * @author Nordine
 *
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.poecpoec.agence.dao.ConnexionVoyageDao.ConnexionVoyageDaoStatic;
import com.poecpoec.agence.interfaces.IDataRecovery;
import com.poecpoec.agence.model.Adresse;
import com.poecpoec.agence.model.Client;

public class ClientDao implements IDataRecovery<Client>
{

    /**
     * Data Access Objet
     */
    public ClientDao()
    {

    }

    /**
     * Retourner tous les clients de la BDD
     * 
     * @return Liste de client
     */
    @Override
    public List<Client> findAll()
    {

        AdresseDao adresseDao = new AdresseDao();
        List<Client> clients = new ArrayList<>();

        try
        {
            // je récupère la connexion à la BDD
            Connection connexion = ConnexionVoyageDaoStatic.getConnexion();
            // création du statement
            Statement statement = connexion.createStatement();

            // Exécuter la requête SQL
            ResultSet resultats = statement.executeQuery("SELECT * FROM client");
            // boucle de parcours des résultats
            while (resultats.next())
            {
                // je crée un client vide
                Client client = new Client();
                client.setId(resultats.getInt("idCli"));
                client.setNom(resultats.getString("nom"));
                client.setPrenom(resultats.getString("prenom"));
                client.setNumeroTel(resultats.getString("telephone"));
                client.setNumeroFax(resultats.getString("fax"));
                client.setEmail(resultats.getString("email"));

                // je récupère ensuite son adresse
                Adresse adresse = adresseDao.findByClientId(client.getId());
                client.setAdresse(adresse);
                // je l'ajoute à ma liste
                clients.add(client);
            }
            // fermer le résultat
            resultats.close();
            // fermer le statement
            statement.close();
        }

        catch (SQLException e)
        {
            System.out.println("Erreur SQL. Voir ci-après.");
            System.out.println(e.getMessage());
        }
        // je demande la fermeture de la connexion
        ConnexionVoyageDaoStatic.closeConnexion();
        // je retourne la liste des clients trouvés dans la BDD
        return clients;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.poecpoec.agence.interfaces.IDataRecovery#findById(int)
     */
    @Override
    public Client findById(int id)
    {
        AdresseDao adresseDao = new AdresseDao();
        Client client = new Client();

        try
        {
            // je récupère la connexion à la BDD
            Connection connexion = ConnexionVoyageDaoStatic.getConnexion();
            // création du statement
            Statement statement = connexion.createStatement();
            // Exécuter la requête SQL
            ResultSet resultats = statement
                    .executeQuery("SELECT * FROM client WHERE idCli = " + id);
            // boucle de parcours des résultats
            if (resultats.next())
            {
                client.setId(resultats.getInt("idCli"));
                client.setNom(resultats.getString("nom"));
                client.setPrenom(resultats.getString("prenom"));
                client.setNumeroTel(resultats.getString("telephone"));
                client.setNumeroFax(resultats.getString("fax"));
                client.setEmail(resultats.getString("email"));

                // je récupère ensuite son adresse
                Adresse adresse = adresseDao.findByClientId(client.getId());
                client.setAdresse(adresse);
            }
            // fermer le résultat
            resultats.close();
            // fermer le statement
            statement.close();
        }
        catch (SQLException e)
        {
            System.out.println("Erreur SQL. Voir ci-après.");
            System.out.println(e.getMessage());
        }
        // je demande la fermeture de la connexion
        ConnexionVoyageDaoStatic.closeConnexion();
        // je retourne le client trouvé dans la BDD
        return client;
    }
}
