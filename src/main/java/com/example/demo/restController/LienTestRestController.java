package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.LienTest;
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
public class LienTestRestController {

	@Autowired
	private IService<LienTest> lienTestService;
	
	@PutMapping("/lienTests/{id}")
	public ResponseEntity<LienTest> modify(@PathVariable Long id, @RequestBody LienTest target) {

		LienTest li = lienTestService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "LienTest not found with id : " + id));
		
		li.setLien(target.getLien());
		
		return new ResponseEntity<LienTest>(lienTestService.saveOrUpdate(li), HttpStatus.OK);
	}
	
	// http://localhost:8080/lienTestx
	@GetMapping("/lienTests")
	public ResponseEntity<List<LienTest>> showAll() {
		return new ResponseEntity<List<LienTest>>(lienTestService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/lienTests/{id}")
	public Optional<LienTest> findById(@PathVariable Long id) {
		return lienTestService.findById(id);
	}
	
	
	
	@PostMapping("/lienTests")
	public ResponseEntity<LienTest> save(@RequestBody LienTest i) {
		
		return new ResponseEntity<LienTest>(lienTestService.saveOrUpdate(i), HttpStatus.OK);
	}
	
	@DeleteMapping("/lienTests/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(lienTestService.deleteById(id), HttpStatus.OK);
	}

	
}
