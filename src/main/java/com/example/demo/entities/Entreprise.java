package com.example.demo.entities;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
@DiscriminatorValue(value = "ENTRP")
public class Entreprise extends User {

	private String raisonSociale;

	private String contactEntrepriseNom;

	private String contactEntreprisePrenom;

	public Entreprise() {
		super();
	}

	public Entreprise(String username, String password, Collection<? extends GrantedAuthority> authorities, String nom,
			String prenom, String niveau, String raisonSociale, String contactEntrepriseNom,
			String contactEntreprisePrenom) {
		super(username, password, authorities);
		this.raisonSociale = raisonSociale;
		this.contactEntrepriseNom = contactEntrepriseNom;
		this.contactEntreprisePrenom = contactEntreprisePrenom;
	}

	public Entreprise(String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities, Set<Role> roles, Adresse adresse, String telephone,
			Commande currentCommande, List<Commande> historyOfCommands, String nom, String prenom, String niveau,
			String raisonSociale, String contactEntrepriseNom, String contactEntreprisePrenom) {
		super(username, email, password, authorities, roles, adresse, telephone, currentCommande, historyOfCommands);
		this.raisonSociale = raisonSociale;
		this.contactEntrepriseNom = contactEntrepriseNom;
		this.contactEntreprisePrenom = contactEntreprisePrenom;
	}

	public Entreprise(String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities, String nom, String prenom, String niveau,
			String raisonSociale, String contactEntrepriseNom, String contactEntreprisePrenom) {
		super(username, email, password, authorities);
		this.raisonSociale = raisonSociale;
		this.contactEntrepriseNom = contactEntrepriseNom;
		this.contactEntreprisePrenom = contactEntreprisePrenom;
	}

	public Entreprise(String username, String email, String password, String nom, String prenom, String niveau,
			String raisonSociale, String contactEntrepriseNom, String contactEntreprisePrenom) {
		super(username, email, password);
		this.raisonSociale = raisonSociale;
		this.contactEntrepriseNom = contactEntrepriseNom;
		this.contactEntreprisePrenom = contactEntreprisePrenom;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getContactEntrepriseNom() {
		return contactEntrepriseNom;
	}

	public void setContactEntrepriseNom(String contactEntrepriseNom) {
		this.contactEntrepriseNom = contactEntrepriseNom;
	}

	public String getContactEntreprisePrenom() {
		return contactEntreprisePrenom;
	}

	public void setContactEntreprisePrenom(String contactEntreprisePrenom) {
		this.contactEntreprisePrenom = contactEntreprisePrenom;
	}

	@Override
	public String toString() {
		return "Entreprise [ raisonSociale=" + raisonSociale + ", contactEntrepriseNom="
				+ contactEntrepriseNom + ", contactEntreprisePrenom=" + contactEntreprisePrenom + ", toString()="
				+ super.toString() + "]";
	}

}
