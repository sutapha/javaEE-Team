package com.ensa.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("etudiant")
public class Etudiant extends Utilisateur {
	
	private String codeApogee;
	private String filiere;
	
	public Etudiant() {
		super();
	}
	
	public Etudiant(String username, String password, String email, String adresse, String tel, String cin,
			Boolean active) {
		super(username, password, email, adresse, tel, cin, active);
	}

	public String getCodeApogee() {
		return codeApogee;
	}

	public void setCodeApogee(String codeApogee) {
		this.codeApogee = codeApogee;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

}
