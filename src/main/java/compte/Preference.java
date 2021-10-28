package compte;

import java.util.ArrayList;
import java.util.Collection;

import compte.alerte.IAlerte;
import jourHoraire.JourHoraire;
import lieu.Lieu;

public class Preference {

	
	private Lieu lieu;
	private JourHoraire jourHoraire;
	Collection<IAlerte> alertes = new ArrayList<>();
	
	public Preference(Lieu lieu, JourHoraire jourHoraire) {
		super();
		this.setLieu(lieu);
		this.setJourHoraire(jourHoraire);
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public JourHoraire getJourHoraire() {
		return jourHoraire;
	}

	public void setJourHoraire(JourHoraire jourHoraire) {
		this.jourHoraire = jourHoraire;
	}
	
	public void addAlerte(IAlerte alerte) {
		alertes.add(alerte);
	}
	
	
}
