package datatypes;

import stereotypes.IText;

public class Ville implements IText{

	private String libelle;
	
	public Ville(String libelleVille) {
		this.libelle = libelleVille;
		
	}

	@Override
	public String getLibelle() {
		return libelle;
	}
	
}
