package compte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Personne {

	
	String nom;
	String prenom;
	Date dateDeNaissance;
	Collection<Preference> preferences = new ArrayList<Preference>();
	
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
}
