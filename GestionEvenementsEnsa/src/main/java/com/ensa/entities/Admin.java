package com.ensa.entities; 


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends Utilisateur{

	public Admin() {
		super();
	}

	public Admin(String username, String password, String email, String adresse, String tel, String cin,
			Boolean active) {
		super(username, password, email, adresse, tel, cin, active);
	}

}
