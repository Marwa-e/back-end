package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Niveau;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauRepository  extends JpaRepository<Niveau, Long>{

	Optional<List<Niveau>> findByIntituleContains(String element);

}
