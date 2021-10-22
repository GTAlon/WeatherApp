package datatypes;

import UOM.UOMTemperature;
import stereotypes.INumber;

public class Temperature implements INumber {

	private int temp;
	private UOMTemperature uom;
	
	public Temperature(int temp,UOMTemperature uom) {
		if (temp < - 99) {
			temp = - 99;
		}
		if (temp > 99) {
			temp = 99;
		}
		this.temp = temp;
		this.uom = uom;
	}
	
	@Override
	public double getValue() {
		return (double) temp;
	}

	public UOMTemperature getUom() {
		return uom;
	}

}
