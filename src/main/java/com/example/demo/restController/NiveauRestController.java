package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Niveau;
import com.example.demo.services.IService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin(origins = "*" )//  autorise la communication entre application front-end et back-end
public class NiveauRestController {

	@Autowired
	private IService<Niveau> niveauService;
	
	@PutMapping("/niveaux/{id}")
	public ResponseEntity<Niveau> modify(@PathVariable Long id, @RequestBody Niveau target) {

		Niveau cat = niveauService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Niveau not found with id : " + id));
		
		cat.setIntitule(target.getIntitule());
		
		return new ResponseEntity<Niveau>(niveauService.saveOrUpdate(cat), HttpStatus.OK);
	}
	
	// http://localhost:8080/niveaux
	@GetMapping("/niveaux")
	public ResponseEntity<List<Niveau>> showAll() {
		return new ResponseEntity<List<Niveau>>(niveauService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/niveaux/{id}")
	public Optional<Niveau> findById(@PathVariable Long id) {
		return niveauService.findById(id);
	}
	
	
	
	@PostMapping("/niveaux")
	public ResponseEntity<Niveau> save(@RequestBody Niveau i) {
		
		return new ResponseEntity<Niveau>(niveauService.saveOrUpdate(i), HttpStatus.OK);
	}
	
	@DeleteMapping("/niveaux/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(niveauService.deleteById(id), HttpStatus.OK);
	}

	
}
