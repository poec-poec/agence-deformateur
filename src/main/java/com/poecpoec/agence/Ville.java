/**
 * 
 */
package com.poecpoec.agence;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seme
 */
public class Ville
{
    private List<Aeroport> aeroportDesservis;
    private String nom;
    private String pays;

    /**
     * 
     */
    public Ville()
    {
        this.aeroportDesservis = new ArrayList<>();
    }

    /**
     * @param nom
     * @param pays
     */
    public Ville(String nom, String pays)
    {
        super();
        this.nom = nom;
        this.pays = pays;
        this.aeroportDesservis = new ArrayList<>();
    }

    /**
     * @param nom
     * @param pays
     * @param aeroportDesservis
     */
    public Ville(String nom, String pays, List<Aeroport> aeroportDesservis)
    {
        super();
        this.nom = nom;
        this.pays = pays;
        this.aeroportDesservis = aeroportDesservis;
    }

    public void ajouterAeroport(Aeroport aeroport) {
        this.aeroportDesservis.add(aeroport);
    }
    
    /**
     * @return the aeroportDesservis
     */
    public List<Aeroport> getAeroportDesservis()
    {
        return aeroportDesservis;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @return the pays
     */
    public String getPays()
    {
        return pays;
    }

    /**
     * @param aeroportDesservis
     *            the aeroportDesservis to set
     */
    public void setAeroportDesservis(List<Aeroport> aeroportDesservis)
    {
        this.aeroportDesservis = aeroportDesservis;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @param pays
     *            the pays to set
     */
    public void setPays(String pays)
    {
        this.pays = pays;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Ville [" + (nom != null ? "nom=" + nom + ", " : "")
                + (pays != null ? "pays=" + pays + ", " : "")
                + (aeroportDesservis != null
                        ? "aeroportDesservis=" + aeroportDesservis
                        : "")
                + "]";
    }

}
