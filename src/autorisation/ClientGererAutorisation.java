package autorisation;

import java.util.Scanner;

import annuaire.AnnuairePackage.collabNExistepas;

public class ClientGererAutorisation {

	public static annuaire.Annuaire  serviceAnnuaire;
	
	public static void main(String[] args) {
		ImplAutorisationImpl lautoriz = new ImplAutorisationImpl();
		try {			
			
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

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
		
		Scanner idCollaborateur = new Scanner(System.in);
		Scanner entree_empreinte = new Scanner(System.in);
		Scanner entree_id = new Scanner(System.in);
		Scanner zone = new Scanner(System.in);
		Scanner scTypC = new Scanner(System.in);
		String le_colla ="";
		Scanner var = new Scanner(System.in);
		int i= 33; 
		while(i!=0){
			System.out.println("+---------------------------------------------------+");
			System.out.println("|****Ajouter/Modifier d'autorisation à une zone*****|");
			System.out.println("+---------------------------------------------------+");
			System.out.println("| 1 - Ajouter?                                      |");
			System.out.println("| 2 - Retirer?                                      |");
			System.out.println("| 0 - Terminer                                      |");
			System.out.println("+---------------------------------------------------+");
			int saisie= var.nextInt();
			switch (saisie){
			case 1://ajouter
				System.out.println("Entrer l'id du collaborateur");
				int idSal= idCollaborateur.nextInt();
				System.out.println("Permanent ou Ponctuel? :");
				String typa = scTypC.nextLine();
				
				if (typa.toUpperCase().contains("PERMANENT")) {
					le_colla ="PERMANENT";
				}else le_colla ="PONCTUEL";
				try {
					boolean au = serviceAnnuaire.existerDansLeSystem(idSal, typa.toUpperCase());
				} catch (collabNExistepas e) {
					System.out.println(e.messageDErreur);
				}
				System.out.println("Saisir la zone parmi A, B, C");
				String laZone = zone.nextLine();
				lautoriz.ajouterAutorisation(idSal, laZone, le_colla);
				
				System.out.println(lautoriz.listDeszone(1, "PERMANENT"));				
				
				
			break;  	
			case 2://retirer
				System.out.println("Entrer l'id du collaborateur");
				int idSalzA= idCollaborateur.nextInt();
				System.out.println("Saisir la zone parmi A, B, C");
				String zz = zone.nextLine();
				System.out.println("Saisir la zone parmi A, B, C");
				String col = zone.nextLine();
				if(lautoriz.retirerAutorisation(idSalzA, zz, col)){
					System.out.println("l'autorisation à la zone est retirée");
				};
				
				
			break;
			}
		}
	
		
	}

}
