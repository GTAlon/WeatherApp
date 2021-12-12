package datatypes;

import stereotypes.IText;

public class Text implements IText{

	private String libelle;
	
	public Text(String text) {
		this.libelle = text;
	}
	
	
	@Override
	public String getLibelle() {
		return libelle;
	}

}
