package com.demo.project.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
public class Mission
{
	@Id
	@GeneratedValue
	
	private Integer id;
	
	private String name;
	
	private int duration;
	
	@ManyToMany(mappedBy = "missions")
	private List<Employee> employees;
	
	
}
