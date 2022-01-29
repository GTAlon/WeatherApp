package compte.alerte;

import java.io.IOException;

import org.json.JSONException;

import api.OpenWeather;
import datatypes.Temperature;
import lieu.Lieu;

public class AlerteTemperature implements IAlerte{

	private Temperature temperature;
	private Lieu lieu;

	
	public AlerteTemperature() {
	
	}
	public AlerteTemperature(Temperature temperature,Lieu lieu) throws JSONException, IOException {
		this.setTemperature(temperature);
		this.lieu = lieu;
		isGood();
	}
	@Override
	public Object getValue() {
		return this;
	}
	
	public void isGood() throws JSONException, IOException {
		int apiTemp = OpenWeather.callWeather(lieu.getVille().getLibelle()).getJSONObject("main").getInt("temp");
		while(apiTemp != temperature.getValue()) {
			apiTemp = OpenWeather.callWeather(lieu.getVille().getLibelle()).getJSONObject("main").getInt("temp");
		}
		System.out.println("On a atteint la température de " + apiTemp + " degrè(s)" +  " à "+ lieu.getVille().getLibelle());
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	
	
}
