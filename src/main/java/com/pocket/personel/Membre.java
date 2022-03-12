package com.pocket.personel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Membre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private String sexe;
	private Date dateNaissance;
	private String adresse;
	private String status;//En activite, en conge, licencie, etc
	private int salaire;
	private Date anneeRecrutement;
	
	public boolean envoyerMessage(Membre membre) {
		return true;
	}
	public boolean envoyerRapport(Membre membre) {
		return true;
	}
	
	public boolean miseEnDisponibilite() {
		return true;
	}
	
	public boolean demission() {
		return true;
	}
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @return the salaire
	 */
	public int getSalaire() {
		return salaire;
	}
	/**
	 * @return the anneeRecrutement
	 */
	public Date getAnneeRecrutement() {
		return anneeRecrutement;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(int salaire) {
		this.salaire = salaire;
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
	 * @param anneeRecrutement the anneeRecrutement to set
	 */
	public void setAnneeRecrutement(Date anneeRecrutement) {
		this.anneeRecrutement = anneeRecrutement;
	}
	@Override
	public String toString() {
		return "Membre [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ", status=" + status + ", salaire=" + salaire + ", anneeRecrutement="
				+ anneeRecrutement + "]";
	}

	
}
