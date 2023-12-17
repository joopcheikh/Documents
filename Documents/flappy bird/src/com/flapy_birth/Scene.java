package com.flapy_birth;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Scene extends JPanel
{
	// image de fond
	private ImageIcon icoBandeFond;
	
	private Image imgBandeFond;
	
	private final int LARGEUR_BANDE_FOND = 140;

	public Scene(ImageIcon icoBandeFond, Image imgBandeFond) {
		super();
		this.icoBandeFond = new ImageIcon(getClass().getResource("img/bandeFondEcran.png"));
		this.imgBandeFond = imgBandeFond;
	}
	
	// constructor
	
}
