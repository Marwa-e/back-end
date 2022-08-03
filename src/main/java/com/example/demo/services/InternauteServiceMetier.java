package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Internaute;

public interface InternauteServiceMetier {

	//Optional<List<Internaute>>findByEmailContains(String element);

	Optional<List<Internaute>> findByEmailContains(String element);

	Optional<List<Internaute>> findByPrenomContains(String element);
}
