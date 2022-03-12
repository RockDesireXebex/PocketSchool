package com.pocket.personel.administratifs;

import javax.persistence.Entity;

import com.pocket.personel.Membre;
@Entity
public class MembreAdministratifs extends Membre {
	private String grade;

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
