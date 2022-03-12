package test.pocket.JpaHibernateLearning;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coach extends Person {
	private int nbreAnneeExperience;

	/**
	 * @return the nbreAnneeExperience
	 */
	public int getNbreAnneeExperience() {
		return nbreAnneeExperience;
	}

	/**
	 * @param nbreAnneeExperience the nbreAnneeExperience to set
	 */
	public void setNbreAnneeExperience(int nbreAnneeExperience) {
		this.nbreAnneeExperience = nbreAnneeExperience;
	}
	
	
	
}
