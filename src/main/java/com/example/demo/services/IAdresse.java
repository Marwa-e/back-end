package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Adresse;

public interface IAdresse<T> {
	
	
	Optional<List<Adresse>> findByRueContains(String rue);

	Optional<List<Adresse>> findByVilleContains(String rue);

	Optional<List<Adresse>> findByPaysContains(String rue);

	Optional<List<Adresse>> findByCp(String rue);
	
	List<T> findAll();

	T saveOrUpdate(T o);

	Optional<T> findById(Long id);

	Long deleteById(Long id);
	
	void delete(T o);	

}
