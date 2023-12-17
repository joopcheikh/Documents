package service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.AppRole;
import entity.AppUser;
import repository.AppRoleRepository;
import repository.AppUserRepository;

@Service // c'est une classe de la couche service
@Transactional // pour gérer les transactions
public class AccountServiceImpl implements AccountService
{
	private AppUserRepository appUserRepository;
	private AppRoleRepository appRoleRepository;
	
	// l'injection des dépendence peut se faire soit par @Autowired soit par constructor
	// l'injection via constructors
	public AccountServiceImpl(AppUserRepository appUserRepository, AppRoleRepository appRoleRepository)
	{
		this.appUserRepository = appUserRepository;
		this.appRoleRepository = appRoleRepository;
	}

	@Override
	public AppUser addNewUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return appUserRepository.save(appUser);
	}


	@Override
	public AppRole addNewRole(AppRole appRole) {
		// TODO Auto-generated method stub
		return appRoleRepository.save(appRole);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		// récupérer d'abord le username dans la DB
		AppUser appUser = appUserRepository.findByUsername(username);
		// récupérer le role dans la DB
		AppRole appRole = appRoleRepository.findByRoleName(roleName);
		
		// Affecter les roles aux users
		appUser.getAppRoles().add(appRole);
	}

	@Override
	public AppUser loadUserByUsername(String username) {
		return appUserRepository.findByUsername(username);
	}

	@Override
	public List<AppUser> listUsers() {
		// TODO Auto-generated method stub
		return appUserRepository.findAll();
	}

}
