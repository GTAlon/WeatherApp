package datatypes;

import UOM.UOMPrecipitation;
import stereotypes.INumber;

public class Precipitation implements INumber{

	private double precipitation;
	private UOMPrecipitation uom;
	
	public Precipitation(double precipitation,UOMPrecipitation uom) {
		if (precipitation < 0)
			precipitation = 0;
		this.precipitation = precipitation;
		this.uom= uom;
	}
	
	@Override
	public double getValue() {
		return precipitation;
	}

	public UOMPrecipitation getUom() {
		return uom;
	}

}
