package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Entreprise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository  extends JpaRepository<Entreprise, Long>{

	List<Entreprise> findByRaisonSocialeContains(String element);

}
