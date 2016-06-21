package gestionDesEmpreintes;

import java.util.HashMap;
import java.util.Iterator;

public class ObjetUneEmpreinte {
	private int idCollaborateur;
	private String uneEmpreinte;
	private String typeCollab;
	
	public ObjetUneEmpreinte(int idCollaborateur, String uneEmpreinte, String typeCollab) {
		super();
		this.idCollaborateur = idCollaborateur;
		this.uneEmpreinte    = uneEmpreinte;
		this.typeCollab		 = typeCollab;
	}

	public String getUneEmpreinte() {
		return uneEmpreinte;
	}

	public void setUneEmpreinte(String uneEmpreinte) {
		this.uneEmpreinte = uneEmpreinte;
	}

	public String getTypeCollab() {
		return typeCollab;
	}

	public void setTypeCollab(String typeCollab) {
		this.typeCollab = typeCollab;
	}

	public int getIdCollaborateur() {
		return idCollaborateur;
	}

}
