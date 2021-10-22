package datatypes;

import UOM.UOMVisibilite;
import stereotypes.INumber;

public class Visibilite implements INumber{
	
private double visu;
private UOMVisibilite uom;
	
	public Visibilite(double visu, UOMVisibilite uom) {
		if (visu < 0)
			visu = 0;
		this.visu = visu;
		this.uom = uom;
	}
	
	@Override
	public double getValue() {
		return visu;
	}

	public UOMVisibilite getUom() {
		return uom;
	}

}
