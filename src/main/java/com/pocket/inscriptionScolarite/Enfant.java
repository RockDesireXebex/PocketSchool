package com.pocket.inscriptionScolarite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
/*
 * Je ne pense pas que le systeme devrai persister les objets enfants, car il aura l'impression d'etre une garderie q'une ecole, mais il doit gerer la classe enfant malgre tout
 * car c'est le tout premier element qui entre dans le systeme
 * Ce que l'on peut faire c'est conserver la classe enfant et faire de lui une mappedSuperclass
 */

@MappedSuperclass
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@numAN")
public class Enfant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int numAN;
	protected String nomEtatCivil;
	protected String anPicture;
	protected String enfantPicture;
	protected String nom;
	protected String prenom;
	protected String sexe;
	@Temporal(TemporalType.DATE)
	protected Date dateNaissance;
	protected String lieuNaissance;
	@ManyToMany(cascade=CascadeType.ALL)
	//@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)
	//@org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	@JoinTable(name = "enfant_parent",
			joinColumns = { @JoinColumn(name = "numAN")},
			inverseJoinColumns = { @JoinColumn(name = "numCni")})
	protected List<Parent> parentes = new ArrayList<Parent>();
	/**
	 * @return the numAN
	 */
	public int getNumAN() {
		return numAN;
	}
	/**
	 * @return the nomEtatCivil
	 */
	public String getNomEtatCivil() {
		return nomEtatCivil;
	}
	/**
	 * @return the anPicture
	 */
	public String getAnPicture() {
		return anPicture;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @return the lieuNaissance
	 */
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	
	/**
	 * @param numAN the numAN to set
	 */
	public void setNumAN(int numAN) {
		this.numAN = numAN;
	}
	/**
	 * @param nomEtatCivil the nomEtatCivil to set
	 */
	public void setNomEtatCivil(String nomEtatCivil) {
		this.nomEtatCivil = nomEtatCivil;
	}
	/**
	 * @param anPicture the anPicture to set
	 */
	public void setAnPicture(String anPicture) {
		this.anPicture = anPicture;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @param lieuNaissance the lieuNaissance to set
	*/ 
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	
	/**
	 * @return the parentes
	 */
	public List<Parent> getParentes() {
		return parentes;
	}
	
	
	/**
	 * @param parentes the parentes to set
	 */
	public void setParentes(List<Parent> parentes) {
		this.parentes = parentes;
	}
	/**
	 * @return the enfantPicture
	 */
	public String getEnfantPicture() {
		return enfantPicture;
	}
	/**
	 * @param enfantPicture the enfantPicture to set
	 */
	public void setEnfantPicture(String enfantPicture) {
		this.enfantPicture = enfantPicture;
	}
	
	

	
	
	
	
	
}
