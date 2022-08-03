package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Commande;
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
public class CommandeRestController {

	@Autowired
	private IService<Commande> commandeService;
	
	@PutMapping("/commandes/{id}")
	public ResponseEntity<Commande> modify(@PathVariable Long id, @RequestBody Commande target) {

		Commande cm = commandeService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Commande not found with id : " + id));
		
		cm.setSolde(target.getSolde());
		cm.setDateValidation(target.getDateValidation());
		cm.setFormation(target.getFormation());
		
		return new ResponseEntity<Commande>(commandeService.saveOrUpdate(cm), HttpStatus.OK);
	}
	
	// http://localhost:8080/commandes
	@GetMapping("/commandes")
	public ResponseEntity<List<Commande>> showAll() {
		return new ResponseEntity<List<Commande>>(commandeService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/commandes/{id}")
	public Optional<Commande> findById(@PathVariable Long id) {
		return commandeService.findById(id);
	}
	
	@PostMapping("/commandes")
	public ResponseEntity<Commande> save(@RequestBody Commande i) {
		
		return new ResponseEntity<Commande>(commandeService.saveOrUpdate(i), HttpStatus.OK);
	}
	
	@DeleteMapping("/commandes/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(commandeService.deleteById(id), HttpStatus.OK);
	}

	
}
