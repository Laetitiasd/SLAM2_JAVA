package fr.voxi.oeuvres;

public class Oeuvre {

	private int numero;
	private String titre;
	
	public Oeuvre(int numero, String titre) {
		super();
		this.numero = numero;
		this.titre = titre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Oeuvre [numero=" + numero + ", titre=" + titre + "]";
	}
	
	
	
}
