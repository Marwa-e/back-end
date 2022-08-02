package com.example.demo.restController;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.AdresseRepository;
import com.example.demo.entities.Adresse;
import com.example.demo.services.IAdresse;

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
public class AdresseRestController {

	@Autowired
	private IAdresse<Adresse> adresseService;
	@Autowired
	private AdresseRepository adresseRepository;
	
	@PutMapping("/adresses/{id}")
	public ResponseEntity<Adresse> modify(@PathVariable Long id, @RequestBody Adresse target) {

		Adresse addr = adresseService.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Adresse not found with id : " + id));
		
		addr.setRue(target.getRue());
		addr.setCp(target.getCp());
		addr.setVille(target.getVille());
		addr.setPays(target.getPays());

		return new ResponseEntity<Adresse>(adresseService.saveOrUpdate(addr), HttpStatus.OK);
	}
	
	@GetMapping("/adresses")
	public ResponseEntity<List<Adresse>> showAll() {
		return new ResponseEntity<List<Adresse>>(adresseService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/adresses/{id}")
	public Optional<Adresse> findById(@PathVariable Long id) {
		return adresseService.findById(id);
	}
	@GetMapping("/adresses/findByVille/{ville}")
	public Optional<List<Adresse>> findByVilleContains(@PathVariable String ville) {
		return adresseRepository.findByVilleContains(ville);
	}
	@GetMapping("/adresses/findByCp/{cp}")
	public Optional<List<Adresse>> findByCp(@PathVariable String cp) {
		return adresseRepository.findByCp(cp);
	}
	@GetMapping("/adresses/findByPays/{pays}")
	public Optional<List<Adresse>> findByPays(@PathVariable String pays) {
		return adresseRepository.findByPays(pays);
	}
	
	@PostMapping("/adresses")
	public ResponseEntity<Adresse> save(@RequestBody Adresse i) {
		
		return new ResponseEntity<Adresse>(adresseService.saveOrUpdate(i), HttpStatus.OK);
	}
	
	@DeleteMapping("/adresses/{id}")
	public ResponseEntity<Long> save(@PathVariable Long id) {
		
		return new ResponseEntity<Long>(adresseService.deleteById(id), HttpStatus.OK);
	}

	
}
