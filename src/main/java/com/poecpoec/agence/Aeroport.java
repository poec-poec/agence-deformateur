/**
 * 
 */
package com.poecpoec.agence;

/**
 * @author Seme
 *
 */
public class Aeroport
{
    private String nom;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Aeroport [" + (nom != null ? "nom=" + nom : "") + "]";
    }

    /**
     * @param nom
     */
    public Aeroport(String nom)
    {
        super();
        this.nom = nom;
    }

    /**
     * 
     */
    public Aeroport()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

}
