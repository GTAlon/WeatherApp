package compte.alerte;

import datatypes.Temperature;

public class AlerteTemperature implements IAlerte{

	private Temperature temperature;

	
	public AlerteTemperature() {
	
	}
	public AlerteTemperature(Temperature temperature) {
		this.setTemperature(temperature);
	}
	@Override
	public Object getValue() {
		return this;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	
	
}
