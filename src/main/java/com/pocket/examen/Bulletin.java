package com.pocket.examen;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.pocket.inscriptionScolarite.Eleve;
@Entity
public class Bulletin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numeroBulletin;
	@OneToOne
	private Eleve eleve;
	@OneToMany(mappedBy="bulletin")
	private List<TrimestreBulletin> trimestreBulletins = new ArrayList<TrimestreBulletin>();
	private long moyenneAnnuelle;
	private int rangAnnuelle;
	private int appreciation;
	private int decision;
	//Inclure plus tard l'appreciation de conduite a travers la gestion de carnet de liaison
}
