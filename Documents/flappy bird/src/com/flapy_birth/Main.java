package com.flapy_birth;

import javax.swing.JFrame;

public class Main
{
	
	public static JFrame fenetre;
	
	// varible pour panneaux
	public static Scene scene;
	
	public static void main(String[] args)
	{
		JFrame fenetre = new JFrame("Flappy Birth");
		scene = new Scene();
		
		// dimension de la fenetre
		fenetre.setSize(1000,650);
		
		// centrer la fenetre à l'écran
		fenetre.setLocationRelativeTo(null);
		
		// non demensionnable
		fenetre.setResizable(false);
		
		// mettre la fenetre au top
		fenetre.setAlwaysOnTop(true);
		
		// associer la scène au panel
		fenetre.setContentPane(scene);
		
		// instruction qui permet de fermer le programme
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Affichage de la fenetre
		fenetre.setVisible(true);
		
		

	}

}
