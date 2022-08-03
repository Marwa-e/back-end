package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Formateur;
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
public class FormateurRestController {

	@Autowired
	private IService<Formateur> formateurService;
	
	@PutMapping("/formateurs/{id}")
	public ResponseEntity<Formateur> modify(@PathVariable Long id, @RequestBody Formateur target) {

		Formateur fm = formateurService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Formateur not found with id : " + id));
		
		fm.setNom(target.getNom());
		fm.setPrenom(target.getPrenom());
		fm.setEmail(target.getEmail());
		fm.setTelephone(target.getTelephone());
		fm.setCategorie(target.getCategorie());
		
		
		return new ResponseEntity<Formateur>(formateurService.saveOrUpdate(fm), HttpStatus.OK);
	}
	
	// http://localhost:8080/formateurs
	@GetMapping("/formateurs")
	public ResponseEntity<List<Formateur>> showAll() {
		return new ResponseEntity<List<Formateur>>(formateurService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/formateurs/{id}")
	public Optional<Formateur> findById(@PathVariable Long id) {
		return formateurService.findById(id);
	}
	
	@GetMapping("/formateurs/findByNomContains/{element}")
	public Optional<List<Formateur>> findByNom(@PathVariable String element) {
		return formateurService.findByNomContains(element);
	}
	
	@PostMapping("/formateurs")
	public ResponseEntity<Formateur> save(@RequestBody Formateur i) {
		
		return new ResponseEntity<Formateur>(formateurService.saveOrUpdate(i), HttpStatus.OK);
	}
	@DeleteMapping("/formateurs/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(formateurService.deleteById(id), HttpStatus.OK);
	}

}
