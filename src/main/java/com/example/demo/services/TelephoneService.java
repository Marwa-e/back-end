package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.TelephoneRepository;
import com.example.demo.entities.Telephone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="telephoneService")
public class TelephoneService implements IService<Telephone> {

	@Autowired
	private TelephoneRepository telRepository;

	@Override
	public List<Telephone> findAll() {
		// TODO Auto-generated method stub
		return telRepository.findAll();
	}

	@Override
	public Telephone saveOrUpdate(Telephone o) {
		Telephone changedTel = new Telephone();
		changedTel.setNumero(o.getNumero());
		// TODO Auto-generated method stub
		return telRepository.save(changedTel);
	}

	@Override
	public Optional<Telephone> findById(Long id) {
		// TODO Auto-generated method stub
		return telRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		telRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Telephone o) {
		// TODO Auto-generated method stub
		telRepository.delete(o);
	}

	@Override
	public Optional<List<Telephone>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return telRepository.findByNumeroContains(element);
	}
 
}
