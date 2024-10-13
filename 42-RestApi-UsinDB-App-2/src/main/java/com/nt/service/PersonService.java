package com.nt.service;

import java.util.List;

import com.nt.entity.Person;

public interface PersonService {
	public String upsertPerson(Person person);
	public  List<Person> getAllPersons();
	public String deletePersonsById(Integer personId);

}
