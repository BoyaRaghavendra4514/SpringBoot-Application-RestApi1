package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="PERSON_DETAILS")
public class Person {
	@Id
	@Column(name="PERSON_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer personId;
	@Column(name="PERSON_NAME")
	private String personName;
	@Column(name="PERSON_AGE")
	private Integer personAge;
	@Column(name="PERSON_DOB")
	private String personDOB;
	@Column(name="PERSON_EMAIL")
	private String personEmail;
	@Column(name="PERSON_ADDRESS")
	private String personAddress;

}
