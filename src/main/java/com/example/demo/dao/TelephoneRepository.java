package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Telephone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository  extends JpaRepository<Telephone, Long>{

	Optional<List<Telephone>> findByNumeroContains(String element);


}
