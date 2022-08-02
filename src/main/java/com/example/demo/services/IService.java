package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Formation;
import com.example.demo.entities.Internaute;

public interface IService<T> {

	List<T> findAll();

	T saveOrUpdate(T o);

	Optional<T> findById(Long id);

	Long deleteById(Long id);
	
	void delete(T o);
	
	Optional<List<T>> findByNomContains(String element);

	
}
