package autorisation;

public class ObjetJour {
//	private String referentielJour[] = {"LU","MA","ME","JE",} ;
	private String jourFin;
	private String heureDebut;
	private String heureFin;
	private String jourDebut;
	
	public ObjetJour(String heureFin, String jourDebut) {
		//pour les collab permanent
		this.heureFin = heureFin;
		this.jourDebut = jourDebut;
	}
	public ObjetJour(String jourFin, String heureDebut, String heureFin,String jourDebut) {
		//pour les collab ponctuel
		this.jourFin = jourFin;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.jourDebut = jourDebut;
	}
	public String getJourDebut() {
		return jourDebut;
	}
	public void setJourDebut(String jourDebut) {
		this.jourDebut = jourDebut;
	}
	public String getJourFin() {
		return jourFin;
	}
	public void setJourFin(String jourFin) {
		this.jourFin = jourFin;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

}
