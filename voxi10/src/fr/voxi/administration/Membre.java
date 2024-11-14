package fr.voxi.administration;

public class Membre extends Utilisateur {

	public Membre(String nom, String prenom, String email, String mdp, int etat, boolean bloque, String visuNotif) {
		super(nom, prenom, email, mdp, etat);
		this.bloque = bloque;
		this.visuNotif = visuNotif;
	}

	private boolean bloque;
	public String visuNotif ;
	

	public boolean getBloque() {
		return bloque;
	}

	public void setBloque(boolean bloque) {
		this.bloque = false;
	}

	public String getVisuNotif() {
		return visuNotif;
	}

	public void setVisuNotif(String visuNotif) {
		this.visuNotif = visuNotif;
	}

	@Override
	public String toString() {
		return "Membre [bloque=" + bloque + ", visuNotif=" + visuNotif + "]";
	}
	
	public boolean bloque(Membre bloquer) {
		return bloque = false;
	}

	

	
}
