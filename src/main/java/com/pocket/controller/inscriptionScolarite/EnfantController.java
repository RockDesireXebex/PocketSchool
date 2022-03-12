package com.pocket.controller.inscriptionScolarite;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocket.inscriptionScolarite.Enfant;
import com.pocket.inscriptionScolarite.EnfantDao;

@RestController
@CrossOrigin("*")
public class EnfantController {
	
	@Autowired
	EnfantDao enfantDao;
	
	/*
	 * Ajout d'un nouveau membre
	 */
	@PostMapping("/enfant")
	@ResponseBody
	public Enfant addEnfant(@RequestBody Enfant enfantParam) {
		
		enfantDao.save(enfantParam);
		return enfantParam;
	}
	
	/*
	 * Obtenir tous les enfants
	 */
	@GetMapping("/enfants")
	@ResponseBody
	public List<Enfant> getEnfants() {
		
		return enfantDao.findAll();
	
	}
	
	/*
	 * Obtenir un enfant
	 */
	 
	@GetMapping("/enfant/{id}")
	@ResponseBody
	public Optional<Enfant> getEnfant(@PathVariable("id") int id) {
		
		return enfantDao.findById(id);
	
	}
	
	
	
}


