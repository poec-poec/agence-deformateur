/**
 * 
 */
package com.poecpoec.agence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Seme
 *
 */
public class Main
{

    /**
     * @param args
     * @throws ClassNotFoundException 
     * @throws SQLException 
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        // Etape 1 : chargement du driver
        Class.forName("com.mysql.jdbc.Driver");
        // Etape 2 : création de la connexion
        String dsn = "jdbc:mysql://localhost:3306/agence";
        Connection connexion = DriverManager.getConnection(dsn, "user", "password");
        
    }

}
