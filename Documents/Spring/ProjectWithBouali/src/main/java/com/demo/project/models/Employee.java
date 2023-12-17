package com.demo.project.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table

public class Employee
{
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(
		nullable = false,
		unique = true
	)
	private String identifier;
	
	@Column(nullable = false)
	private String firstname;
	
	@Column(nullable = false)
	private String lastname;
	
	@Column(
			nullable = false,
			unique = true
		)
	private String email;
	
	private LocalDate birthdate;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private EmployeeRole role;
	
	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "departement_id")
	private Departement departement;
	
	@ManyToMany
	@JoinTable(
		name = "employee_mission",
		joinColumns = @JoinColumn(name = "employee_id"),
		inverseJoinColumns = @JoinColumn(name = "mission_id")
	)
	private List<Mission> missions;
	
	
	
}
