package com.pocket.inscriptionScolarite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface InscriptionDao extends JpaRepository<Inscription,Integer> {
	
}
