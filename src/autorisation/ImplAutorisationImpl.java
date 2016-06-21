package autorisation;

import java.util.HashMap;
import java.util.List;

import journalisation.UneEntreeDeLhistorique;

import org.omg.CORBA.BooleanHolder;

import autorisation.AutorisationPackage.autorisationCollabInterdite;

public class ImplAutorisationImpl extends AutorisationPOA{
	
	
	public static String[] zoneA={"P1","P2","P3"};
	public static String[] zoneB={"P4","P5","P6"};
	public static String[] zoneC={"P7","P8","P9"};
	public HashMap<Long, String[]> historisation = 
			new HashMap<Long, String[]>();
	
	@Override
	public boolean autorisationPermanent(int id, String heureDebut,
			String heureFin, String numPorte)
			throws autorisationCollabInterdite {
		// TODO Auto-generated method stub
		
		
		return false;
	}

	@Override
	public boolean autorisationPonctuel(int id, String jourDebut,
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

}
