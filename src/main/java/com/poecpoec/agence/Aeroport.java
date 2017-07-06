/**
 * 
 */
package com.poecpoec.agence;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seme
 */
public class Aeroport
{
    /** Villes desservies par l'aéroport */
    private List<Ville> villes;
    /**
     * Nom de l'aéroport
     */
    private String nom;

    /**
     * @param villes
     * @param nom
     */
    public Aeroport(List<Ville> villes, String nom)
    {
        super();
        this.villes = villes;
        this.nom = nom;
    }
    
    /**
     * Ajoute une ville desservie par l'aéroport
     * @param ville
     */
    public void ajouterVille(Ville ville) {
        this.villes.add(ville);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Aeroport [" + (villes != null ? "villes=" + villes + ", " : "")
                + (nom != null ? "nom=" + nom : "") + "]";
    }

    /**
     * @return the villes
     */
    public List<Ville> getVilles()
    {
        return villes;
    }

    /**
     * @param villes
     *            the villes to set
     */
    public void setVilles(List<Ville> villes)
    {
        this.villes = villes;
    }

    /**
     * @param nom
     */
    public Aeroport(String nom)
    {
        super();
        this.nom = nom;
        this.villes = new ArrayList<>();
    }

    /**
     * 
     */
    public Aeroport()
    {
        super();
        this.villes = new ArrayList<>();
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

}
