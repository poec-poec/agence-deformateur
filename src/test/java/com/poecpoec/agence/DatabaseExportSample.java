/**
 * 
 */
package com.poecpoec.agence;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;

/**
 * @author Seme
 *
 */
public class DatabaseExportSample
{
    public static void main(String[] args) throws Exception
    {
        // database connection
        Class.forName("com.mysql.jdbc.Driver");
        Connection jdbcConnection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/agence", "user", "password");
        IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);

        // full database export
        IDataSet fullDataSet = connection.createDataSet();
        FlatXmlDataSet.write(fullDataSet, new FileOutputStream("src/main/resources/full.xml"));

    }
}