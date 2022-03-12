package com.pocket.personel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Caisse {
	@Id
	private int numeroCompte;
	@OneToMany
	private List<Banque> nomBanques = new ArrayList<Banque>();
	
	private int sommmeTotal;
	
	public void debiter(int somme) {
		this.sommmeTotal += somme;
	}
	
	public void retrait(int somme) {
		this.sommmeTotal -= somme;
	}

	/**
	 * @return the numeroCompte
	 */
	public int getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @return the nomBanques
	 */
	public List<Banque> getNomBanques() {
		return nomBanques;
	}

	/**
	 * @return the sommmeTotal
	 */
	public int getSommmeTotal() {
		return sommmeTotal;
	}

	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @param nomBanques the nomBanques to set
	 */
	public void setNomBanques(List<Banque> nomBanques) {
		this.nomBanques = nomBanques;
	}

	/**
	 * @param sommmeTotal the sommmeTotal to set
	 */
	public void setSommmeTotal(int sommmeTotal) {
		this.sommmeTotal = sommmeTotal;
	}
	
	
	
}
