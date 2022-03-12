package com.pocket.personel.administratifs;

import javax.persistence.Entity;

import com.pocket.personel.Membre;
@Entity
public class DirecteurAdjoint extends MembreAdministratifs {
	
	public boolean etablirHoraireDeCours() {
		/*
		 * Quels sont les objets qui interviennent dans l'etablissement des horaires des cours
		 */
		return true;
	}
	
	public void consulterHoraireCours() {
		
	}
	
	public void consulterCours() {
		/*
		 * Consulter un cours en particulier
		 */
	}
	
	public void consulterProfil(Membre membre) {
		
	}
	
	public boolean etablirReunionPedagogique() {
		return true;
	}
	
	public void etablirProcesVerbal(){
		
	}
}
