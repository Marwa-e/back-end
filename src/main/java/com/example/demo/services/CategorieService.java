package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.CategorieRepository;
import com.example.demo.entities.Categorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="categorieService")
public class CategorieService implements IService<Categorie> {

	@Autowired
	private CategorieRepository catRepository;

	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return catRepository.findAll();
	}

	@Override
	public Categorie saveOrUpdate(Categorie o) {
		// TODO Auto-generated method stub
		
		return catRepository.save(o);
	}

	@Override
	public Optional<Categorie> findById(Long id) {
		// TODO Auto-generated method stub
		return catRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		catRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Categorie o) {
		// TODO Auto-generated method stub
		catRepository.delete(o);
	}

	@Override
	public Optional<List<Categorie>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return catRepository.findByIntituleContains(element);
	}

	
}
