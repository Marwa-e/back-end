package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.NiveauRepository;
import com.example.demo.entities.Niveau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="niveauService")
public class NiveauService implements IService<Niveau> {

	@Autowired
	private NiveauRepository nvRepository;

	@Override
	public List<Niveau> findAll() {
		// TODO Auto-generated method stub
		return nvRepository.findAll();
	}

	@Override
	public Niveau saveOrUpdate(Niveau o) {
		// TODO Auto-generated method stub
		return nvRepository.save(o);
	}

	@Override
	public Optional<Niveau> findById(Long id) {
		// TODO Auto-generated method stub
		return nvRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		nvRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Niveau o) {
		// TODO Auto-generated method stub
		nvRepository.delete(o);
	}

	@Override
	public Optional<List<Niveau>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return nvRepository.findByIntituleContains(element);
	}

	
 
}
