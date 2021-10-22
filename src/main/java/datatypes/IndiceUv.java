package datatypes;

import stereotypes.INumber;

public class IndiceUv implements INumber{

	
	private int indice;
	
	public IndiceUv(int indice) {
		if (indice < 0) {
			indice = 0;
		}
		if (indice > 16) {
			indice = 16;
		}
		this.indice = indice;
	}
	
	@Override
	public double getValue() {
		return  indice;
	}
}
