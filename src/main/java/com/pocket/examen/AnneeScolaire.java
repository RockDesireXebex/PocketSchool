package com.pocket.examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.pocket.personel.administratifs.DirecteurAdjoint;


@Entity
public class AnneeScolaire {
	@Id
	private String idAnneeScolaire;
	@OneToOne
	private DirecteurAdjoint directeurAdjoint;
	@OneToMany(mappedBy="anneeScolaire")
	private List<Trimestre> trimestres = new ArrayList<Trimestre>();//les trois trimestres(les stats de tous l'etablissements)
	private int tauxReussite;
	private int tauxEchecs;
	/*
	 * On s'assurera que l'on ne pourra pas planifier des activites hors de la plage reserver
	 */
	private Date dateDebut;
	private Date dateFin;
	
}
