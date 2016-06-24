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

	        // Nom de l'objet CORBA
	        //String idObjEmp = ""
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
		Scanner clb = new Scanner(System.in);
		
		System.out.println("entrer la photo :");
		String photo = entree_photo.nextLine();
		
		System.out.println("entrer l'empreinte");
		String empreinte = entree_empreinte.nextLine();
		
		System.out.println("type du collab PERMANENT/PONCTUEL");
		String col = clb.nextLine();
		
		System.out.println("entrer l'id");
		int idCollaborateur = entree_empreinte.nextInt();		
		
		
		boolean r=true;
		boolean rEm=true;
		boolean rAn=true;
		switch (col) {
		case "PERMANENT":
			try {
				String estdsAnn =serviceAnnuaire.associationDansAnnuaire(idCollaborateur, photo);
				//System.out.println(estdsAnn);
				try {
					serviceEmpreinte.verifierEmpreinte(idCollaborateur, empreinte);
					try {
						serviceAutoriz.autorisationPermanent(idCollaborateur,"heureDebut", "heureFin", "numPorte");
						System.out.println("Entrer ");
					} catch (autorisationCollabInterdite e) {
						//System.out.println(e.messageDErreur);
						System.out.println("Vous n'avez pas l'accès à cette zone");
					}
				} catch (empreinteNExistepas e) {
					//e.printStackTrace();
					System.out.println(e.messageDErreur);
				}
			} catch (collabNExistepas e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.messageDErreur);
			}
			break;
		case "PONCTUEL":
			try {
				String estdsAnn =serviceAnnuaire.associationDansAnnuaire(idCollaborateur, photo);
				System.out.println("sssssssss "+estdsAnn);
				try {
					serviceEmpreinte.verifierEmpreinte(idCollaborateur, empreinte);
					try {
						serviceAutoriz.autorisationPonctuel(idCollaborateur, "jourDebut", "jourFin", 
								"heureDebut", "heureFin", "numPorte");
						System.out.println("Entrer ");
					} catch (autorisationCollabInterdite e) {
						System.out.println(e.messageDErreur);
					}
				} catch (empreinteNExistepas e) {
					System.out.println(e.messageDErreur);
				}
			} catch (collabNExistepas e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.messageDErreur);
			}
			break;		
		default:
			break;
		}	
	
	}

}
