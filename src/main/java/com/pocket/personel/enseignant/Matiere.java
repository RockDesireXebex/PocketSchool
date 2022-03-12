package com.pocket.personel.enseignant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codeMat;
	private String intitule;
	private int coef;
	private String description;
	/**
	 * @return the codeMat
	 */
	public int getCodeMat() {
		return codeMat;
	}
	/**
	 * @return the intitule
	 */
	public String getIntitule() {
		return intitule;
	}
	/**
	 * @return the coef
	 */
	public int getCoef() {
		return coef;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param codeMat the codeMat to set
	 */
	public void setCodeMat(int codeMat) {
		this.codeMat = codeMat;
	}
	/**
	 * @param intitule the intitule to set
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	/**
	 * @param coef the coef to set
	 */
	public void setCoef(int coef) {
		this.coef = coef;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
