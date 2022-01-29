package main;

import java.io.IOException;
import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;

import UOM.UOMTemperature;
import UOM.UOMVisibilite;
import UOM.UOMVitesseVent;
import api.OpenWeather;
import compte.Personne;
import compte.Preference;
import compte.alerte.AlerteTemperature;
import datatypes.Horaire;
import datatypes.Jour;
import datatypes.Pays;
import datatypes.Temperature;
import datatypes.Vent;
import datatypes.Ville;
import datatypes.Visibilite;
import jourHoraire.JourHoraire;
import lieu.Lieu;
import temps.Weather;

public class weather {

	public static void main(String[] args) throws JSONException, IOException {
		// Donnée méteo d'une ville + affichage
		String ville = "Paris";
		
		JSONObject apiDuJour = OpenWeather.callWeather(ville);
		
		
		Date dateDuJour  = new Date();
		JourHoraire today = new JourHoraire(new Jour(dateDuJour),new Horaire(dateDuJour));
		Lieu lieu = new Lieu(new Ville(ville),new Pays("France"));
		Temperature temperature = new Temperature(apiDuJour.getJSONObject("main").getInt("temp"),
				UOMTemperature.CELSIUS);
		Vent vent = new Vent(apiDuJour.getJSONObject("wind").getDouble("speed"),
				UOMVitesseVent.KILOMETREHEURE);
		Visibilite visibilite = new Visibilite(apiDuJour.getDouble("visibility"),UOMVisibilite.METRE);
		
		Weather weather = new Weather(today,lieu,temperature,null,vent,visibilite,null);
		System.out.println("Météo du " + weather.getJourHoraire().getJour().getDate() + " à " + weather.getLieu().getVille().getLibelle());
		System.out.println("Il est " + weather.getJourHoraire().getHoraire().getDate() + " heure(s)");
		System.out.println("Il fait " + weather.getTemperature().getValue()+ " degré(s)");
		System.out.println("Le vent souffle à " + weather.getVent().getValue() + " km/h");
		System.out.println("Visibilité a " + weather.getVisibilite().getValue()+ " mètres");


		
		// Creation de compte + ajout des preferences
		Personne person = new Personne("Gerryl","Talon");
		Preference pref = new Preference(new Lieu(
				new Ville("Bruxelles"),new Pays("Belgique")),new JourHoraire(new Jour(new Date(25,15,121)),new Horaire(new Date())));
		
		pref.addAlerte(new AlerteTemperature(new Temperature(10,UOMTemperature.CELSIUS),pref.getLieu()));
		person.addPreference(pref);
	}

}
