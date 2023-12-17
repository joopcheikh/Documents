package service;

import java.util.List;

import entity.Role;
import entity.User;

public interface ServiceAccount
{
	// Ajouter un  new user à la BD
	public User addNewUserToDatabase(User user);
	
	// Ajouter un new role à la BD
	public Role addNewRoleToDatabase(Role role);
	
	// Ajouter un un role à un user
	public void addRoleToUser(String username, String roleName);
	
	// charger un user à partir de la DB
	public User loadUserFomDatabase(String username);
	
	// Retourner tous les users
	public List<User> listUsers();
}
