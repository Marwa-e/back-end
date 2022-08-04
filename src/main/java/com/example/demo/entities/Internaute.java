package com.example.demo.entities;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;

@Entity
@DiscriminatorValue(value = "INTERNAUTE")
public class Internaute extends User {

	private String nom;

	private String prenom;

	private String niveau;

	public Internaute() {
		super();
	}

	public Internaute(String username, String password, Collection<? extends GrantedAuthority> authorities, String nom,
			String prenom, String niveau) {
		super(username, password, authorities);
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
	}

	public Internaute(String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities, Set<Role> roles, Adresse adresse, String telephone,
			Commande currentCommande, List<Commande> historyOfCommands, String nom,
			String prenom, String niveau) {
		super(username, email, password, authorities, roles, adresse, telephone, currentCommande, historyOfCommands);
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
	}

	public Internaute(String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities, String nom,
			String prenom, String niveau) {
		super(username, email, password, authorities);
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
	}

	public Internaute(String username, String email, String password, String nom,
			String prenom, String niveau) {
		super(username, email, password);
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
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

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Internaute [ nom=" + nom + ", prenom=" + prenom + ", niveau=" + niveau + ", toString()="
				+ super.toString() + "]";
	}

}
