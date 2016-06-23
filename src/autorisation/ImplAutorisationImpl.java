package autorisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import journalisation.UneEntreeDeLhistorique;

import org.omg.CORBA.BooleanHolder;

import autorisation.AutorisationPackage.autorisationCollabInterdite;

public class ImplAutorisationImpl extends AutorisationPOA{	
	public HashMap<Long, String[]> historisation = 
			new HashMap<Long, String[]>();
	
	public HashMap<Collaborateur, ObjetZone> autoriser = new HashMap<Collaborateur, ObjetZone>();
	


	@Override
	public boolean autorisationPonctuel(Collaborateur c, String jourDebut,
			String jourFin, String heureDebut, String heureFin, String numPorte)
			throws autorisationCollabInterdite {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void ajouterAutoriz(int idCollab, String laZone){
		switch (laZone) {
		case "A":
			
			break;
		case "B":
			
			break;
		case "C":
			
			break;
		default:
			break;
		}
	}
	

	public ImplAutorisationImpl() {
		super();		
		zone_1.ajouteUnePorte(p11);zone_1.ajouteUnePorte(p12);zone_1.ajouteUnePorte(p13);
		zone_2.ajouteUnePorte(p21);zone_2.ajouteUnePorte(p22);zone_2.ajouteUnePorte(p23);
		zone_3.ajouteUnePorte(p31);zone_3.ajouteUnePorte(p32);zone_3.ajouteUnePorte(p33);
	}
	
	public ObjetZone zone_1 = new ObjetZone("ZONE_1");
	public ObjetZone zone_2 = new ObjetZone("ZONE_2");
	public ObjetZone zone_3 = new ObjetZone("ZONE_3");
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



	@Override
	public boolean autorisationPermanent(Collaborateur arg0_in,
			String heureDebut, String heureFin, String numPorte)
			throws autorisationCollabInterdite {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}


