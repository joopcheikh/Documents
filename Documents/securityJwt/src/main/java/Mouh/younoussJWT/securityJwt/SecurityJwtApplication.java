package Mouh.younoussJWT.securityJwt;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import entity.AppRole;
import entity.AppUser;
import service.AccountService;

//@ComponentScan(basePackages = "service")
@SpringBootApplication
public class SecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityJwtApplication.class, args);
	}
	
	// Faire un test. les méthodes sont dans AccoutService
	//@Bean
	CommandLineRunner start(AccountService accountService) {
		return args -> {
			// Ajouter des roles
			accountService.addNewRole(new AppRole(null, "USER"));
			accountService.addNewRole(new AppRole(null, "ADMIN"));
			accountService.addNewRole(new AppRole(null, "CUSTOMER_MENAGER"));
			accountService.addNewRole(new AppRole(null, "PRODUCT_MENAGER"));
			accountService.addNewRole(new AppRole(null, "BILLS_MENAGER"));
			
			// Ajouter des utilisateurs
			accountService.addNewUser(new AppUser(null, "cheikh", "668600", new ArrayList<>()));
			accountService.addNewUser(new AppUser(null, "moussa", "4321", new ArrayList<>()));
			accountService.addNewUser(new AppUser(null, "user1", "1234", new ArrayList<>()));
			accountService.addNewUser(new AppUser(null, "user2", "joop", new ArrayList<>()));
			
			// Ajouter un role à un user
			accountService.addRoleToUser("cheikh", "USER");
			accountService.addRoleToUser("cheikh", "ADMIN");
			accountService.addRoleToUser("moussa", "USER");
			accountService.addRoleToUser("moussa", "CUSTOMER_MENAGER");
			accountService.addRoleToUser("user1", "PRODUCT_MENAGER");
			accountService.addRoleToUser("user1", "BILLS_MENAGER");
			
		};
	}
	
	
}
