package com.pocket.patrimoine;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salle extends BienDurable {
	//Cle composee
	private int numeroSalle;
	private String EtiquetteActuelle;
	private int capacite;//nbre de place
	private boolean Etat;//Occupee ou pas
	//private int[] tableauOccupation;
	
	public boolean AffecterEvenement() {
		return true;
	}
	
	public boolean libre(Date jour, int heure) {
		return true;
	}
	
}
