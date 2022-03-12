package com.pocket.personel.technique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IntendantDao extends JpaRepository<Intendant,Integer> {
	
}