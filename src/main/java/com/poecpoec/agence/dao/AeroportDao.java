package com.poecpoec.agence.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.poecpoec.agence.dao.ConnexionVoyageDao.ConnexionVoyageDaoStatic;
import com.poecpoec.agence.interfaces.IDataRecovery;
import com.poecpoec.agence.model.Aeroport;
import com.poecpoec.agence.model.Ville;

/**
 * @author Nordine
 */
public class AeroportDao implements IDataRecovery<Aeroport>
{
    // DAO utilisé
    private VilleDao villeDao;

    /**
     * Data Access Object
     */
    public AeroportDao()
    {
        // j'instancie la Dao de l'entité ville
        this.villeDao = new VilleDao();
    }

    /**
     * Retourner tous les aéroports de la BDD
     * 
     * @return Liste d'aéroports
     */
    public List<Aeroport> findAll()
    {
        List<Aeroport> aeroports = new ArrayList<>();
        try
        {
            // je récupère la connexion à la BDD
            Connection connexion = ConnexionVoyageDaoStatic.getConnexion();
            // création du statement
            Statement statement = connexion.createStatement();
            // Exécuter la requête SQL
            ResultSet resultats = statement.executeQuery("SELECT * FROM aeroport");
            // boucle de parcours des résultats
            while (resultats.next())
            {
                // je crée un aéroport vide
                Aeroport aeroport = new Aeroport();
                // je l'enrichis des données de la BDD
                aeroport.setNom(resultats.getString("nom"));
                aeroport.setIdAero(resultats.getInt("idAero"));

                // je vais chercher dans la table de lien les id des villes
                // desservies
                Statement statementVilles = connexion.createStatement();
                // requête qui renvoie la liste des villes pour un aéroport
                // donné
                ResultSet idDesVilles = statementVilles.executeQuery("SELECT idVille"
                        + " FROM aeroport_ville" + " WHERE idAero = " + aeroport.getIdAero());
                // on parcourt les id
                while (idDesVilles.next())
                {
                    // je récupère juste l'id
                    int idVille = idDesVilles.getInt("idVille");
                    // je récupère le POJO Ville grâce à villeDao par la méthode
                    // findById
                    // qui prend en paramètre l'idVille qu'on vient d'extraire
                    // du ResultSet
                    Ville ville = this.villeDao.findById(idVille);
                    // j'insère la ville dans la liste des villes desservies
                    aeroport.ajouterVille(ville);
                }

                // je l'ajoute à ma liste
                aeroports.add(aeroport);

                // fermeture du résultat
                idDesVilles.close();
                statementVilles.close();

            } // fin de la boucle de parcours des résultats du SELECT * FROM
              // aeroport

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
        // on demande la fermeture de la connexion
        ConnexionVoyageDaoStatic.closeConnexion();
        // je retourne la liste des aéroports trouvés dans la BDD
        return aeroports;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.poecpoec.agence.IAeroportDataRecovery#findById(int)
     */
    @Override
    public Aeroport findById(int id)
    {
        Aeroport aeroport = new Aeroport();
        try
        {
            // je récupère la connexion à la BDD
            Connection connexion = ConnexionVoyageDaoStatic.getConnexion();
            // création du statement
            Statement statement = connexion.createStatement();
            // Exécuter la requête SQL
            ResultSet resultats = statement
                    .executeQuery("SELECT * FROM aeroport WHERE idAero = " + id);
            // boucle de parcours des résultats
            if (resultats.next())
            {
                // je l'enrichis des données de la BDD
                aeroport.setIdAero(id);
                aeroport.setNom(resultats.getString("nom"));
                // je vais chercher dans la table de lien les id des villes
                // desservies
                Statement statementVilles = connexion.createStatement();
                // requête qui renvoie la liste des villes pour un aéroport
                // donné
                ResultSet idDesVilles = statementVilles.executeQuery(
                        "SELECT idVille" + " FROM aeroport_ville" + " WHERE idAero = " + id);
                // on parcours les id
                while (idDesVilles.next())
                {
                    // je récupère juste l'id
                    int idVille = idDesVilles.getInt("idVille");
                    // je récupère le POJO Ville grâce à villeDao par la méthode
                    // findById
                    // qui prend en paramètre l'idVille qu'on vient d'extraire
                    // du ResultSet
                    Ville ville = this.villeDao.findById(idVille);
                    // j'insère la ville dans la liste des villes desservies
                    aeroport.ajouterVille(ville);
                }

                // fermeture du résultat
                idDesVilles.close();
                statementVilles.close();
            }
            else
            {
                throw new SQLException("Aucun aéroport ne correspond à l'identifiant indiqué.");
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
        // je retourne l'aéroport trouvé dans la BDD
        return aeroport;
    }
}
