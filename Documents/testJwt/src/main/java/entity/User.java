package entity;

import java.util.Collection;

import jakarta.persistence.ManyToMany;

public class User
{
	private Integer id;
	
	private String username;
	
	private String password;
	
	@ManyToMany
	private Collection<Role> role;
	
	// constructor
	public User(Integer id, String username, String password, Collection<Role> role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Role> getRole() {
		return role;
	}

	public void setRole(Collection<Role> role) {
		this.role = role;
	}
	
}
