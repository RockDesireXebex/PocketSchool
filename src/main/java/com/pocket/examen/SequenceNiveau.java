package com.pocket.examen;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.pocket.patrimoine.Niveau;
@Entity
public class SequenceNiveau {
	/*
	 * Ici seront stocke les elements statistiques
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numNiveau;
	@OneToOne
	private Niveau niveau;
	private int tauxReussite;
	private int tauxEchecs;
	@ManyToOne
	private Sequence sequence;
	@OneToMany
	private List<Examen> listeExamsDeChaqMatDuNiv = new ArrayList<Examen>();
	
}
