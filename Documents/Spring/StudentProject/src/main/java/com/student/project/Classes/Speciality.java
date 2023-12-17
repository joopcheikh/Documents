package com.student.project.Classes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Speciality
{
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	
	@OneToMany(mappedBy = "speciality")
	private List<Student> student;
	
}
