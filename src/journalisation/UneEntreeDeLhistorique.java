package journalisation;

public class UneEntreeDeLhistorique {
	private Collaborateur collaborateur;
	private String numPorte;
	private String idZone;
	private String horaire;
	private boolean autorise;
	
public UneEntreeDeLhistorique(final Collaborateur collaborateur, final String numPorte, final String idZone, final String horaire, final boolean autorise) {
	this.collaborateur = collaborateur;
	this.numPorte = numPorte;
	this.idZone = idZone;
	this.horaire = horaire;
	this.autorise = autorise;
	
}

public Collaborateur getCollaborateur() {
	return collaborateur;
}

public void setCollaborateur(Collaborateur Collaborateur) {
	this.collaborateur = collaborateur;
}

public String getNumPorte() {
	return numPorte;
}

public void setNumPorte(String numPorte) {
	this.numPorte = numPorte;
}

public String getIdZone() {
	return idZone;
}

public void setIdZone(String idZone) {
	this.idZone = idZone;
}

public String getHoraire() {
	return horaire;
}

public void setHoraire(String horaire) {
	this.horaire = horaire;
}

public boolean isAutorise() {
	return autorise;
}

public void setAutorise(boolean autorise) {
	this.autorise = autorise;
}

}