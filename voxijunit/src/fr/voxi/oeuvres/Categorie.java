package fr.voxi.oeuvres;

import java.util.ArrayList;

public class Categorie {

	private int numero;
	private String libelle;
	
	
	public Categorie(int numero, String libelle) {
		super();
		this.numero = numero;
		this.libelle = libelle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	ArrayList<Oeuvre> ListeOeuvres= new ArrayList<>();
	
	public boolean addOeuvre(Oeuvre oeuvres) {
		if( ListeOeuvres.contains(oeuvres) == false ) {
			ListeOeuvres.add(oeuvres);
			return true;
			
		}else {
			return false;
		}
	}
	
	
	
	public boolean suppOeuvre(Oeuvre oeuvres) {
		if( ListeOeuvres.contains(oeuvres) == true ) {
			ListeOeuvres.remove(oeuvres);
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
}
	

