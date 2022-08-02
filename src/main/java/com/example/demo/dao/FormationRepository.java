package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Formation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository  extends JpaRepository<Formation, Long>{

	Optional<List<Formation>> findByIntituleContains(String element);

	Optional<List<Formation>> findByCategorieId(Long id);

	List<Formation> findByFormateur(Long id);

}
