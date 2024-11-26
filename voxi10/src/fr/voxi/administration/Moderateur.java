package fr.voxi.administration;

public class Moderateur extends Utilisateur implements Administrateur{

	private String login;
	private int nbAlertesEnvoyees;
	
	public Moderateur(String nom, String prenom, String email, String mdp, int etat, String login,
			int nbAlertesEnvoyees) {
		super(nom, prenom, email, mdp, etat);
		this.login = login;
		this.nbAlertesEnvoyees = nbAlertesEnvoyees;
	}

	@Override
	public String toString() {
		return "Moderateur [login=" + login + ", nbAlertesEnvoyees=" + nbAlertesEnvoyees + "]";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getNbAlertesEnvoyees() {
		return nbAlertesEnvoyees;
	}

	public void setNbAlertesEnvoyees(int nbAlertesEnvoyees) {
		this.nbAlertesEnvoyees = 0;
	}

	
	public void alerter(Moderateur Joueur, String MS) {
		alerter(Joueur, MS);	
	}

	@Override
	public void bloquer(Membre Joueur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debloquer(Membre Joueur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean seConnecter(String CO, String Reussi) {
		
		if(CO == this.getEmail() || CO == this.getLogin() && Reussi == this.getMdp() ) {
			this.setEtat(CONNECTE);
			return true;
		}
		return false;
	}
	
	
	
}
