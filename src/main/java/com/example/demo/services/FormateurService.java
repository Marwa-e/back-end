package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.FormateurRepository;
import com.example.demo.entities.Formateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="formateurService")
public class FormateurService implements IService<Formateur> {

	@Autowired
	private FormateurRepository frmtrRepository;

	public Optional<List<Formateur>> findByNomContains(String element){
		return frmtrRepository.findByNomContains(element);
	}
	@Override
	public List<Formateur> findAll() {
		// TODO Auto-generated method stub
		return frmtrRepository.findAll();
	}

	@Override
	public Formateur saveOrUpdate(Formateur o) {
		// TODO Auto-generated method stub
		
		
		return frmtrRepository.save(o);
	}

	@Override
	public Optional<Formateur> findById(Long id) {
		// TODO Auto-generated method stub
		return frmtrRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		frmtrRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Formateur o) {
		// TODO Auto-generated method stub
		frmtrRepository.delete(o);
	}


	
}
