package com.student.project.Classes;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Student
{
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(
		nullable = false,
		unique = true
	)
	private String firstname;
	
	@Column(
		nullable = false
	)
	private String lastname;
	
	@Column(
		nullable = false
	)
	private String email;
	
	@Column(
		nullable = false
	)
	private LocalDate birthdate;
	
	// RelationShips
	
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;
	
	@ManyToOne
	@JoinColumn(name = "speciality_id")
	private Speciality speciality;
	
	@ManyToMany
	@JoinTable(
		name = "student_teacher",
		joinColumns = @JoinColumn(name = "student_id"),
		inverseJoinColumns = @JoinColumn(name = "teacher_id")
	)
	private List<Teacher> teacher;
	
}
