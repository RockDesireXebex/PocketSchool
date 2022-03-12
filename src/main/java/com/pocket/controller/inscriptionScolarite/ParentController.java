package com.pocket.controller.inscriptionScolarite;

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

import com.pocket.inscriptionScolarite.Enfant;
import com.pocket.inscriptionScolarite.EnfantDao;
import com.pocket.inscriptionScolarite.Parent;
import com.pocket.inscriptionScolarite.ParentDao;

@RestController
public class ParentController {
	
	@Autowired
	ParentDao parentDao;
	@Autowired
	EnfantDao enfantDao;
	
	
	/*
	 * Ajout d'un nouveau parent
	 */
	@PostMapping("/parent")
	@ResponseBody
	public Parent addParent(@RequestBody Parent parentParam) {
		
		
		parentDao.save(parentParam);

		return parentParam;
	}
	
	/*
	 * Obtenir tous les membres
	 */
	@GetMapping("/parents")
	@ResponseBody
	public List<Parent> getParents() {
		
		return parentDao.findAll();
	
	}
	
	/*
	 * Obtenir un membre
	 */
	 
	@GetMapping("/parent/{id}")
	@ResponseBody
	public Optional<Parent> getParent(@PathVariable("id") int id) {
		
		return parentDao.findById(id);
	
	}
	
	
	
}

