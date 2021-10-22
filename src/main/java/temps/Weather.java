package temps;

import datatypes.IndiceUv;
import datatypes.Precipitation;
import datatypes.Temperature;
import datatypes.Vent;
import datatypes.Visibilite;
import jourHoraire.JourHoraire;
import lieu.Lieu;

public class Weather {
	
	private JourHoraire jourHoraire;
	private Lieu lieu;
	private Temperature temperature;
	private Precipitation precipitation;
	private Vent vent;
	private Visibilite visibilite;
	private IndiceUv indice;
	
	public Weather(JourHoraire jourHoraire, Lieu lieu, Temperature temperature, Precipitation precipitation, Vent vent,
			Visibilite visibilite, IndiceUv indice) {
		super();
		this.jourHoraire = jourHoraire;
		this.lieu = lieu;
		this.temperature = temperature;
		this.precipitation = precipitation;
		this.vent = vent;
		this.visibilite = visibilite;
		this.indice = indice;
	}

	public JourHoraire getJourHoraire() {
		return jourHoraire;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public Precipitation getPrecipitation() {
		return precipitation;
	}

	public Vent getVent() {
		return vent;
	}

	public Visibilite getVisibilite() {
		return visibilite;
	}

	public IndiceUv getIndice() {
		return indice;
	}
	
	
	

}
