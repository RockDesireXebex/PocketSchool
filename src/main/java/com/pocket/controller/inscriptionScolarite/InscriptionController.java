package com.pocket.controller.inscriptionScolarite;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocket.inscriptionScolarite.Eleve;
import com.pocket.inscriptionScolarite.EleveDao;
import com.pocket.inscriptionScolarite.Enfant;
import com.pocket.inscriptionScolarite.EnfantDao;
import com.pocket.inscriptionScolarite.Inscription;
import com.pocket.inscriptionScolarite.InscriptionDao;
import com.pocket.inscriptionScolarite.InscriptionServiceEM;
import com.pocket.inscriptionScolarite.Parent;
import com.pocket.inscriptionScolarite.ParentDao;
import com.pocket.patrimoine.Niveau;
import com.pocket.patrimoine.NiveauDao;
import com.pocket.personel.Caisse;
import com.pocket.personel.CaisseDao;
import com.pocket.personel.technique.Intendant;
import com.pocket.personel.technique.IntendantDao;

@RestController
@CrossOrigin("http://localhost:3000")
public class InscriptionController {
	
	@Autowired
	InscriptionDao inscriptionDao;
	@Autowired 
	CaisseDao caisseDao;
	@Autowired 
	EleveDao eleveDao;
	@Autowired
	NiveauDao niveauDao;
	
	@Autowired
	ParentDao parentDao;
	
	@Autowired
	InscriptionServiceEM inService;
	
	@PostMapping("/inscription")
	@ResponseBody
	public Inscription addInscription(@RequestBody Inscription inscription) {
		/*
		 * Ici on enregistre d'abord l'inscription, qui enregistrera automatiquement l'enfant et l'id du parent(On retrouvera le parent dans la base pour s'assurer qu'il existe avant de l'enregistrer)
		 * On recupere la caisse des inscriptions
		 * On recupere le prix d'inscription du niveau a travers l'inscription puis on increment la caisse des incriptions
		 * On  cree un objet eleve, on y affecte un matricule et son niveau a travers le niveau de l'inscription 
		 * finalement on sauvegarde l'eleve
		 */
		
		/*
		 * Trouver comment generer automatiquement les factures
		 */
		

		
		//Chercher d'abord à stocker les niveaux dans la base pour connaitre leurs prix
		
		Niveau niveauFind = niveauDao.findById(inscription.getNiveauEnfant().getNumeroNiveau()).get();
		int prixniveauI =niveauFind.getPrixInscription();
		
		
		Caisse caisseInscription = caisseDao.findById(1).get();
		caisseInscription.debiter(prixniveauI);//Ensuite mettre a jour la caisse
		caisseDao.save(caisseInscription); 
		
		
		/*
		 * Trouver s'il existe un moyen d'affecter automatiquement les valeurs de l'enfant a l'eleve au travers de l'heritage
		 */
		//Eleve eleve = new Eleve();
		/*
		 * On affecte ici un matricule et un niveau a l'eleve
		 * Il faudra trouver un moyen de generer automatiquement les matricules
		 * 
		 */
		/*
		 * Recuperation du parent
		 */
		Parent parent = parentDao.findById(inscription.getParentI().getNumCni()).get();
		
		Eleve eleve = inscription.getEleve();
		eleve.setNiveau(niveauFind);
		eleve.getParentes().add(parent);
		
		/*
		 * Sauvegarde de l'inscription
		 */
		
		Inscription inscriptionProcess = new Inscription();
		inscription.setEleve(eleve);
		inscription.setNiveauEnfant(niveauFind);
		inscription.setParentI(parent);
		
		inscriptionDao.save(inscription);
		
		return inscription;
		
	}
	
	@GetMapping("/inscriptions")
	@ResponseBody
	public List<Inscription> getAllInscriptions() {
		
		return inscriptionDao.findAll();
	}
	
	@GetMapping("/inscription/{id}")
	@ResponseBody
	public Inscription getInscription(@PathVariable("id") int id) {
		
		return inscriptionDao.findById(id).get();
	}
	
	
}
