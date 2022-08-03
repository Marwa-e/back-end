package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.LienTestRepository;
import com.example.demo.entities.LienTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="lienTestService")
public class LienService implements IService<LienTest> {

	@Autowired
	private LienTestRepository ltRepository;

	@Override
	public List<LienTest> findAll() {
		// TODO Auto-generated method stub
		return ltRepository.findAll();
	}

	@Override
	public LienTest saveOrUpdate(LienTest o) {
		// TODO Auto-generated method stub
		return ltRepository.save(o);
	}

	@Override
	public Optional<LienTest> findById(Long id) {
		// TODO Auto-generated method stub
		return ltRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		ltRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(LienTest o) {
		// TODO Auto-generated method stub
		ltRepository.delete(o);
	}

	@Override
	public Optional<List<LienTest>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


	
}
