package com.pocket.inscriptionScolarite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@numCni")
public class Parent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numCni;
	private String nom;
	private String prenom;
	private String profession;
	private String adresse;
	private int telephone;
	@ManyToMany(mappedBy="parentes")
	//@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)
	//@org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	@OrderBy("name ASC")
	@JsonIgnore
	private List<Eleve> listeEnfants = new ArrayList<Eleve>();
	/**
	 * @return the numCni
	 */
	public int getNumCni() {
		return numCni;
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
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @return the telephone
	 */
	public int getTelephone() {
		return telephone;
	}
	/**
	 * @param numCni the numCni to set
	 */
	public void setNumCni(int numCni) {
		this.numCni = numCni;
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
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the listeEnfants
	 */
	public List<Eleve> getListeEnfants() {
		return listeEnfants;
	}
	/**
	 * @param listeEnfants the listeEnfants to set
	 */
	public void setListeEnfants(List<Eleve> listeEnfants) {
		this.listeEnfants = listeEnfants;
	}

	
	
	
}
