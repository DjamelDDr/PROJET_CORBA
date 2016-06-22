package gestionDesEmpreintes;

import java.util.Scanner;

import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import annuaire.AnnuairePackage.collabNExistepas;
import utils.ObjectCorba;
import gestionDesComptes.*;
public class ClientGestionDesEmpreintes {
	public static annuaire.Annuaire  serviceAnnuaire;
	
	public static void main(String[] args) {
	ImplGestionDesEmpreintes objempreinte = new ImplGestionDesEmpreintes();
	try{	
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
		
        // Nom de l'objet CORBA
        //String idObjEmp = ""

        String idObjAnnuair = "serviceAnnuaire";
        
        // Recuperation du naming service
        org.omg.CosNaming.NamingContext nameRoot =
        		org.omg.CosNaming.NamingContextHelper.narrow
        		(orb.resolve_initial_references("NameService"));  		

        // Construction du nom a rechercher
        org.omg.CosNaming.NameComponent[] nameToFindAnnuaire = new org.omg.CosNaming.NameComponent[1];
        nameToFindAnnuaire[0] = new org.omg.CosNaming.NameComponent(idObjAnnuair,"");
        
        // Recherche aupres du naming service
        org.omg.CORBA.Object distantServiceAnnuaire = nameRoot.resolve(nameToFindAnnuaire);
        serviceAnnuaire = annuaire.AnnuaireHelper.narrow(distantServiceAnnuaire);
       
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	

	boolean fin = false;
	boolean finPerm = false;
	boolean finPonc = false;
	String name = null;
	String request = null;
	String response = null;

	Scanner sc = new Scanner(System.in);
	Scanner scPerm = new Scanner(System.in);
	Scanner scPonc = new Scanner(System.in);
	
	Scanner entree_photo = new Scanner(System.in);
	Scanner entree_Nom = new Scanner(System.in);
	Scanner entree_rempr = new Scanner(System.in);
	Scanner entree_mdp = new Scanner(System.in);
	Scanner entree_id = new Scanner(System.in);

	while (!fin) {		
		int choice;
		System.out.println("+---------------------------------------------------+");
		System.out.println("|*************Gestion des Empreintes****************|");			
		System.out.println("+---------------------------------------------------+");
		System.out.println("| 1 - Ajouter ?                                          |");
		System.out.println("| 2 - Modifier?                                      |");
		System.out.println("| 0 - Terminer                                      |");
		System.out.println("+---------------------------------------------------+");

		choice = sc.nextInt();
		sc.nextLine(); // saute le retour à la ligne
		
		switch (choice) {
		case 1://ajouter
			System.out.println("Entrer votre Id ");
			int idCollab = entree_id.nextInt();				
			System.out.println("Permanent ou Ponctuel? :");
			String typ = scPonc.nextLine();	
			System.out.println("entrer l'empreinte");
			String newempreinte = entree_rempr.nextLine();
			System.out.println("entrer le mot de passe :");
			String motDePassez = entree_mdp.nextLine();	
	
			try {
				if(serviceAnnuaire.verifierDansAnnuaire(idCollab, motDePassez)){
					String msg = objempreinte.ajouterEmpreinte(idCollab, newempreinte, typ);
					System.out.println(msg);
				}else System.out.println("Veuillez saisir des entrées correctes");
			} catch (collabNExistepas e) {
				System.out.println(e.messageDErreur);
			}
			break;
		case 2://modifier
			System.out.println("Entrer votre Id ");
			int idCollaba = entree_id.nextInt();				
			System.out.println("Permanent ou Ponctuel? :");
			String typa = scPonc.nextLine();	
			System.out.println("entrer l'empreinte");
			String newempreintea = entree_rempr.nextLine();
			System.out.println("entrer le mot de passe :");
			String motDePasseza = entree_mdp.nextLine();	
			try {
				if(serviceAnnuaire.verifierDansAnnuaire(idCollaba,motDePasseza)){
					String msga = objempreinte.modifierEmpreinte(newempreintea, idCollaba,typa);
					System.out.println(msga);
				}else System.out.println("Veuillez saisir des entrées correctes");
			} catch (collabNExistepas e) {
				System.out.println(e.messageDErreur);
			}
			break;
		default:
			break;
		case 0:// End
			scPerm.close();
			fin = true;
			break;
		}
		}
	}
	
	

}
