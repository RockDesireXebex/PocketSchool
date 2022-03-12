package com.pocket.patrimoine;

import com.pocket.personel.*;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
//@Entity
public class Achat {
	//@Id
	private int idAchat;
	
	private BienConsommation bienConsommation;
	private Caisse caisseUsed;
	private Date dateAchat;
	private int Qte;
}
