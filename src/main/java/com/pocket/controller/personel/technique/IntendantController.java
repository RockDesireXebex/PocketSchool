package com.pocket.controller.personel.technique;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocket.personel.technique.Intendant;
import com.pocket.personel.technique.IntendantDao;


@RestController
public class IntendantController {
	
	@Autowired
	IntendantDao intendantDao;

	
	/*
	 * Ajout d'un nouvel intendant
	 */
	@PostMapping("/intendant")
	@ResponseBody
	public Intendant addIntendant(@RequestBody Intendant intendantParam) {
		
		
		intendantDao.save(intendantParam);

		return intendantParam;
	}
	
	/*
	 * Obtenir tous les intendants
	 */
	@GetMapping("/intendants")
	@ResponseBody
	public List<Intendant> getIntendants() {
		
		return intendantDao.findAll();
	
	}
	
	/*
	 * Obtenir un intendant
	 */
	 
	@GetMapping("/intendant/{id}")
	@ResponseBody
	public Optional<Intendant> getIntendant(@PathVariable("id") int id) {
		
		return intendantDao.findById(id);
	
	}
	
	
	
}


