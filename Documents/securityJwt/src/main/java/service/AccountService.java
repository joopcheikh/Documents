package service;

import java.util.List;

import entity.AppRole;
import entity.AppUser;

// Interface qui permet de définir les fonctionnalités dont nous aurons besoin
public interface AccountService
{
	// methode pour ajouter un user dans la Db
	public AppUser addNewUser(AppUser appUser);
	
	// methode pour ajouter un role
	public AppRole addNewRole(AppRole appRole);
	
	//methode pour ajouter un role à un user
	public void addRoleToUser(String username,String roleName);
	
	// methode pour retourner un user
	public AppUser loadUserByUsername(String username);
	
	// methode for return all users
	public List<AppUser> listUsers();

}
