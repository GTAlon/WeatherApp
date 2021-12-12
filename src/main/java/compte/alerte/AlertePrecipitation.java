package compte.alerte;

import datatypes.Precipitation;

public class AlertePrecipitation implements IAlerte{

	private Precipitation precipitation;
	
	public AlertePrecipitation() {
		
	}
	
	public AlertePrecipitation(Precipitation precipitation) {
		this.setPrecipitation(precipitation);
	}

	public Precipitation getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(Precipitation precipitation) {
		this.precipitation = precipitation;
	}

	@Override
	public Object getValue() {
		return this;
	}
}
