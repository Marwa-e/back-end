package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Formation;

public interface IFormations {

	List<Formation> findAll();

	Formation saveOrUpdate(Formation o);

	Optional<Formation> findById(Long id);

	Long deleteById(Long id);

	void delete(Formation o);

	Optional<List<Formation>> findByNomContains(String element);


	Optional<List<Formation>> findByCategorieFormations(Long id);

	List<Formation> findByFormateur(Long id);


}
