package datatypes;

import UOM.UOMVitesseVent;
import stereotypes.INumber;

public class Vent implements INumber{
	
private double vitesse;
private UOMVitesseVent uom;
	
	public Vent(double vitesse,UOMVitesseVent uom) {
		if (vitesse < 0)
			vitesse = 0;
		this.vitesse = vitesse;
		this.uom = uom;
	}
	
	@Override
	public double getValue() {
		return vitesse;
	}

	public UOMVitesseVent getUom() {
		return uom;
	}

}
