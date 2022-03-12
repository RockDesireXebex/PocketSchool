package com.pocket.controller.inscriptionScolarite;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocket.inscriptionScolarite.Eleve;
import com.pocket.inscriptionScolarite.EleveDao;

@RestController
public class EleveController {
	
	@Autowired
	EleveDao eleveDao;
	
	/*
	 * Ajout d'un nouveau membre
	 */
	@PostMapping("/eleve")
	@ResponseBody
	public Eleve addEleve(@RequestBody Eleve eleveParam) {
		
		eleveDao.save(eleveParam);
		return eleveParam;
	}
	
	/*
	 * Obtenir tous les membres
	 */
	@GetMapping("/eleve")
	@ResponseBody
	public List<Eleve> getEleves() {
		
		return eleveDao.findAll();
	
	}
	
	/*
	 * Obtenir un membre
	 */
	 
	@GetMapping("/eleve/{id}")
	@ResponseBody
	public Optional<Eleve> getEleve(@PathVariable("id") int id) {
		
		return eleveDao.findById(id);
	
	}
	
	
	
}


