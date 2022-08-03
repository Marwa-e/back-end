package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.EntrepriseRepository;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Entreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service(value="entrepriseService")
public class EntrepriseService implements IService<Entreprise> {

	@Autowired
	private EntrepriseRepository entrepriseRepository;

	@Override
	public List<Entreprise> findAll() {
		// TODO Auto-generated method stub
		return entrepriseRepository.findAll();
	}

	@Override
	public Entreprise saveOrUpdate(Entreprise o) {
		
		
		return entrepriseRepository.save(o);
	}

	@Override
	public Optional<Entreprise> findById(Long id) {
		// TODO Auto-generated method stub
		return entrepriseRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		entrepriseRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Entreprise o) {
		// TODO Auto-generated method stub
		entrepriseRepository.delete(o);
	}

	@Override
	public Optional<List<Entreprise>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	
}
