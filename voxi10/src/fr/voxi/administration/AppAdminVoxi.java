package fr.voxi.administration;
import java.util.ArrayList;

public class AppAdminVoxi {

	public static void main(String[] args) {
		
		
		ArrayList<Utilisateur> utilisateurs= new ArrayList<Utilisateur>();
		utilisateurs.add(new Membre("ZAKI", "Selma"," azerty" ,"s.zaki@gns .fr ",1, false, null));
		utilisateurs.add(new Membre("CAMOIT", "Alexis", "azerty", "a.camoit@gns .fr", 1, true, null));
		utilisateurs.add(new Membre("KARIM", "Lamia", "azerty", "l.karim@gns.fr",2, false, null));
		
		utilisateurs.add(new Moderateur("LEBRETON", "Jules", " azerty"," j.lebreton@gmail.com",1, "jbreton", 33));
		utilisateurs.add(new Moderateur("BA", "Béchir", "azerty","bechir.ba@gmail.com", 2,"bba", 103));
		utilisateurs.add(new Moderateur("ESSAMAMI", "Hamza", "azerty", "hamza.mami@free.fr",1, "hessa", 8));
		
		//2//
		 for (Utilisateur utilisateur : utilisateurs) {
	            System.out.println("Nom : " + utilisateur.getNom() + ", Prénom : " + utilisateur.getPrenom());
	        }
		
		 //3//
		 
		 for(Utilisateur utilisateur : utilisateurs) {
			 int var = 0;
			if(utilisateur.getEtat() == 1) {
				var++;
				System.out.println("Utilisateur connecté" + " "+ var + " " + utilisateur.getNom()+ " " + utilisateur.getPrenom());
				}	
			}
		 //4//
		 
		 for(Utilisateur utilisateur : utilisateurs) {
			 
			 if(utilisateur.getEtat() == 1) {
				 
				utilisateur.seDeconnecter();	
				 
				System.out.println("Etat des utilisateurs : " + " " + utilisateur.getEtat() +" "+ utilisateur.getNom());	 
			 }	 
		 }
		 
		 //5//
		
			if(((Membre)(utilisateurs.get(0))).seConnecter("jberto", "azerty") == true) {
				System.out.println("Connexion réussi");
			}
			else {
				System.out.println("Connexion échouer");
			}
			
		//6//
			
			if(utilisateurs.get(0).seConnecter("s.zaki@gns .fr", "azerty")) {
				System.out.println("Connexion réussi");
			}
			else {
				System.out.println("La connexion échoué");
			}
			
		//7//
			
			
			for(Utilisateur utilisateur : utilisateurs) {
				
				if(utilisateur instanceof Membre ) {
					utilisateur.seConnecter(utilisateur.getEmail(), utilisateur.getMdp());
					System.out.println("Tentative d'authentification pour les Membres" +" "+ utilisateur.getNom() +" "+ utilisateur.getPrenom() +" " + utilisateur.getEtat());
				}
				else {
					
					utilisateur.seConnecter(((Moderateur)utilisateur).getLogin(), utilisateur.getMdp());
					System.out.println("Tentative d'authentification pour les Modérateurs" +" "+ utilisateur.getNom() +" "+ utilisateur.getPrenom()  +" " + utilisateur.getEtat());
				} 
			}
			
			//8//
			
			for(Utilisateur utilisateur : utilisateurs) {
				
			}
			
			
			
		}
		 
		 
		
		 
}
		 
		 
		 
		 

	



