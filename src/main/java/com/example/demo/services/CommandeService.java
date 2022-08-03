package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.CommandeRepository;
import com.example.demo.entities.Commande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="commandeService")
public class CommandeService implements IService<Commande> {

	@Autowired
	private CommandeRepository cmdRepository;

	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		return cmdRepository.findAll();
	}

	@Override
	public Commande saveOrUpdate(Commande o) {
		// TODO Auto-generated method stub
		
		return cmdRepository.save(o);
	}

	@Override
	public Optional<Commande> findById(Long id) {
		// TODO Auto-generated method stub
		return cmdRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		cmdRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Commande o) {
		// TODO Auto-generated method stub
		cmdRepository.delete(o);
	}

	@Override
	public Optional<List<Commande>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	

	
}
