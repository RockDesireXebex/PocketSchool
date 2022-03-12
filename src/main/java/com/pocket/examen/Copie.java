package com.pocket.examen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.pocket.inscriptionScolarite.Eleve;
@Entity
public class Copie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCopie;
	private String CopieimgUrl;
	private int note;
	@OneToOne
	@JoinColumn(name="MATRICULE")
	private Eleve eleve;
	@ManyToOne
	@JoinColumn(name="IDEXAMEN")
	private Examen examen;
	private int rang;
	private int appreciation;//On fera un embedded
}
