package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Email;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository  extends JpaRepository<Email, Long>{

	Optional<List<Email>> findByEmailContains(String element);

	
}
