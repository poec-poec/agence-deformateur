/**
 * 
 */
package com.poecpoec.agence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Nordine
 *
 */
public class ConnexionVoyageDao
{

    public static class ConnexionVoyageDaoStatic
    {
        private static Connection connexion;

        // Création de la connexion à la base de données
        public static Connection getConnexion()
        {
            if (connexion == null)
            {

                try
                {
                    // Etape 1 : chargement du driver
                    Class.forName("com.mysql.jdbc.Driver");
                    // Etape 2 : création de la connexion
                    String dsn = "jdbc:mysql://localhost:3306/agence";
                    connexion = DriverManager.getConnection(dsn, "user", "password");
                }
                catch (SQLException e)
                {
                    System.out
                            .println("Impossible de charger le driver. Vérifier votre classpath.");
                }
                catch (ClassNotFoundException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            return connexion;
        }

        public static void closeConnexion()
        {
            if (connexion != null)
            {
                try
                {
                    connexion.close();
                    // La connexion peut-être fermée, mais pas null
                    connexion = null;
                }
                catch (SQLException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
