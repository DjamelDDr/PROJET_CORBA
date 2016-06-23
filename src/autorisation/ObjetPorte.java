package autorisation;

public class ObjetPorte {
	private String nomPorte;
	private boolean estActive;
	
	
	public ObjetPorte(String nomPorte, boolean estActive) {
		super();
		this.nomPorte = nomPorte;
		this.estActive = estActive;
	}
	
	public ObjetPorte(String nomPorte) {
		this.nomPorte = nomPorte;
		this.estActive = true;
	}
	
	public String getNomPorte() {
		return nomPorte;
	}
	public void setNomPorte(String nomPorte) {
		this.nomPorte = nomPorte;
	}
	public boolean isEstActive() {
		return estActive;
	}
	public void setEstActive(boolean estActive) {
		this.estActive = estActive;
	}

}
