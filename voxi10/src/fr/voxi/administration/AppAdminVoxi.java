package fr.voxi.administration;
import java.util.ArrayList;

public class AppAdminVoxi {

	public static void main(String[] args) {
		
		
		ArrayList<Utilisateur> utilisateurs= new ArrayList<Utilisateur>();
		utilisateurs.add(new Membre("ZAKI", "Selma"," azerty" ,"s.zaki@gns .fr ",2, false, null));
		utilisateurs.add(new Membre("CAMOIT", "Alexis", "azerty", "a.camoit@gns .fr", 2, true, null));
		utilisateurs.add(new Membre("KARIM", "Lamia", "azerty", "l.karim@gns.fr",1, false, null));
		
		utilisateurs.add(new Moderateur("LEBRETON", "Jules", " azerty"," j.lebreton@gmail.com",2, "jbreton", 33));
		utilisateurs.add(new Moderateur("BA", "Béchir", "azerty","bechir.ba@gmail.com", 1,"bba", 103));
		utilisateurs.add(new Moderateur("ESSAMAMI", "Hamza", "azerty", "hamza.mami@free.fr",2, "hessa", 8));
		
		//2//
		
		 System.out.println("exercice 2\n");
		
		 for (Utilisateur utilisateur : utilisateurs) {
	            System.out.println("Nom : " + utilisateur.getNom() + ", Prénom : " + utilisateur.getPrenom());
	        }
		 System.out.println("\n");
		
		 //3//
		 System.out.println("exercice 3\n");
		 
		 for(Utilisateur utilisateur : utilisateurs) {
			 int var = 0;
			if(utilisateur.getEtat() == 1) {
				var++;
				System.out.println("Utilisateur connecté" + " "+ var + " " + utilisateur.getNom()+ " " + utilisateur.getPrenom());
				}	
			}
		 System.out.println("\n");
		 
		 //4//
		 System.out.println("exercice 4\n");
		 
		 for(Utilisateur utilisateur : utilisateurs) {
			 
			 if(utilisateur.getEtat() == 1) {
				 
				utilisateur.seDeconnecter();	
				 
				System.out.println("Etat des utilisateurs : " + " " + utilisateur.getEtat() +" "+ utilisateur.getNom());	 
			 }	 
		 }
		 System.out.println("\n");
		 
		 //5//
		 System.out.println("exercice 5\n");
		 
			if(((Membre)(utilisateurs.get(0))).seConnecter("jberto", "azerty") == true) {
				System.out.println("Connexion réussi");
			}
			else {
				System.out.println("Connexion échouer");
			}
			System.out.println("\n");
			
		//6//
			System.out.println("exercice 6\n");
			
			if(utilisateurs.get(0).seConnecter("s.zaki@gns.fr", "azerty")) {
				System.out.println("Connexion réussi");
			}
			else {
				System.out.println("La connexion échoué");
			}
			System.out.println("\n");
			
		//7//
			System.out.println("exercice 7\n");
			
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
			System.out.println("\n");
			
			//8//
			System.out.println("exercice 8\n");
			
			Utilisateur admin1 = new Moderateur("LEBRETON", "Jules", " azerty"," j.lebreton@gmail.com", Utilisateur.DECONNECTE, "jbreton", 33);
			utilisateurs.add(admin1);
			
			Utilisateur audit1 = new Membre("CAMOIT", "Alexis", "a.camoit@gns.fr", "azerty", Utilisateur.DECONNECTE, true, null);
			utilisateurs.add(audit1);
			System.out.println(audit1);
			((Moderateur)admin1).debloquer((Membre)audit1);
			System.out.println(audit1);
			System.out.println("le compte Alexis Camoit est réactiver");
			System.out.println(audit1.seConnecter("a.camoit@gns.fr", "azerty"));		
			System.out.println("\n");
			
			//9//
			System.out.println("exercice 9\n");
			
			Utilisateur admin2 = new Moderateur("ESSAMAMI", "Hamza", "azerty", "hamza.mami@free.fr", Utilisateur.DECONNECTE, "hessa", 8);
			utilisateurs.add(admin2);
			
			Utilisateur audit2 = new Membre("ZAKI", "Selma"," s.zaki@gns .fr" ,"azerty ", Utilisateur.DECONNECTE, false, null);
			utilisateurs.add(audit2);
			
			((Moderateur)admin2).bloquer((Membre)audit2);
			
			System.out.println("le compte de Selma ZAKI est bloquer");
			
			System.out.println(audit2.seConnecter("s.zaki@gns.fr", "azerty"));		
			System.out.println("\n");
			
			//10//
			System.out.println("exercice 10\n");
			
			Utilisateur admin3 = new Moderateur("BA", "Béchir", "bechir.ba@gmail.com","azerty", Utilisateur.CONNECTE,"bba", 103);
			utilisateurs.add(admin3);
			
			Utilisateur audit3 = new Membre("KARIM", "Lamia", "l.karim@gns.fr", "azerty",Utilisateur.CONNECTE, false, null);
			utilisateurs.add(audit3);
			
			System.out.println(((Moderateur)admin3).getNbAlertesEnvoyees());
			
			System.out.println(((Moderateur)admin3).alerter((Membre)audit3, "limite injurieux"));
			System.out.println(((Moderateur)admin3).getNbAlertesEnvoyees());
	}
			
				
	
			
}
		 

		
		 

		 
		 
		 
		 

	



