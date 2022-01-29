package compte.alerte;

import java.io.IOException;

import org.json.JSONException;

import api.OpenWeather;
import datatypes.Visibilite;
import lieu.Lieu;

public class AlerteVisibilite implements IAlerte{

	private Visibilite visibilite ;
	private Lieu lieu;

	
	public AlerteVisibilite() {
		
	}
	
	public AlerteVisibilite(Visibilite visibilite,Lieu lieu) throws JSONException, IOException {
		this.setVisibilite(visibilite);
		this.lieu=lieu;
		isGood();
	}

	public void isGood() throws JSONException, IOException {
		int apiVisibility = (int) OpenWeather.callWeather(lieu.getVille().getLibelle()).get("visibility");
		while(apiVisibility != visibilite.getValue()) {
			apiVisibility = (int) OpenWeather.callWeather(lieu.getVille().getLibelle()).get("visibility");
		}
		System.out.println("Le niveau de visibilité à atteint " + apiVisibility+  " à "+ lieu.getVille().getLibelle());
	}
	
	public Visibilite getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(Visibilite visibilite) {
		this.visibilite = visibilite;
	}

	@Override
	public Object getValue() {
		return this;
	}
}
