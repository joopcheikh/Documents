package JavaMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaInsert11
{
	public static void main(String[] args)
	{
		try
		{
			// 1- charger le driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2- créer la connexion
			Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/javamysql", "root", "");
			// 3- Créer un état de connexion
			Statement statement = connexion.createStatement();
			// 4- Insertion des données
			String requete = "INSERT INTO students('name', 'email') values('mbaye', 'mbaye@gmail.com')";
			statement.executeUpdate(requete);
			
			// Fermer la connection
			connexion.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
