package com.pocket.inscriptionScolarite;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("InscriptionServiceEM")
@Repository

public class InscriptionServiceEM {
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void insert(Inscription inscription) {
		em.persist(inscription);
	}
	/*
	@NamedQuery(query = "select u fro")
	public List<Inscription> findAll(){
		Query query = em.createNamedQuery("",Inscription.class);
		return query.getResultList();
	}
	*/
}
