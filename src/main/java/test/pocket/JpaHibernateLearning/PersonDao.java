package test.pocket.JpaHibernateLearning;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends JpaRepository<Person,Long> {
	
}
