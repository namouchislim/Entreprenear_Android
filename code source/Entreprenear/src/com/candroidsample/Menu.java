package com.candroidsample;

import android.graphics.drawable.Drawable;


public class Menu {
	String nom;
	Drawable logo;
	public Menu(String nom, Drawable logo){
		this.nom=nom;
		this.logo=logo;
	}
	 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Drawable getLogo() {
		return logo;
	}
	public void setLogo(Drawable logo) {
		this.logo = logo;
	}
	
}

