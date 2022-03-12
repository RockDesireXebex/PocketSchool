package com.pocket.inscriptionScolarite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EnfantDao extends JpaRepository<Enfant,Integer> {
	
}
