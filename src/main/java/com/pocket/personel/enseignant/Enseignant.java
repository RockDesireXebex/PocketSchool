package com.pocket.personel.enseignant;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.pocket.examen.Epreuve;
import com.pocket.personel.Membre;
@Entity
public class Enseignant extends Membre{
	@OneToMany
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	//Preciser la liste des matieres qu'il enseigne
	@OneToMany
	private List<Matiere> matieres = new ArrayList<Matiere>();
	
}
