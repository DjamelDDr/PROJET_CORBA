package entreeSortie;

import gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas;
import java.util.Scanner;
import annuaire.AnnuairePackage.collabNExistepas;
import autorisation.AutorisationPackage.autorisationCollabInterdite;

public class ClientEntreeSortie {
	
/*
 * le system entree correspond à une seul porte
 * ce systeme communique avec 3 autres systemes distants 
 * (ces systems : Empreinte, Annuaire, Autorisation)
 */
	public static autorisation.Autorisation serviceAutoriz;	
	public static gestionDesEmpreintes.Empreinte  serviceEmpreinte;	
	public static annuaire.Annuaire  serviceAnnuaire;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {			
			
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

	        String idObjEmprein = "serviceEmpreinte";
	        String idObjAutoriz = "serviceAutoriz";
	        String idObjAnnuair = "serviceAnnuaire";
	        // Recuperation du naming service
	        org.omg.CosNaming.NamingContext nameRoot =
	        		org.omg.CosNaming.NamingContextHelper.narrow
	        		(orb.resolve_initial_references("NameService"));  		

	        // Construction du nom a rechercher
	        org.omg.CosNaming.NameComponent[] nameToFindAutorisation = new org.omg.CosNaming.NameComponent[1];
	        nameToFindAutorisation[0] = new org.omg.CosNaming.NameComponent(idObjAutoriz,"");
	        
	        org.omg.CosNaming.NameComponent[] nameToFindEmpreinte = new org.omg.CosNaming.NameComponent[1];
	        nameToFindEmpreinte[0] = new org.omg.CosNaming.NameComponent(idObjEmprein,"");

	        org.omg.CosNaming.NameComponent[] nameToFindAnnuaire = new org.omg.CosNaming.NameComponent[1];
	        nameToFindAnnuaire[0] = new org.omg.CosNaming.NameComponent(idObjAnnuair,"");
	        // Recherche aupres du naming service
	        org.omg.CORBA.Object distantServiceAutorisation = nameRoot.resolve(nameToFindAutorisation);
	        org.omg.CORBA.Object distantServiceEmpreinte = nameRoot.resolve(nameToFindEmpreinte);
	        org.omg.CORBA.Object distantServiceAnnuaire = nameRoot.resolve(nameToFindAnnuaire);
	        
	        serviceAutoriz = autorisation.AutorisationHelper.narrow(distantServiceAutorisation);
	        serviceEmpreinte = gestionDesEmpreintes.EmpreinteHelper.narrow(distantServiceEmpreinte);
	        serviceAnnuaire = annuaire.AnnuaireHelper.narrow(distantServiceAnnuaire);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		Scanner entree_photo = new Scanner(System.in);
		Scanner entree_empreinte = new Scanner(System.in);
		Scanner entree_id = new Scanner(System.in);
		
		System.out.println("entrer la photo :");
		String photo = entree_photo.nextLine();
		
		System.out.println("entrer l'empreinte");
		String empreinte = entree_empreinte.nextLine();
		
		System.out.println("entrer l'id");
		int idCollaborateur = entree_empreinte.nextInt();		
		
		boolean r=true;
		boolean rEm=true;
		boolean rAn=true;
			
		try {
			r = serviceAutoriz.autorisationPermanent(1,"heureDebut", "heureFin", "numPorte");
			System.out.println("reponse  Autoriz"+ r);
			
		} catch (autorisationCollabInterdite e) {
			e.printStackTrace();
		}
		
		
		try {
			if (serviceEmpreinte.verifierEmpreinte(idCollaborateur, empreinte)) {
				System.out.println("l'empreinte exite");
			}else{
				throw new empreinteNExistepas("le collaborateur n'existe pas");
			}

		} catch (empreinteNExistepas e) {
			//e.printStackTrace();
			System.out.println(e.messageDErreur);
		}
		/*	
		try {
			rAn =serviceAnnuaire.supprimerDansAnnuaire(3);
			System.out.println("reponse  Annuaire"+ rAn);
		} catch (collabNExistepas e) {
			e.printStackTrace();
			System.out.println(e.messageDErreur);
		}
		*/
	}

}
