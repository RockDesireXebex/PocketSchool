package com.pocket.personel.administratifs;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.pocket.personel.Membre;
@Entity
public class Directeur extends MembreAdministratifs {
	
	public void consulterProfilMembre(Membre membre) {
		
	}
	
	public boolean promotionMembre(Membre membre) {
		return true;
	}
	
	public void listePosteVacant() {
		
	}
	
	public boolean retrogration(Membre membre) {
		return true;
	}
	
	public boolean licenciement(Membre membre) {
		return true;
	}
	
	public void consulterOrganigramme() {
		
	}
	
	public boolean mutation(Membre membre) {
		return true;
	}
	
	public boolean transfert(Membre membre) {
		return true;
	}

}
