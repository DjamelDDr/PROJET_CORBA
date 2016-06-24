package autorisation;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import autorisation.AutorisationPackage.autorisationCollabInterdite;

public class ImplAutorisationImpl extends AutorisationPOA{	
	//de type (idCollab, zone)
	public HashMap<Integer, ObjetZone> touteLesAutoriz = new HashMap<Integer, ObjetZone>();

	public void  ajouterAutorisation(int idCollab, String nomZone, String typeCollab) {
		ObjetZone oz = new ObjetZone(nomZone.toUpperCase(), typeCollab.toUpperCase());
		touteLesAutoriz.put(idCollab, oz);	
	}
	
	public boolean  retirerAutorisation(int idCollab, String nomZone, String typeCollab) {
		boolean ret = false;
		if(touteLesAutoriz.containsKey(idCollab)) {
			touteLesAutoriz.remove(idCollab);
			ret = true;
		}else{
			ret = false;
		}
		return ret;
	}
	
	public String listDeszone(int idCollab, String typeCollab ){
		String str = "";int c =0;
		for (Entry<Integer, ObjetZone> e : touteLesAutoriz.entrySet()) {
			str+=e.getValue().getNomZone()+"\n";c++;
		}
		return "   "+c+"  Zone autorisée : "+str;
	}
	
	@Override
	public boolean autorisationPermanent(int id, String heureDebut,
			String heureFin, String numPorte)
			throws autorisationCollabInterdite {
		boolean repose= false;
		if (touteLesAutoriz.containsKey(id)){
			repose = true;
		}else throw new autorisationCollabInterdite("Vous n'etes pas autoriser à entrer");
		return true;
	}
/*
	public String touteLesAutoriz(int idCollab, String typeCollab ){
		String lesAutoriz = "";
		//
		System.out.println("IMPL : "+touteLesAutoriz.containsKey(idCollab));
		if(touteLesAutoriz.containsKey(idCollab)){
				//System.out.println(e.getValue().getNomZone().isEmpty()+"  bbbbb");
				lesAutoriz=touteLesAutoriz.get(1).consulteTouteLesAutoriz();

			System.out.println("tatata"+lesAutoriz+"eeee");
		}
		return lesAutoriz;
	}
*/
	@Override
	public boolean autorisationPonctuel(int id, String jourDebut,
			String jourFin, String heureDebut, String heureFin, String numPorte)
			throws autorisationCollabInterdite {
		boolean repose= false;
		if (touteLesAutoriz.containsKey(id)){
			repose = true;
		}else throw new autorisationCollabInterdite("Vous n'etes pas autoriser à entrer");
		return true;
	}

	public ImplAutorisationImpl() {
		super();		
		//ajout de jdd
		/*
		zone_1.ajouteUnePorte(p11);zone_1.ajouteUnePorte(p12);zone_1.ajouteUnePorte(p13);
		zone_2.ajouteUnePorte(p21);zone_2.ajouteUnePorte(p22);zone_2.ajouteUnePorte(p23);
		zone_3.ajouteUnePorte(p31);zone_3.ajouteUnePorte(p32);zone_3.ajouteUnePorte(p33);
		
		//ajout de jdd autoriz
		touteLesAutoriz.put(1, zone_1);
		touteLesAutoriz.put(1, zone_2);
		*/
		touteLesAutoriz.put(1, zone_1);
		touteLesAutoriz.put(1, zone_2);
		touteLesAutoriz.put(3, zone_3);
		
	}
	
	public ObjetZone zone_1 = new ObjetZone("ZONE_1","PERMANENT");
	public ObjetZone zone_2 = new ObjetZone("ZONE_2","PERMANENT");
	public ObjetZone zone_3 = new ObjetZone("ZONE_3","PERMANENT");
	
	//list de portes pour les 3 zone
	public ObjetPorte p11 = new ObjetPorte("P1_Z1");
	public ObjetPorte p12 = new ObjetPorte("P2_Z1");
	public ObjetPorte p13 = new ObjetPorte("P3_Z1");
	public ObjetPorte p21 = new ObjetPorte("P1_Z2");
	public ObjetPorte p22 = new ObjetPorte("P2_Z2");
	public ObjetPorte p23 = new ObjetPorte("P3_Z2");
	public ObjetPorte p31 = new ObjetPorte("P1_Z3");
	public ObjetPorte p32 = new ObjetPorte("P2_Z3");
	public ObjetPorte p33 = new ObjetPorte("P3_Z3");




	
	
}


