/**
 * 
 */
package com.poecpoec.agence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Seme
 */
public class AeroportDao implements IAeroportDataRecovery
{

    /**
     * Data Access Object
     */
    public AeroportDao()
    {
        // TODO Auto-generated constructor stub
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
            // Etape 1 : chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            // Etape 2 : création de la connexion
            String dsn = "jdbc:mysql://localhost:3306/agence";
            Connection connexion = DriverManager.getConnection(dsn, "user",
                    "password");
            // Etape 3 : création du statement
            Statement statement = connexion.createStatement();
            // Etape 4 : Exécuter la requête SQL
            ResultSet resultats = statement
                    .executeQuery("SELECT * FROM aeroport");
            // Etape 5 : boucle de parcours des résultats
            while (resultats.next())
            {
                // je crée un aéroport vide
                Aeroport aeroport = new Aeroport();
                aeroport.setNom(resultats.getString("nom"));
                // je l'ajoute à ma liste
                aeroports.add(aeroport);
            }
            // Etape 6 : fermer le résultat
            resultats.close();
            // Etape 7 : fermer le statement
            statement.close();
            // Etape 8 : fermer la connexion
            connexion.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(
                    "Impossible de charger le driver. Vérifier votre classpath.");
        }
        catch (SQLException e)
        {
            System.out.println("Erreur SQL. Voir ci-après.");
            System.out.println(e.getMessage());
        }
        // je retourne la liste des aéroports trouvés dans la BDD
        return aeroports;

    }

}
