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


        // j'ai besoin du DAO, alors je l'instancie
        AeroportDao aeroportDao = new AeroportDao();
        // j'appelle la méthode pour récupérer tous les objets de classe
        // Aéroport de la BDD à l'aide du DAO Aéroport
        aeroports = aeroportDao.findAll();
        

        // j'affiche mes aéroports
        System.out.println(aeroports);

    }

}
