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
public class Main
{

    /**
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        /*
         * Tests unitaires itération #1
         */
        System.out.println("Test it#1");
        Aeroport cdg = new Aeroport("CDG");
        Ville paris = new Ville("Paris", "France");
        Ville londres = new Ville("Londres", "UK");
        System.out.println(cdg);
        System.out.println(paris);

        /*
         * UT it#2
         */
        System.out.println("Test it#2");
        cdg.ajouterVille(paris);
        cdg.ajouterVille(londres);
        System.out.println(cdg);

        /*
         * UT it#3
         */
        System.out.println("Test it#3");
        System.out.println(paris);

        /*
         * UT it#4 : test de la connexion à la BDD
         */
        // déclaration des variables
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
            System.out.println("Impossible de charger le driver. Vérifier votre classpath.");
        }
        catch (SQLException e)
        {
            System.out.println("Erreur SQL. Voir ci-après.");
            System.out.println(e.getMessage());
        }

        // j'affiche mes aéroports
        System.out.println(aeroports);

    }

}
