package com.pocket;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pocket.inscriptionScolarite.Eleve;
import com.pocket.inscriptionScolarite.Inscription;
import com.pocket.inscriptionScolarite.InscriptionDao;
import com.pocket.inscriptionScolarite.InscriptionServiceEM;
import com.pocket.inscriptionScolarite.Parent;
import com.pocket.patrimoine.Niveau;

import test.pocket.JpaHibernateLearning.Person;



@SpringBootApplication
public class PocketSchoolBootBackApplication {
	

	
	public static void main(String[] args) {
		SpringApplication.run(PocketSchoolBootBackApplication.class, args);
		
	}
	

}
