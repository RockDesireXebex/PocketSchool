package com.pocket.personel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numBanque;
	private String nomBanque;
	private int dette;
	

}
