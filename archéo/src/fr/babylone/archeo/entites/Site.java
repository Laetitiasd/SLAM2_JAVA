package fr.babylone.archeo.entites;

public class Site {

	private int numero;
	private int largeur;
	private int longueur;
	
	private ZoneFouille zone;
	
	public Site(int numero, int largeur, int longueur, ZoneFouille zone) {
		super();
		this.numero = numero;
		this.largeur = largeur;
		this.longueur = longueur;
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Site [numero=" + numero + ", largeur=" + largeur + ", longueur=" + longueur  + ", zone=" + zone + "]";
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getSuperficie() {
		return longueur * largeur;
	}

	public ZoneFouille getZone() {
		return zone;
	}

	public void setZone(ZoneFouille zone) {
		this.zone = zone;
	}

	
}
