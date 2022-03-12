package com.pocket.inscriptionScolarite;

import java.time.LocalDateTime;
import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import com.pocket.patrimoine.Niveau;
import com.pocket.personel.technique.Intendant;

@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idInscription;
	@OneToOne(cascade=CascadeType.ALL)
	private Eleve eleve;
	//On n'a besoin de savoir a quel niveau l'enfant sera inscrit, pour creer l'objet eleve, et n'a pas besoin d'etre cascader
	@OneToOne
	private Niveau niveauEnfant;
	@OneToOne
	private Parent parentI;// Le parent n'a pas besoin d'etre cascade a nouveau, car il est deja present dans le systeme avec son compte
	/*
	 * Seul l'identifiant du parent sera enregistrer qui fera reference au parent deja present dans la base :
	 * On recuperera son id, puis l'on enregistra dans la base
	 */
	/**
	 * Ici le systeme jouera le role d'intendant
	 */
	private LocalDateTime datePaiement;
	/*
	 * Il faudra ici un moyen de paiement de l'inscription, qui incrementera automatiquement le compte bancaire qui contient les sommmes de toutes les inscriptions
	 * Dont il faut imperativement le liee a un compte qui incrementera sa valeur a chaque nouvelle inscription
	 */
	@Transient
	private static Date dateLimite;

	/**
	 * @return the idInscription
	 */
	public int getIdInscription() {
		return idInscription;
	}

	/**
	 * @return the parentI
	 */
	public Parent getParentI() {
		return parentI;
	}

	/**
	 * @return the datePaiement
	 */
	public LocalDateTime getDatePaiement() {
		return datePaiement;
	}
	/**
	 * @return the dateLimite
	 */
	public static Date getDateLimite() {
		return dateLimite;
	}
	/**
	 * @param idInscription the idInscription to set
	 */
	public void setIdInscription(int idInscription) {
		this.idInscription = idInscription;
	}
	/**
	 * @param parentI the parentI to set
	 */
	public void setParentI(Parent parentI) {
		this.parentI = parentI;
	}

	/**
	 * @param localDateTime the datePaiement to set
	 */
	public void setDatePaiement(LocalDateTime localDateTime) {
		this.datePaiement = localDateTime;
	}
	/**
	 * @param dateLimite the dateLimite to set
	 */
	public static void setDateLimite(Date dateLimite) {
		Inscription.dateLimite = dateLimite;
	}
	/**
	 * @return the niveauEnfant
	 */
	public Niveau getNiveauEnfant() {
		return niveauEnfant;
	}
	/**
	 * @param niveauEnfant the niveauEnfant to set
	 */
	public void setNiveauEnfant(Niveau niveauEnfant) {
		this.niveauEnfant = niveauEnfant;
	}

	/**
	 * @return the eleve
	 */
	public Eleve getEleve() {
		return eleve;
	}

	/**
	 * @param eleve the eleve to set
	 */
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	
	 @PrePersist
     void onCreate() {
		 this.setDatePaiement(LocalDateTime.now());
	 }
	 @PreUpdate
	 void onUpdate() {
		 this.setDatePaiement(LocalDateTime.now());
	 }
	
	
}
