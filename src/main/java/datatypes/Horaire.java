package datatypes;

import java.util.Date;

import stereotypes.IDate;

public class Horaire implements IDate{

	private Date horaire;
	
	public Horaire(Date date) {
		this.horaire = date;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getDate() {
		return horaire.getHours();
	}

	
}
