package com.nt.repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Serializable> {

}
