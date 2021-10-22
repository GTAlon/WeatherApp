package jourHoraire;

import datatypes.Horaire;
import datatypes.Jour;

public class JourHoraire {

	private Jour jour;
	private Horaire horaire;
	
	public JourHoraire(Jour jour,Horaire horaire) {
		this.jour = jour;
		this.horaire = horaire;
	}

	public Horaire getHoraire() {
		return horaire;
	}

	public Jour getJour() {
		return jour;
	}
}
