package gestionDesComptes;

public class UneLigneCollaborateur {
	private String nom; 
	private String prenom;
	private String photo; 
	private long id;
	private String motDePasse;
	private String typeCollab;
	enum typeCollaborateur{permanent, ponctuel}
	
	public UneLigneCollaborateur(String nom, String prenom, String photo,
			long id, String motDePasse, String typeCollab) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.photo = photo;
		this.id = id;
		this.motDePasse = motDePasse;
		if(typeCollab == typeCollaborateur.permanent.toString()){
			this.typeCollab = "permanent";
		}else {
			this.typeCollab = "ponctuel";
		}
	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTypeCollab() {
		return typeCollab;
	}

	public void setTypeCollab(String typeCollab) {
		this.typeCollab = typeCollab;
	}

	public long getId() {
		return id;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	

}
