package com.ensa.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Utilisateur {
	
	private String fonction;

	public Administrateur() {
		super();
	}

	public Administrateur(String username, String password, String email, String adresse, String tel, String cin,
			Boolean active) {
		super(username, password, email, adresse, tel, cin, active);
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

}
