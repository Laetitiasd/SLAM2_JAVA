package fr.babylone.archeo.entites;

public class Objet {

	private int numero;
	private String designation;
	private int completude;
	
	private Conservation conserv;
	
	public static final int COMPLET = 1;
	public static final int PARTIEL = 2;

	public Objet(int numero, String designation, int completude, Conservation conserv) {
		super();
		this.numero = numero;
		this.designation = designation;
		this.completude = completude;
		this.conserv = conserv;
	}

	public Objet(int numero, String designation, Conservation conserv) {
		super();
		this.numero = numero;
		this.designation = designation;
		this.conserv = conserv;
	}

	@Override
	public String toString() {
		return "Objet [numero=" + numero + ", designation=" + designation + ", completude=" + completude + ", conserv="
				+ conserv + "]";
	}

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getCompletude() {
		return completude;
	}

	public void setCompletude(int COMPLET) {
		this.completude = COMPLET;
	}

	public Conservation getConserv() {
		return conserv;
	}

	public void setConserv(Conservation conserv) {
		this.conserv = conserv;
	}
	
	
}
