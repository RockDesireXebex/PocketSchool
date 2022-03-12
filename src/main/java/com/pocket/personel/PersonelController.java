package com.pocket.personel;

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

@RestController
public class PersonelController {
	
	@Autowired
	MembreRepository memRepo;
	
	/*
	 * Ajout d'un nouveau membre
	 */
	@PostMapping("membre")
	@ResponseBody
	public Membre addMember(@RequestBody Membre memParam) {
		
		memRepo.save(memParam);
		return memParam;
	}
	
	/*
	 * Obtenir tous les membres
	 */
	@GetMapping("/membres")
	@ResponseBody
	public List<Membre> getMembers() {
		
		return memRepo.findAll();
	
	}
	
	/*
	 * Obtenir un membre
	 */
	 
	@GetMapping("/membre/{id}")
	@ResponseBody
	public Optional<Membre> getMember(@PathVariable("id") int id) {
		
		return memRepo.findById(id);
	
	}
	
	
	
}
