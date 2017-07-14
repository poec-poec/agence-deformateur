package com.poecpoec.agence.model;

/**
 * Classe métier ou Objet métier ou PlainOldJavaObject
 * 
 * @author Administrateur
 *
 */
public class Adresse
{

    // Attributs
    private String adresse;
    private String codePostal;
    private int    id;
    private String pays;
    private String ville;

    // Getters(accesseurs) et Setters(mutateurs)
    public String getAdresse()
    {
        return this.adresse;
    }

    public String getCodePostal()
    {
        return this.codePostal;
    }

    public int getId()
    {
        return this.id;
    }

    public String getPays()
    {
        return this.pays;
    }

    public String getVille()
    {
        return this.ville;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public void setCodePostal(String codePostal)
    {
        this.codePostal = codePostal;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setPays(String pays)
    {
        this.pays = pays;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    @Override
    public String toString()
    {
        return "Adresse ID " + this.id + " : " + this.adresse + " " + this.codePostal + " - "
                + this.ville + " [" + this.pays + "]";
    }

}
