package fr.babylone.archeo.entites;

public class ZoneFouille {
	
	private int numero;
	private String ville;
	
	
	public ZoneFouille(int numero, String ville) {
		super();
		this.numero = numero;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "ZoneFouille [numero=" + numero + ", ville=" + ville + "]";
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	

}
