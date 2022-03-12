package com.pocket.examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sequence {
	@Id
	private int numeroSequence;
	@ManyToOne
	private Trimestre trimestre;
	@OneToMany(mappedBy="sequence")
	private List<SequenceNiveau> examens = new ArrayList<SequenceNiveau>();
	private int tauxReussite;
	private int tauxEchecs;
	//Preciser les periodes
	private Date dateDebut;
	private Date dateFin;
	/**
	 * @return the numeroSequence
	 */
	public int getNumeroSequence() {
		return numeroSequence;
	}
	/**
	 * @return the trimestre
	 
	public Trimestre getTrimestre() {
		return trimestre;
	}
	*/
	
	/**
	 * @return the examens
	 
	public List<Examen> getExamens() {
		return examens;
	}
	
	*/
	/**
	 * @return the tauxReussite
	 
	public int getTauxReussite() {
		return tauxReussite;
	}
	*/
	/**
	 * @return the tauxEchecs
	 */
	public int getTauxEchecs() {
		return tauxEchecs;
	}
	/**
	 * @param numeroSequence the numeroSequence to set
	 
	public void setNumeroSequence(int numeroSequence) {
		this.numeroSequence = numeroSequence;
	}
	
	*/
	/**
	 * @param trimestre the trimestre to set
	 
	public void setTrimestre(Trimestre trimestre) {
		this.trimestre = trimestre;
	}
	
	*/
	/**
	 * @param examens the examens to set
	 
	public void setExamens(List<Examen> examens) {
		this.examens = examens;
	}
	
	*/
	/**
	 * @param tauxReussite the tauxReussite to set
	 */
	public void setTauxReussite(int tauxReussite) {
		this.tauxReussite = tauxReussite;
	}
	/**
	 * @param tauxEchecs the tauxEchecs to set
	 */
	public void setTauxEchecs(int tauxEchecs) {
		this.tauxEchecs = tauxEchecs;
	}
	
	
	
	
}
