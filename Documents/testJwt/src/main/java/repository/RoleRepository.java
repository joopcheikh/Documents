package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>
{
	public Role findRoleByRoleName(String roleName);
}
