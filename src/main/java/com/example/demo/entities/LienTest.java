package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

@Entity
public class LienTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String lien;
	
	@Nullable
	private String commentaires;

	public LienTest(String lien) {
		super();
		this.lien = lien;
	}
	
	public LienTest(String lien, String commentaires) {
		super();
		this.lien = lien;
		this.commentaires = commentaires;
	}

	public LienTest() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "LienTest [id=" + id + ", lien=" + lien + ", commentaires=" + commentaires + "]";
	}
	
	
}
