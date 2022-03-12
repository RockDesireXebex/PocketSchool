package com.pocket.personel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MembreRepository extends JpaRepository<Membre,Integer> {
	
}
