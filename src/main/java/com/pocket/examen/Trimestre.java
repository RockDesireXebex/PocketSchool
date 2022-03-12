package com.pocket.examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Trimestre {
	@Id
	private int numeroTrimeste;
	@ManyToOne
	private AnneeScolaire anneeScolaire;
	@OneToMany(mappedBy="trimestre")
	private List<Sequence> sequences = new ArrayList<Sequence>();
	private int tauxReussite;
	private int tauxEchecs;
	
	//Preciser les dates de debuts et de fin
	private Date dateDebut;
	private Date dateFin;
}
