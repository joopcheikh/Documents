package entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	// Récupérer ou trouver the user par email
	public User findByEmail(String email);
}

