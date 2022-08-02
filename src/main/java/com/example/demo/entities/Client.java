package com.example.demo.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CLIENT")
@DiscriminatorValue(value = "CLIENT")
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String password;
	
	private String email;
	
	@OneToOne(cascade = { CascadeType.MERGE })
	private Adresse adresse;
	
	private String telephone;

	// Le client crée la commande
	@OneToOne
	private Commande currentCommande;
	
	@Basic(fetch=FetchType.LAZY)
	@OneToMany
	private List<Commande> historyOfCommands;

	public Client(String password, String email, Adresse adresse, String telephone, Commande currentCommande,
			List<Commande> historyOfCommands) {
		super();
		this.password = password;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.currentCommande = currentCommande;
		this.historyOfCommands = historyOfCommands;
	}

	public Client() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Commande getCurrentCommande() {
		return currentCommande;
	}

	public void setCurrentCommande(Commande currentCommande) {
		this.currentCommande = currentCommande;
	}

	public List<Commande> getHistoryOfCommands() {
		return historyOfCommands;
	}

	public void setHistoryOfCommands(List<Commande> historyOfCommands) {
		this.historyOfCommands = historyOfCommands;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", password=" + password + ", email=" + email + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", currentCommande=" + currentCommande + ", historyOfCommands="
				+ historyOfCommands + ", toString()=" + super.toString() + "]";
	}

	
	
}
