package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository repository;
	
	@Override
	public String upsertPerson(Person person) {
		Integer personId=person.getPersonId();
		repository.save(person);
		if(personId == null) {
			return "person Inserted";
		}
		else {
			return "person updated";
		}
		
	}

	@Override
	public List<Person> getAllPersons() {
		List<Person> per=repository.findAll();
		return per;
	}

	@Override
	public String deletePersonsById(Integer personId) {
		repository.deleteById(personId);
		return "personId deleted";
	}

}
