package compte.alerte;

import datatypes.IndiceUv;

public class AlerteIndiceUv implements IAlerte{

	private IndiceUv indice;
	
	public AlerteIndiceUv() {
		
	}
	
	public AlerteIndiceUv(IndiceUv indice) {
		
	}

	public IndiceUv getIndice() {
		return indice;
	}

	public void setIndice(IndiceUv indice) {
		this.indice = indice;
	}

	@Override
	public Object getValue() {
		return this;
	}
}
