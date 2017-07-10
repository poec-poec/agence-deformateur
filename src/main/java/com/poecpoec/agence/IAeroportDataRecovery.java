/**
 * 
 */
package com.poecpoec.agence;

import java.util.List;

/**
 * @author Seme
 */
public interface IAeroportDataRecovery
{
    /**
     * Retourne tous les objets métier de la BDD de type aéroport
     * 
     * @return La liste des BO
     */
    public abstract List<Aeroport> findAll();

    /**
     * Retourne un objet métier, cad un aéroport
     * 
     * @param id
     *            L'identifiant de l'aéroport
     * @return L'aéroport de la BDD qui possède l'id passé
     *         en paramètre.
     */
    public abstract Aeroport findById(int id);
}
