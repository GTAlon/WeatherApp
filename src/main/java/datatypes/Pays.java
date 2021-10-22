package datatypes;

import stereotypes.IText;

public class Pays implements IText{

private String libelle;
	
	public Pays(String libellePays) {
		this.libelle = libellePays;
		
	}

	@Override
	public String getLibelle() {
		return libelle;
	}
	
}
