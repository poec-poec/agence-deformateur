/**
 * 
 */
package com.poecpoec.agence;

/**
 * @author Seme
 *
 */
public class Ville
{
    private String nom;
    private String pays; 
    /**
     * 
     */
    public Ville()
    {
        // TODO Auto-generated constructor stub
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
    /**
     * @return the pays
     */
    public String getPays()
    {
        return pays;
    }
    /**
     * @param pays the pays to set
     */
    public void setPays(String pays)
    {
        this.pays = pays;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Ville [" + (nom != null ? "nom=" + nom + ", " : "")
                + (pays != null ? "pays=" + pays : "") + "]";
    }

    
    
}
