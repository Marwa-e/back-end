package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String intitule;

	@ManyToOne
	private Categorie mere;

	public Categorie(String intitule) {
		super();
		this.intitule=intitule;
	}
	public Categorie(String intitule, Categorie mere) {
		super();
		this.intitule = intitule;
		this.mere = mere;
	}

	public Categorie() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Categorie getMere() {
		return mere;
	}

	public void setMere(Categorie mere) {
		this.mere = mere;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", intitule=" + intitule + ", mere=" + mere + "]";
	}

}
