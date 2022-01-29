package compte.alerte;

import java.io.IOException;

import org.json.JSONException;

import UOM.UOMVitesseVent;
import api.OpenWeather;
import datatypes.Vent;
import lieu.Lieu;

public class AlerteVent implements IAlerte{

	private Vent vent;
	private Lieu lieu;
	
	public AlerteVent() {
		
	}
	
	public AlerteVent(Vent vent) {
		this.setVent(vent);
	}
	public void isGood() throws JSONException, IOException {
		double apiVent = (double) OpenWeather.callWeather(lieu.getVille().getLibelle()).getJSONObject("wind").getDouble("speed")
				;
		while(apiVent != vent.getValue()) {
			apiVent = (double) OpenWeather.callWeather(lieu.getVille().getLibelle()).get("visibility");
		}
		System.out.println("Le vent souffle à " + apiVent+  " à "+ lieu.getVille().getLibelle());
	}

	public Vent getVent() {
		return vent;
	}

	public void setVent(Vent vent) {
		this.vent = vent;
	}

	@Override
	public Object getValue() {
		return this;
	}
}
