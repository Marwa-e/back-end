package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.InternauteRepository;
import com.example.demo.entities.Email;
import com.example.demo.entities.Internaute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "internauteService")
public class InternauteService implements IService<Internaute>,InternauteServiceMetier {

	@Autowired
	private InternauteRepository itRepository;

	@Override
	public List<Internaute> findAll() {
		// TODO Auto-generated method stub
		return itRepository.findAll();
	}

	@Override
	public Internaute saveOrUpdate(Internaute o) {
		// TODO Auto-generated method stub	
		return itRepository.save(o);
	}

	@Override
	public Optional<Internaute> findById(Long id) {
		// TODO Auto-generated method stub
		return itRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		itRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Internaute o) {
		// TODO Auto-generated method stub
		itRepository.delete(o);
	}

	@Override
	public Optional<List<Internaute>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return itRepository.findByNomContains(element);
	}
	@Override
	public Optional<List<Internaute>> findByEmailContains(String element) {
		// TODO Auto-generated method stub
		return itRepository.findByEmailContains(element);
	}

	@Override
	public Optional<List<Internaute>> findByPrenomContains(String element) {
		// TODO Auto-generated method stub
		return itRepository.findByPrenomContains(element);
	}

	
}
