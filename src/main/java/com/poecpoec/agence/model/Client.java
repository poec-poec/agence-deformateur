/**
 * 
 */
package com.poecpoec.agence.model;

/**
 * @author Administrateur
 *
 */
public class Client {

	private int id;
	private String nom;
	private String numeroTel;
	private String numeroFax;
	private String email;
	/**
	 * L'adresse du client. Relation unidirectionnelle binaire de cardinalité 1..1
	 */
	private Adresse adresse;

	/**
	 * 
	 */
	public Client() {
		// this.adresse = adresse;
	}

	// Les getters et les setters.
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the numeroTel
	 */
	public String getNumeroTel() {
		return numeroTel;
	}

	/**
	 * @param numeroTel
	 *            the numeroTel to set
	 */
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	/**
	 * @return the numeroFax
	 */
	public String getNumeroFax() {
		return numeroFax;
	}

	/**
	 * @param numeroFax
	 *            the numeroFax to set
	 */
	public void setNumeroFax(String numeroFax) {
		this.numeroFax = numeroFax;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", numeroTel=" + numeroTel + ", email=" + email + ", adresse="
				+ adresse + "]";
	}

}
