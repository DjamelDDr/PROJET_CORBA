package autorisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import annuaire.Collaborateur;

public class ObjetZone {
	final String lundi ="LUNDI";
	final String mardi ="MARDI";
	final String mercredi ="MERCREDI";
	final String jeudi="JEUDI";
	final String vendredi="VENDREDI";
	final String samedi="SAMEDI";
	final String dimanche="DIMANCHE";
	
	private String nomZone ;
	
	//attention aux doublons
	private ArrayList<ObjetPorte> listDeporte = new ArrayList<ObjetPorte>(); 
	private HashMap<String, ObjetHoraire> listDejours  = new HashMap<String, ObjetHoraire>();
	
	public ObjetZone(String nomZone){
		//pour un ponctuel
		this.nomZone=nomZone;
		listDejours.put(lundi, new ObjetHoraire("", ""));
		listDejours.put(mardi, new ObjetHoraire("", ""));
		listDejours.put(mercredi, new ObjetHoraire("", ""));
		listDejours.put(jeudi, new ObjetHoraire("", ""));
		listDejours.put(vendredi, new ObjetHoraire("", ""));
		listDejours.put(samedi, new ObjetHoraire("", ""));
		listDejours.put(dimanche, new ObjetHoraire("", ""));
	}
	
	
	public String consulteAutorizJour(String jour){
		String aut = "";
		System.out.println(jour);
			if (listDejours.get(jour)!=null){
				aut ="heure de début : "+listDejours.get(jour).getHeureDebut()
						+", \nheure de fin : "+listDejours.get(jour).getHeureFin();
			}else aut = "pas d'heure de début ni de fin";
		return aut;
	}
	
	
	public boolean ajouterHoraireAucollab(String jour, String heureDebut, String heureFin ) {
		boolean reponse = false;
			if (listDejours.get(jour)!= null){
				ObjetHoraire horaire = new ObjetHoraire(heureDebut, heureFin);
				listDejours.put(jour, horaire);
				reponse =true;					
			}else {reponse = false;}
			
		return reponse;
	}
	
	public boolean retirerHoraireAucollab(String jour){
		boolean reponse = false;
		if (listDejours.get(jour)!= null){
			listDejours.put(jour, null);
			reponse =true;
		}
		return reponse;
	}
	
	public String getNomZone() {
		return nomZone;
	}
	
	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}
	
	public void ajouteUnePorte(ObjetPorte nomPorte){
		this.listDeporte.add(nomPorte);
	}
	
	
}
