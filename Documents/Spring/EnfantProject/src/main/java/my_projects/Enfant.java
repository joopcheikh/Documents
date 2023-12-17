package my_projects;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Enfant
{
	@Id
	@GeneratedValue
	@Column(nullable = false, unique = true)
	private Integer id;
	
	@Column(nullable = false)
	private String firstname;
	
	@Column(nullable = false)
	private String lastname;
	
	private int old;
	
	private LocalDate birthdate;
	
	// Relationships
	
	@ManyToOne
	@JoinColumn(name = "pere_id")
	private Pere pere;
	
	@ManyToOne
	@JoinColumn(name = "mere_id")
	private Mere mere;
}
