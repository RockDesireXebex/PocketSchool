package com.pocket.controller.personel.enseignant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocket.inscriptionScolarite.Enfant;
import com.pocket.personel.enseignant.Matiere;
import com.pocket.personel.enseignant.MatiereDao;

@RestController
public class MatiereController {
	@Autowired
	MatiereDao matiereDao;
	
	/*
	 * Ajout d'une nouvelle matiere
	 */
	@PostMapping("/matiere")
	@ResponseBody
	public Matiere addMatiere(@RequestBody Matiere matiereParam) {
		
		matiereDao.save(matiereParam);
		return matiereParam;
	}
	
	/*
	 * Obtenir tous les matieres
	 */
	@GetMapping("/matieres")
	@ResponseBody
	public List<Matiere> getMatieres() {
		
		return matiereDao.findAll();
	
	}
	
	/*
	 * Obtenir une matiere
	 */
	 
	@GetMapping("/matiere/{id}")
	@ResponseBody
	public Matiere getMatiere(@PathVariable("id") int id) {
		
		return matiereDao.findById(id).get();
	
	}
	

}
