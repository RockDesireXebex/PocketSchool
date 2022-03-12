package com.pocket.examen;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class TrimestreBulletin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idTrimestre;
	@ManyToOne
	private Bulletin bulletin;
	@OneToMany(mappedBy="trimestreBulletin")
	private List<SequenceBulletin> sequenceBulletins = new ArrayList<SequenceBulletin>();
	private int numeroTrimestre;
	private int moyenneTrimestre;
	private int rangTrimestre;
	private int appreciation;
	//Inclure plus tard l'appreciation de conduite
	/**
	 * @return the bulletin
	 
	public Bulletin getBulletin() {
		return bulletin;
	}
	
	*/
	/**
	 * @return the numeroTrimestre
	 */
	public int getNumeroTrimestre() {
		return numeroTrimestre;
	}
	/**
	 * @return the moyenneTrimestre
	 */
	public int getMoyenneTrimestre() {
		return moyenneTrimestre;
	}
	/**
	 * @return the rangTrimestre
	 */
	public int getRangTrimestre() {
		return rangTrimestre;
	}
	/**
	 * @param bulletin the bulletin to set
	 
	public void setBulletin(Bulletin bulletin) {
		this.bulletin = bulletin;
	}
	
	*/
	/**
	 * @param numeroTrimestre the numeroTrimestre to set
	 */
	public void setNumeroTrimestre(int numeroTrimestre) {
		this.numeroTrimestre = numeroTrimestre;
	}
	/**
	 * @param moyenneTrimestre the moyenneTrimestre to set
	 */
	public void setMoyenneTrimestre(int moyenneTrimestre) {
		this.moyenneTrimestre = moyenneTrimestre;
	}
	/**
	 * @param rangTrimestre the rangTrimestre to set
	 */
	public void setRangTrimestre(int rangTrimestre) {
		this.rangTrimestre = rangTrimestre;
	}
	
	
}
