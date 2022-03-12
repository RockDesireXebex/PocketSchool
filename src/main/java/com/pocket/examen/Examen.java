package com.pocket.examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.pocket.inscriptionScolarite.Eleve;
import com.pocket.patrimoine.Niveau;
import com.pocket.patrimoine.Salle;
import com.pocket.personel.enseignant.Enseignant;
import com.pocket.personel.enseignant.Matiere;
import com.pocket.personel.enseignant.Surveillant;
@Entity
public class Examen {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String idExamen;
	@Temporal(TemporalType.DATE)
	private Date DateExamen;
	private int heureDebut;
	private int heureFin;
	@OneToMany
	private List<Salle> sallesExamen = new ArrayList<Salle>();
	@OneToOne
	private Matiere matiereConcerne;
	@OneToOne
	private Niveau niveau;
	@OneToOne
	private Enseignant enseignantResponsable;
	@OneToMany
	private List<Surveillant> surveillants = new ArrayList<Surveillant>();
	@OneToMany
	private List<Copie> copies = new ArrayList<Copie>();
	@OneToMany
	private List<Eleve> elevesPresents = new ArrayList<Eleve>();
	@ManyToOne
	private SequenceNiveau sequenceNiveau;
	@OneToOne
	private Epreuve epreuve;
	//Mettre les elements statistique
	//@ManyToOne
	//private SequenceNiveau sequenceNiveau;
	
	public void afficherListePresence() {
		
	}
	
}
