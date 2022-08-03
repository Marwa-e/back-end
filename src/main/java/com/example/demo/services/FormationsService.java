package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.FormationRepository;
import com.example.demo.entities.Formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="formationService")
public class FormationsService implements IFormations {

	@Autowired
	private FormationRepository formationRepository;

	
	@Override
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return formationRepository.findAll();
	}

	@Override
	public Formation saveOrUpdate(Formation o) {
		// TODO Auto-generated method stub
		
		return formationRepository.save(o);
	}

	@Override
	public Optional<Formation> findById(Long id) {
		// TODO Auto-generated method stub
		return formationRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		formationRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Formation o) {
		// TODO Auto-generated method stub
		formationRepository.delete(o);
	}

	@Override
	public Optional<List<Formation>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return formationRepository.findByIntituleContains(element);
	}

	@Override
	public Optional<List<Formation>> findByCategorieFormations(Long id) {
		// TODO Auto-generated method stub
		return formationRepository.findByCategorieId(id);
	}

	@Override
	public List<Formation> findByFormateur(Long id) {
		// TODO Auto-generated method stub
		return formationRepository.findByFormateur(id);
	}
	
}
