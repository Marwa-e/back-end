package com.example.demo.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@DiscriminatorValue(value="ENTRP")
public class Entreprise extends Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String raisonSociale;
	
	private String contactEntrepriseNom;
	
	private String contactEntreprisePrenom;

	public Entreprise() {
		super();
	}

	public Entreprise( String raisonSociale, String contactEntrepriseNom,
			String contactEntreprisePrenom) {
		this.raisonSociale = raisonSociale;
		this.contactEntrepriseNom = contactEntrepriseNom;
		this.contactEntreprisePrenom = contactEntreprisePrenom;
	} 
	
	public Entreprise(String password, String email, Adresse adresse, String telephone, Commande currentCommande,
			List<Commande> historyOfCommands, String raisonSociale, String contactEntrepriseNom,
			String contactEntreprisePrenom) {
		super(password, email, adresse, telephone, currentCommande, historyOfCommands);
		this.raisonSociale = raisonSociale;
		this.contactEntrepriseNom = contactEntrepriseNom;
		this.contactEntreprisePrenom = contactEntreprisePrenom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "Entreprise [id=" + id + ", raisonSociale=" + raisonSociale + ", contactEntrepriseNom="
				+ contactEntrepriseNom + ", contactEntreprisePrenom=" + contactEntreprisePrenom + ", toString()="
				+ super.toString() + "]";
	}

	
}
