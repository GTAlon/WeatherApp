package datatypes;

import java.util.Date;

import stereotypes.IDate;

public class Jour implements IDate{

	private Date jour;
	
	public Jour(Date date) {
		this.jour = date;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getDate() {
		return jour.getDay();
	}
	
	
}
