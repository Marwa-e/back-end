package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Commande;
import com.example.demo.entities.Formation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository  extends JpaRepository<Commande, Long>{
	Optional<List<Commande>> findByFormation(Formation formation);
}
