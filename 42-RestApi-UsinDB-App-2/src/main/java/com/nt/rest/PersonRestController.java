package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Person;
import com.nt.service.PersonService;

@RestController
@RequestMapping("/api") 
public class PersonRestController {
	 
	@Autowired
	private PersonService service;
	
	@PostMapping( "/person")
	public ResponseEntity<String> addPerson(@RequestBody Person person){
		String addperson=service.upsertPerson(person);
		return new ResponseEntity<>(addperson,HttpStatus.CREATED);
	}
	@GetMapping("/persons")
	public ResponseEntity<List<Person>> getAllPesons(){
		List<Person> persons=service.getAllPersons();
		return new ResponseEntity<>(persons,HttpStatus.OK);
	}
	@PutMapping("/person")
	public ResponseEntity<String> updatePerson(@RequestBody Person person){
		String personUpdate=service.upsertPerson(person);
		return new ResponseEntity<>(personUpdate,HttpStatus.OK);
	}
	@DeleteMapping("/person/{personId}")
	public ResponseEntity<String> deletePerson(@PathVariable Integer personId){
		String deleteperson=service.deletePersonsById(personId);
		return new ResponseEntity<>(deleteperson,HttpStatus.OK);
	}

}
