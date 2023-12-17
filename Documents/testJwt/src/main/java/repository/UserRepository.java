package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	// retourner un user grace à son username
	public User findUserByUsename(String username);
}
