package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table
public class Role
{
	private Integer id;
	
	private String roleName;
	
	// constructor
	public Role(Integer id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
