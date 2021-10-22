package compte;

import datatypes.IndiceUv;
import datatypes.Precipitation;
import datatypes.Temperature;
import datatypes.Vent;
import datatypes.Visibilite;

public class Alerte {

	private Temperature temperature;
	private Precipitation precipitation;
	private Vent vent;
	private Visibilite visibilite;
	private IndiceUv indice;
	
	
	
	public Alerte(Temperature temperature) {
		new Alerte(temperature,null,null,null,null);
	}
	
	public Alerte(Precipitation precipitation) {
		new Alerte(null,precipitation,null,null,null);
	}
	
	public Alerte(Vent vent) {
		new Alerte(null,null,vent,null,null);
	}
	
	public Alerte(Visibilite visibilite) {
		new Alerte(null,null,null,visibilite,null);
	}
	
	public Alerte(IndiceUv indice) {
		new Alerte(null,null,null,null,indice);
	}
	
	public Alerte(Temperature temperature, Precipitation precipitation, Vent vent, Visibilite visibilite,
			IndiceUv indice) {
		this.setTemperature(temperature);
		this.setPrecipitation(precipitation);
		this.setVent(vent);
		this.setVisibilite(visibilite);
		this.indice = indice;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public Precipitation getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(Precipitation precipitation) {
		this.precipitation = precipitation;
	}

	public Vent getVent() {
		return vent;
	}

	public void setVent(Vent vent) {
		this.vent = vent;
	}

	public Visibilite getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(Visibilite visibilite) {
		this.visibilite = visibilite;
	}
	
	
	
}
