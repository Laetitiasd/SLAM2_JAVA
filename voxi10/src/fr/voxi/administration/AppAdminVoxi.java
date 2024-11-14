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
		
		System.out.println(utilisateurs.getFirst());
		
		
	}

}
