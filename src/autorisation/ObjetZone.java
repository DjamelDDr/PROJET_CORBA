package autorisation;

import java.util.ArrayList;

public class ObjetZone {
//zone 		=> (nomZone, list[Objetporte])
	private String nomZone ;
	
	private ArrayList<ObjetPorte> listDeporte = new ArrayList<ObjetPorte>(); ;
	
	public ObjetZone(String nomZone, String nomPorte){
		this.nomZone=nomZone;
		this.listDeporte.add(new ObjetPorte(nomPorte));
		
	}
	
	public void ajouteUnePorte(String nomPorte){
		this.listDeporte.add(new ObjetPorte(nomPorte));
	}

	public ArrayList<ObjetPorte> getListDeporte() {
		return listDeporte;
	}

	public void setListDeporte(ArrayList<ObjetPorte> listDeporte) {
		this.listDeporte = listDeporte;
	}

	public String getNomZone() {
		return nomZone;
	}
	
	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}
	
}
