package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Formateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepository  extends JpaRepository<Formateur, Long>{

	Optional<List<Formateur>> findByNomContains(String element);
}
