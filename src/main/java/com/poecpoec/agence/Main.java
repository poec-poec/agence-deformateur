/**
 * 
 */
package com.poecpoec.agence;



/**
 * @author Seme
 *
 */
public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Tests unitaires itération #1
         */
        System.out.println("Test it#1");
        Aeroport cdg = new Aeroport("CDG");
        Ville paris = new Ville("Paris", "France");
        System.out.println(cdg);
        System.out.println(paris);
        
        /*
         * UT it#2
         */
        System.out.println("Test it#2");
        cdg.ajouterVille(paris);
        System.out.println(cdg);
    }

}
