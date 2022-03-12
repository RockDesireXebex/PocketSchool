package com.pocket.patrimoine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.pocket.inscriptionScolarite.Eleve;
import com.pocket.personel.enseignant.Matiere;

@Entity
public class Niveau {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numeroNiveau;
	private String nomNiveau;
	private int prixScolarite;
	private int prixInscription;
	private int nombreEleve;
	@OneToMany
	private List<Eleve> listeEleves = new ArrayList<Eleve>();
	/*
	 * (Google classroom) chaque niveau a la liste de ses matieres
	 */
	@OneToMany(cascade=CascadeType.ALL)
	private List<Matiere> listeMatieres = new ArrayList<Matiere>();
	/**
	 * @return the numeroNiveau
	 */
	public int getNumeroNiveau() {
		return numeroNiveau;
	}
	/**
	 * @return the nomNiveau
	 */
	public String getNomNiveau() {
		return nomNiveau;
	}
	/**
	 * @return the prixScolarite
	 */
	public int getPrixScolarite() {
		return prixScolarite;
	}
	/**
	 * @return the prixInscription
	 */
	public int getPrixInscription() {
		return prixInscription;
	}
	/**
	 * @return the nombreEleve
	 */
	public int getNombreEleve() {
		return nombreEleve;
	}
	/**
	 * @return the listeEleves
	 */
	public List<Eleve> getListeEleves() {
		return listeEleves;
	}
	/**
	 * @param numeroNiveau the numeroNiveau to set
	 */
	public void setNumeroNiveau(int numeroNiveau) {
		this.numeroNiveau = numeroNiveau;
	}
	/**
	 * @param nomNiveau the nomNiveau to set
	 */
	public void setNomNiveau(String nomNiveau) {
		this.nomNiveau = nomNiveau;
	}
	/**
	 * @param prixScolarite the prixScolarite to set
	 */
	public void setPrixScolarite(int prixScolarite) {
		this.prixScolarite = prixScolarite;
	}
	/**
	 * @param prixInscription the prixInscription to set
	 */
	public void setPrixInscription(int prixInscription) {
		this.prixInscription = prixInscription;
	}
	/**
	 * @param nombreEleve the nombreEleve to set
	 */
	public void setNombreEleve(int nombreEleve) {
		this.nombreEleve = nombreEleve;
	}
	/**
	 * @param listeEleves the listeEleves to set
	 */
	public void setListeEleves(List<Eleve> listeEleves) {
		this.listeEleves = listeEleves;
	}
	/**
	 * @return the listeMatieres
	 */
	public List<Matiere> getListeMatieres() {
		return listeMatieres;
	}
	/**
	 * @param listeMatieres the listeMatieres to set
	 */
	public void setListeMatieres(List<Matiere> listeMatieres) {
		this.listeMatieres = listeMatieres;
	}
	
	
	
	
}
