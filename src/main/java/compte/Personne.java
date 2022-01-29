package compte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class Personne {

	
	private String nom;
	private String prenom;
	private Optional<Date> dateDeNaissance;
	private Collection<Preference> preferences = new ArrayList<Preference>();
	
	
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

	public Optional<Date> getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Optional<Date> dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	public Collection<Preference> getPreferences() {
		return preferences;
	}

	public void addPreference(Preference pref) {
		this.preferences.add(pref);
	}
}
