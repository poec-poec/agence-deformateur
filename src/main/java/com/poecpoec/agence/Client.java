package com.poecpoec.agence;
import java.awt.List;
import java.util.ArrayList;


public class Client {
    /** Adresse des clients */
    private List <Adresse> Adresse;
    public int id;
    private String nom;
    private String numero;
    private String Fax;
    private String email;
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    public Client(int id, String nom, String numero, String fax, String email) {
        super();
        this.id = id;
        this.nom = nom;
        this.numero = numero;
        Fax = fax;
        this.email = email;
    }

    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public List<Adresse> getAdresse() {
        return Adresse;
    }

    public void setAdresse(List<Adresse> adresse) {
        Adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
   
}
