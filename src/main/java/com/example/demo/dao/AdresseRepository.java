package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Adresse;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository  extends JpaRepository<Adresse, Long>{

	Optional<List<Adresse>> findByVilleContains(String element);
	Optional<List<Adresse>> findByRueContains(String element);
	Optional<List<Adresse>> findByPaysContains(String element);
	Optional<List<Adresse>> findByCp(String cp);
	Optional<List<Adresse>> findByPays(String pays);
}
