package testSpringJwt.testJwt;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.Role;
import entity.User;
import service.ServiceAccount;

@SpringBootApplication
public class TestJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJwtApplication.class, args);
	}
	
	CommandLineRunner start(ServiceAccount serviceAccount)
	{
		return args ->{
			// Ajouter un user
			serviceAccount.addNewUserToDatabase(new User(null,"cheikh","668600", new ArrayList<>()));
			
			// Ajouter un role
			serviceAccount.addNewRoleToDatabase(new Role(null, "ADMIN"));
			
			// Ajouter le role au user
			serviceAccount.addRoleToUser("cheikh","ADMIN");
		};
		
	}

}
