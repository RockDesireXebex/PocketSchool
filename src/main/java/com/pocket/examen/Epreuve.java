package com.pocket.examen;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.pocket.personel.enseignant.Enseignant;
import com.pocket.personel.enseignant.Matiere;
@Entity
public class Epreuve {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String idEpreuve;
	private String imageURL;
	@ManyToOne
	@JoinColumn(name="MATIERE_ID")
	private Matiere matiere;
	@OneToMany
	private List<Enseignant> concepteurs = new ArrayList<Enseignant>();
	private int duree;
	private int noteMax;
}
