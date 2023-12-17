package JavaMysql;

import java.sql.*;

public class Mysql1 {

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
			// 4- Créer une requete de séléction
			ResultSet result = statement.executeQuery("select * from students");
			
			// Afficher les éléments de la BD
			while(result.next()) {
				System.out.println("Nom: " + result.getString(2) + " " + "Email: " + result.getString(3));
			}
			// Fermer la connection
			connexion.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
