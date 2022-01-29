package lieu;

import datatypes.Pays;
import datatypes.Ville;

public class Lieu {

	private Ville vile;
	private Pays pays;
	
	public Lieu(Ville ville ,Pays pays) {
		this.vile = ville;
		this.pays = pays;
	}

	public Ville getVille() {
		return vile;
	}

	public Pays getPays() {
		return pays;
	}
}
