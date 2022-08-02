package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Email;
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
public class EmailRestController {

	@Autowired
	private IService<Email> emailService;
	
	@PutMapping("/emails/{id}")
	public ResponseEntity<Email> modify(@PathVariable Long id, @RequestBody Email target) {

		Email em = emailService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Email not found with id : " + id));
		
		em.setEmail(target.getEmail());
		
		return new ResponseEntity<Email>(emailService.saveOrUpdate(em), HttpStatus.OK);
	}
	
	// http://localhost:8080/emails
	@GetMapping("/emails")
	public ResponseEntity<List<Email>> showAll() {
		return new ResponseEntity<List<Email>>(emailService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/emails/{id}")
	public Optional<Email> findById(@PathVariable Long id) {
		return emailService.findById(id);
	}
	
	
	
	@PostMapping("/emails")
	public ResponseEntity<Email> save(@RequestBody Email i) {
		
		return new ResponseEntity<Email>(emailService.saveOrUpdate(i), HttpStatus.OK);
	}
	
	@DeleteMapping("/emails/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(emailService.deleteById(id), HttpStatus.OK);
	}

	
}
