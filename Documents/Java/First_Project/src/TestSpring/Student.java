package TestSpring;

import java.time.LocalDate;

public class Student
{
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Student() {}
	public Student(String firstName, String lastName, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + "\nlastName=" + lastName + "\ndateOfBirth=" + dateOfBirth + "]";
	}
	
}
