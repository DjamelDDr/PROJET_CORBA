package gestionDesEmpreintes;

import java.util.Scanner;

import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import utils.ObjectCorba;

public class ClientGestionDesEmpreintes {

	public static void main(String[] args) {
		try {
	        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
	        POA rootPOA;
			rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
	        ImplGestionDesEmpreintes serviceEmpreinte = new ImplGestionDesEmpreintes();
	        rootPOA.the_POAManager().activate();
	        NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow
	        		(orb.resolve_initial_references("NameService"));
	        org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
	        String nomObj = ObjectCorba.SYSTEM_EMPREINTE;
	        nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomObj,"");
	        nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(serviceEmpreinte));
	        System.out.println("==> Nom '"+ nomObj + "' est enregistre dans le service de noms.");
	
	        String IORServant = orb.object_to_string(rootPOA.servant_to_reference(serviceEmpreinte));
	        System.out.println("L'objet possede la reference suivante :");
	        System.out.println(IORServant);
	        orb.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		Scanner scPerm = new Scanner(System.in);
		Scanner scPonc = new Scanner(System.in);
		
		Scanner entree_photo = new Scanner(System.in);
		Scanner entree_Nom = new Scanner(System.in);
		Scanner entree_Prenom = new Scanner(System.in);
		Scanner entree_mdp = new Scanner(System.in);
		Scanner entree_id = new Scanner(System.in);
		boolean fin = false;
		boolean finPerm = false;
		boolean finPonc = false;
		String name = null;
		String request = null;
		String response = null;

		while (!fin) {

			int choice;

			System.out.println("+---------------------------------------------------+");
			System.out.println("| 1 - Ajouter?                                     |");
			System.out.println("| 2 - Accueil?                                      |");
			System.out.println("| 0 - Terminer                                      |");
			System.out.println("+---------------------------------------------------+");

			choice = sc.nextInt();
			sc.nextLine(); // saute le retour à la ligne
			
			switch (choice) {
			case 1:
			}
		}
		
		
	}

}
