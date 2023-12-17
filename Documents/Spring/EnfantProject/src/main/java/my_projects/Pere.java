package my_projects;

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
public class Pere
{
	@Id
	@GeneratedValue
	@Column(nullable = false, unique = true)
	private Integer id;
	
	@Column(nullable = false)
	private String lastname;
	
	@Column(nullable = false)
	private String profession;
	
	@OneToMany(mappedBy = "pere")
	private List<Enfant> enfant;
}
