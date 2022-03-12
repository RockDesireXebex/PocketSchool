package com.pocket.controller.patrimoine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocket.patrimoine.Niveau;
import com.pocket.patrimoine.NiveauDao;
import com.pocket.personel.enseignant.Matiere;

@RestController
@CrossOrigin("*")
public class NiveauController {
	@Autowired
	NiveauDao niveauDao;
	
	/*
	 * Ajout d'une nouvelle matiere
	 */
	@PostMapping("/niveau")
	@ResponseBody
	public Niveau addNiveau(/*@RequestBody Niveau niveauParam*/) {
		
		return null;
	}
	
	/*
	 * Obtenir tous les matieres
	 */
	@GetMapping("/niveaux")
	@ResponseBody
	public List<Niveau> getNiveaux() {
		
		return niveauDao.findAll();
	
	}
	
	/*
	 * Obtenir une matiere
	 */
	 
	@GetMapping("/niveau/{id}")
	@ResponseBody
	public Niveau getNiveau(@PathVariable("id") int id) {
		
		return niveauDao.findById(id).get();
	
	}
}
