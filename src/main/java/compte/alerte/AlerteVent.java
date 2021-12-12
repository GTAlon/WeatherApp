package compte.alerte;

import datatypes.Vent;

public class AlerteVent implements IAlerte{

	private Vent vent;
	
	public AlerteVent() {
		
	}
	
	public AlerteVent(Vent vent) {
		this.setVent(vent);
	}

	public Vent getVent() {
		return vent;
	}

	public void setVent(Vent vent) {
		this.vent = vent;
	}

	@Override
	public Object getValue() {
		return this;
	}
}
