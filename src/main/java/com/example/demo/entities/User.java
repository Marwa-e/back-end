package com.example.demo.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.NaturalId;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_USER")
@DiscriminatorValue(value = "USER")
@Table(name="user")
public class User{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    @NaturalId
    private String email;
    @JsonIgnore
    private String password;
    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_num"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
    
    @OneToOne(cascade = { CascadeType.MERGE })
	private Adresse adresse;
    
	private String telephone;
	
	// Le client crée la commande
	@OneToOne
	private Commande currentCommande;
	
	@Basic(fetch=FetchType.LAZY)
	@OneToMany
	private List<Commande> historyOfCommands;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User( String username, String email, String password, Collection<? extends GrantedAuthority> authorities) {

        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super();
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }
    
    public User(String username, String email, String password,
			Collection<? extends GrantedAuthority> authorities, Set<Role> roles, Adresse adresse, String telephone,
			Commande currentCommande, List<Commande> historyOfCommands) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
		this.roles = roles;
		this.adresse = adresse;
		this.telephone = telephone;
		this.currentCommande = currentCommande;
		this.historyOfCommands = historyOfCommands;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
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
    
    
}