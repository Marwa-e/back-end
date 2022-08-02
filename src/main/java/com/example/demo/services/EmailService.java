package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.EmailRepository;
import com.example.demo.entities.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "emailService")
public class EmailService implements IService<Email> {

	@Autowired
	private EmailRepository emailRepository;

	@Override
	public List<Email> findAll() {
		// TODO Auto-generated method stub
		return emailRepository.findAll();
	}

	@Override
	public Email saveOrUpdate(Email o) {
		// TODO Auto-generated method stub
		Email changedEmail = new Email(o.getEmail());
		return emailRepository.save(changedEmail);
	}

	@Override
	public Optional<Email> findById(Long id) {
		// TODO Auto-generated method stub
		return emailRepository.findById(id);
	}

	@Override
	public Long deleteById(Long id) {
		// TODO Auto-generated method stub
		emailRepository.deleteById(id);
		return id;
	}

	@Override
	public void delete(Email o) {
		// TODO Auto-generated method stub
		emailRepository.delete(o);
	}

	@Override
	public Optional<List<Email>> findByNomContains(String element) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}



}
