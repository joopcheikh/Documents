package com.demo.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Address
{
	@Id
	@GeneratedValue
	private Integer id;
	
	private String streetName;
	
	private String houseNumber;
	
	private String zipCode;
}
