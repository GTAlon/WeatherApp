package compte.alerte;

import datatypes.Visibilite;

public class AlerteVisibilite implements IAlerte{

	private Visibilite visibilite ;
	
	
	public AlerteVisibilite() {
		
	}
	
	public AlerteVisibilite(Visibilite visibilite) {
		this.setVisibilite(visibilite);
	}

	public Visibilite getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(Visibilite visibilite) {
		this.visibilite = visibilite;
	}

	@Override
	public Object getValue() {
		return this;
	}
}
