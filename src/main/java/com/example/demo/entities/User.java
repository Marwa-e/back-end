package com.example.demo.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.NaturalId;
import org.springframework.security.core.GrantedAuthority;


@Entity
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    private String name;
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

    public User() {
    }

    public User(String name, String username, String email, String password) {

        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public User(Long id, String name, String username, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.num = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public User( String username,
                 String password, Collection<? extends GrantedAuthority> authorities) {
        super();
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public Long getId() {
        return num;
    }

    public void setId(Long id) {
        this.num = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}