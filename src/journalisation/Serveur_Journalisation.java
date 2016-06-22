package journalisation;

import org.omg.PortableServer.POA;
import org.omg.PortableServer.*;

public class Serveur_Journalisation {

	public static void main(String[] args) {
		try{
			// TODO Auto-generated method stub
			// Intialisation de l'ORB
	        //************************
	        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
	
	        // Gestion du POA
	        //****************
	        // Recuperation du POA
	        POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
	
	        // Creation du servant
	        //*********************
	        ImplJournalisation histo = new ImplJournalisation();
	        
	
	        // Activer le servant au sein du POA et recuperer son ID
	        byte[] monEuroId = rootPOA.activate_object(histo);
	
	        // Activer le POA manager
	        rootPOA.the_POAManager().activate();
	        String IORServant = orb.object_to_string(rootPOA.servant_to_reference(histo));
	        System.out.println("L'objet possede la reference suivante :");
	        System.out.println(IORServant);
	
	        // Lancement de l'ORB et mise en attente de requete
	        //**************************************************
	        orb.run();
	
		    }
			catch (Exception e) {
				e.printStackTrace();
			}
	}

}
