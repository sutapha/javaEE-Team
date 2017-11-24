package com.ensa.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("professeur")
public class Professeur extends Utilisateur{
	
	private String numeroSomme;
	private String departement;
	
	public Professeur() {
		super();
	}
	
	public Professeur(String username, String password, String email, String adresse, String tel, String cin,
			Boolean active) {
		super(username, password, email, adresse, tel, cin, active);
	}

	public String getNumeroSomme() {
		return numeroSomme;
	}

	public void setNumeroSomme(String numeroSomme) {
		this.numeroSomme = numeroSomme;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

}
