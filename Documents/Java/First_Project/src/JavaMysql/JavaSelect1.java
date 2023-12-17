package JavaMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class JavaSelect1
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Créer la connexion
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/javamysql", "root", "");
			// Etat de connection
			Statement statement =  (Statement) connect.createStatement();
			// Créer une variable de séléction
			ResultSet result = ((java.sql.Statement) statement).executeQuery("select * from students");
			// Affichage des éléments
			while(result.next()) {
				System.out.println(" Nom:"+result.getString(2)+" Email: "+result.getString(3));
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
