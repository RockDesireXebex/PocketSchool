package com.pocket.inscriptionScolarite;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;

import com.pocket.patrimoine.Niveau;

@Entity
@AttributeOverride(
	  name="numAN",
	  column=@Column(name="matricule"))
public class Eleve extends Enfant{
	@ManyToOne
	private Niveau niveau;
	/**
	 * @return the niveau
	 */
	public Niveau getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	
	
	
}
