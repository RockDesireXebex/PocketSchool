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
public class SequenceBulletin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sequenceId;
	@ManyToOne
	private TrimestreBulletin trimestreBulletin;
	@OneToMany
	private List<Copie> copiesEleve = new ArrayList<Copie>();
	private int numeroSequence;
	private int moyenneSequence;
	private int rangSequence;
	private int appreciation;

	/**
	 * @return the trimestreBulletin
	 */
	public TrimestreBulletin getTrimestreBulletin() {
		return trimestreBulletin;
	}
	/**
	 * @return the numeroSequence
	 */
	public int getNumeroSequence() {
		return numeroSequence;
	}
	/**
	 * @return the moyenneSequence
	 */
	public int getMoyenneSequence() {
		return moyenneSequence;
	}
	/**
	 * @return the rangSequence
	 */
	public int getRangSequence() {
		return rangSequence;
	}
	/**
	 * @param trimestreBulletin the trimestreBulletin to set
	 
	public void setTrimestreBulletin(TrimestreBulletin trimestreBulletin) {
		this.trimestreBulletin = trimestreBulletin;
	}
	
	*/
	/**
	 * @param numeroSequence the numeroSequence to set
	 
	public void setNumeroSequence(int numeroSequence) {
		this.numeroSequence = numeroSequence;
	}
	
	*/
	/**
	 * @param moyenneSequence the moyenneSequence to set
	 
	public void setMoyenneSequence(int moyenneSequence) {
		this.moyenneSequence = moyenneSequence;
	}
	
	*/
	/**
	 * @param rangSequence the rangSequence to set
	 
	public void setRangSequence(int rangSequence) {
		this.rangSequence = rangSequence;
	}
	
	*/
	
	
}
