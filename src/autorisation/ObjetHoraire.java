package autorisation;

import java.util.HashMap;

public class ObjetHoraire {
	private String heureFin;
	private String heureDebut;
	
	public ObjetHoraire(String heureDebut,String heureFin ) {
		this.heureFin = heureFin;
		this.heureDebut = heureDebut;
	}

	public String getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

	public String getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	
}
