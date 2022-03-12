package test.pocket;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.pocket.JpaHibernateLearning.Coach;
import test.pocket.JpaHibernateLearning.Person;
import test.pocket.JpaHibernateLearning.PersonDao;



@SpringBootApplication
public class PocketSchoolBootBackApplication {
	

	public static void main(String[] args) throws NamingException {
		
		SpringApplication.run(PocketSchoolBootBackApplication.class, args);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
	    
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Query query = entityManager.createQuery(
		        "select p from Person p");
		
	 	List<Person> persons = query.getResultList();
	 	Person s1 = persons.get(0);
	 	Person s2 = persons.get(1);
		System.out.println(persons.size());
	    System.out.println(s1.getName());
	    System.out.println(s2.getName());

		/*
		 * Implementons ici le principe de l'enfant qui devient eleve
		 */
		
		transaction.commit();
		entityManager.close();
		
		
		
	}

}
