package test.pocket.JpaHibernateLearning;

import org.springframework.web.bind.annotation.RestController;

import com.pocket.inscriptionScolarite.Enfant;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*
 * JpaRepository ne fournie pas des fonctionnalites de recherche plus poussees tels les recherches polymorphiques
 */

@RestController
public class PersonController {
	
	@Autowired
	PersonDao personDao;

	/*
	 * Ajout d'un nouveau membre
	 */
	@PostMapping("/person")
	@ResponseBody
	public Person addPerson(@RequestBody Person personParam) {
		
		personDao.save(personParam);
		return personParam;
	}
	
	/*
	 * Obtenir tous les enfants
	 */
	@GetMapping("/persons")
	@ResponseBody
	public List<Person> getPersons() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
	    
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Query query = entityManager.createQuery(
		        "select p from Person p");
		
	 	List<Person> persons = query.getResultList();
	 	
		transaction.commit();
		entityManager.close();
		
		return persons;
		
	
	}
	
	/*
	 * Obtenir un enfant
	 */
	 
	@GetMapping("/person/{id}")
	@ResponseBody
	public Optional<Person> getPerson(@PathVariable("id") long id) {
		
		return personDao.findById(id);
	
	}
	
	
	
}


