package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, Long>
{
	// methode qui role le role
	public AppRole findByRoleName(String roleName);
}
