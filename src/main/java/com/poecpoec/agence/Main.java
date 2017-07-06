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
        Aeroport cdg = new Aeroport("CDG");
        Ville paris = new Ville("Paris", "France");
        System.out.println(cdg);
        System.out.println(paris);
    }

}
