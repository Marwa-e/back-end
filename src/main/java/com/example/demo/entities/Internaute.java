package com.example.demo.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value = "INTERNAUTE")
public class Internaute extends Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;

	private String prenom;

	private String niveau;

	public Internaute(String nom, String prenom, String niveau) {
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
	}
	
	public Internaute(String password, String email, Adresse adresse, String telephone, Commande currentCommande,
			List<Commande> historyOfCommands, Long id, String nom, String prenom, String niveau) {
		super(password, email, adresse, telephone, currentCommande, historyOfCommands);
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
	}

	public Internaute() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getString() {
		return niveau;
	}

	public void setString(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Internaute [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", niveau=" + niveau + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
