package com.demo.project.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Departement
{
	@Id
	@GeneratedValue
	
	private Integer id;
	
	private String name;
	
	@OneToMany(mappedBy = "departement")
	private List<Employee> employess;
}
