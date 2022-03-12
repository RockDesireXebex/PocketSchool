package com.pocket.inscriptionScolarite;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.pocket.personel.technique.Intendant;
@Entity
public class Pension {
	@Id
	private int idPension;
	@OneToOne(cascade=CascadeType.PERSIST)
	private Eleve eleve;
	@OneToOne(cascade=CascadeType.PERSIST)
	private Intendant intendant;
	private int sommeVersee;
	private Date DatePaiement;
	private Date DateLimite;
	/**
	 * @return the idPension
	 */
	public int getIdPension() {
		return idPension;
	}
	/**
	 * @return the eleve
	 */
	public Eleve getEleve() {
		return eleve;
	}
	/**
	 * @return the intendant
	 */
	public Intendant getIntendant() {
		return intendant;
	}
	/**
	 * @return the sommeVersee
	 */
	public int getSommeVersee() {
		return sommeVersee;
	}
	/**
	 * @return the datePaiement
	 */
	public Date getDatePaiement() {
		return DatePaiement;
	}
	/**
	 * @return the dateLimite
	 */
	public Date getDateLimite() {
		return DateLimite;
	}
	/**
	 * @param idPension the idPension to set
	 */
	public void setIdPension(int idPension) {
		this.idPension = idPension;
	}
	/**
	 * @param eleve the eleve to set
	 */
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	/**
	 * @param intendant the intendant to set
	 */
	public void setIntendant(Intendant intendant) {
		this.intendant = intendant;
	}
	/**
	 * @param sommeVersee the sommeVersee to set
	 */
	public void setSommeVersee(int sommeVersee) {
		this.sommeVersee = sommeVersee;
	}
	/**
	 * @param datePaiement the datePaiement to set
	 */
	public void setDatePaiement(Date datePaiement) {
		DatePaiement = datePaiement;
	}
	/**
	 * @param dateLimite the dateLimite to set
	 */
	public void setDateLimite(Date dateLimite) {
		DateLimite = dateLimite;
	}
	
	public void ajouterSomme(int sommme) {
		this.sommeVersee += sommme;
	}
	
}
