package gestionDesComptes;


import gestionDesEmpreintes.Empreinte;
import gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas;

import java.util.Scanner;

import annuaire.Collaborateur;
import annuaire.typeCollaborateur;
import annuaire.AnnuairePackage.collabExisteDeja;
import annuaire.AnnuairePackage.collabNExistepas;


public class ClientGestionDesComptes {
	public static annuaire.Annuaire  serviceAnnuaire;
	public static gestionDesEmpreintes.Empreinte  serviceEmpreinte;	
	public static int idCollabPermUniq = 1;
	public static int idCollabPoncUniq = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {			
			
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

	        // Nom de l'objet CORBA
	        //String idObjEmp = ""

	        String idObjAnnuair = "serviceAnnuaire";
	        String idObjEmprein = "serviceEmpreinte";
	        // Recuperation du naming service
	        org.omg.CosNaming.NamingContext nameRoot =
	        		org.omg.CosNaming.NamingContextHelper.narrow
	        		(orb.resolve_initial_references("NameService"));  		

	        // Construction du nom a rechercher
	        org.omg.CosNaming.NameComponent[] nameToFindAnnuaire = new org.omg.CosNaming.NameComponent[1];
	        nameToFindAnnuaire[0] = new org.omg.CosNaming.NameComponent(idObjAnnuair,"");
	        org.omg.CosNaming.NameComponent[] nameToFindEmpreinte = new org.omg.CosNaming.NameComponent[1];
	        nameToFindEmpreinte[0] = new org.omg.CosNaming.NameComponent(idObjEmprein,"");
	        
	        // Recherche aupres du naming service
	        org.omg.CORBA.Object distantServiceAnnuaire = nameRoot.resolve(nameToFindAnnuaire);
	        org.omg.CORBA.Object distantServiceEmpreint = nameRoot.resolve(nameToFindEmpreinte);
	        serviceAnnuaire = annuaire.AnnuaireHelper.narrow(distantServiceAnnuaire);
	        serviceEmpreinte = gestionDesEmpreintes.EmpreinteHelper.narrow(distantServiceEmpreint);
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
		Scanner entree_Prenom = new Scanner(System.in);
		Scanner entree_mdp = new Scanner(System.in);
		Scanner entree_id = new Scanner(System.in);

		while (!fin) {
			int choice;
			System.out.println("+---------------------------------------------------+");
			System.out.println("|*************Gestion des Collaborateurs************|");			
			System.out.println("+---------------------------------------------------+");
			System.out.println("| 1 - RH ?                                          |");
			System.out.println("| 2 - Accueil?                                      |");
			System.out.println("| 0 - Terminer                                      |");
			System.out.println("+---------------------------------------------------+");

			choice = sc.nextInt();
			sc.nextLine(); // saute le retour à la ligne
			
			switch (choice) {
			case 1:
				System.out.println("+---------------------------------------------------+");
				System.out.println("| ************************************************* |");
				System.out.println("| * Vous traitez avec les collaborateurs Permanent* |");
				System.out.println("| ************************************************* |");
				System.out.println("+---------------------------------------------------+");
				System.out.println();
				
				while(!finPerm){
					int choicePerm;
					System.out.println("+---------------------------------------------------+");
					System.out.println("| 1 - Ajouter  ?                                    |");
					System.out.println("| 2 - Modifier ?                                    |");
					System.out.println("| 3 - Supprimer?                                    |");
					System.out.println("| 0 - Fin      ?                                    |");
					System.out.println("+---------------------------------------------------+");
					choicePerm = scPerm.nextInt();
					scPerm.nextLine(); // saute le retour à la ligne
					switch (choicePerm) {
					case 1://RH: ajouter
						System.out.println("entrer le Nom");
						String nomz = entree_Nom.nextLine();				
						System.out.println("entrer l'annienne photo :");
						String photoz = entree_photo.nextLine();	
						System.out.println("entrer le Prenom");
						String prenomz = entree_Prenom.nextLine();
						System.out.println("entrer le mot de passe :");
						String motDePassez = entree_mdp.nextLine();	
						//attention 0 = permanent 
						Collaborateur collaborateurPonc = 
								new Collaborateur(idCollabPermUniq, nomz, prenomz, motDePassez, photoz, typeCollaborateur.from_int(0));
						idCollabPermUniq++;
						try {
							int numeroId = serviceAnnuaire.ajouterDansAnnuaire(collaborateurPonc);
							
						} catch (collabExisteDeja e1) {
							// TODO Auto-generated catch block
							System.out.println(e1.messageDErreur);
						}
						break;
					case 2://RH: //modifier
						String reponseii="";
						System.out.println("pour la recherche du collaborateur");
						System.out.println("entrer l'id ");
						int idzz = entree_id.nextInt();
						System.out.println("entrer le Nom");
						String nomd = entree_Nom.nextLine();
						System.out.println("entrer l'ancienne Photo");
						String photozz = entree_photo.nextLine();
						try {
						reponseii= serviceAnnuaire.associationDansAnnuaire(1, photozz);
						if (!reponseii.isEmpty())System.out.println("Le collabolarateur existe:  ");
							try {
								boolean reponse = false;	
								System.out.println("Les modifications");
								System.out.println("entrer la photo :");
								String photod = entree_photo.nextLine();	
								System.out.println("entrer le Prenom");
								String prenomd = entree_Prenom.nextLine();
								System.out.println("entrer le mot de passe :");
								String motDePassed = entree_mdp.nextLine();
								reponse = serviceAnnuaire.modifierDansAnnuaire(idzz, nomd, prenomd, motDePassed, photod);
								System.out.println("Le collaborateur : "+nomd.toUpperCase()+" est modifié ");
							}catch (collabNExistepas e1) {
								System.out.println(e1.messageDErreur);
							}
						} catch (collabNExistepas e4) {
							System.out.println(e4.messageDErreur);
						}					
						break;
					case 3://RH: supprimer
						boolean supp =false, suue = false;
						System.out.println("entrer l'id ");
						int ids = entree_id.nextInt();
						System.out.println("entrer la photo");
						String photos = entree_photo.nextLine();						
						try {
							supp= serviceAnnuaire.supprimerDansAnnuaire(ids,photos , "permanent");
							if (supp){ 
								suue = serviceEmpreinte.supprimerEmpreinte(ids, "permanent");
								System.out.println("Le collaborateur est supprimé");
							}
						} catch (collabNExistepas | empreinteNExistepas e) {
							System.out.println(e.getMessage());
						}
						
						break;
					/*case 4://RH: vérifier
						System.out.println("entrer le Nom");
						String nomza = entree_Nom.nextLine();				
						System.out.println("entrer la photo :");
						String photoza = entree_photo.nextLine();	
						try {boolean reponseii=false;
						reponseii= serviceAnnuaire.associationDansAnnuaire(1, "a");
						if (reponseii)System.out.println("Le collabolarateur existe:  ");
						} catch (collabNExistepas e4) {
							System.out.println(e4.messageDErreur);
						}
						break;
					*/
					default:
						break;
					case 0:// End
						scPerm.close();
						fin = true;
						break;
					}
				}

							
			
				//		((gestionDesComptes.Collaborateur)collaborateur);
				break;
			//accueil pour les ponctuels
			case 2:
				System.out.println("+---------------------------------------------------+");
				System.out.println("| ************************************************* |");
				System.out.println("| * Vous traitez avec les collaborateurs Ponctuel * |");
				System.out.println("| ************************************************* |");
				System.out.println("+---------------------------------------------------+");
				
				while(!finPonc){
					int choicePonc;
					System.out.println("+---------------------------------------------------+");
					System.out.println("| 1 - Ajouter  ?                                    |");
					System.out.println("| 2 - Modifier ?                                    |");
					System.out.println("| 3 - Supprimer?                                    |");
					System.out.println("| 0 - Fin      ?                                    |");
					System.out.println("+---------------------------------------------------+");
					choicePonc = scPonc.nextInt();
					scPonc.nextLine(); // saute le retour à la ligne
					switch (choicePonc) {
					case 1://Accueil : ajouter
						System.out.println("entrer le Nom");
						String nomz = entree_Nom.nextLine();				
						System.out.println("entrer le Prenom");
						String prenomz = entree_Prenom.nextLine();	
						System.out.println("entrer la photo :");
						String photoz = entree_photo.nextLine();	
						System.out.println("entrer le mot de passe :");
						String motDePassez = entree_mdp.nextLine();	
						//attention 0 = permanent 
						Collaborateur collaborateurPonc = 
								new Collaborateur(idCollabPoncUniq, nomz, prenomz, motDePassez, photoz, typeCollaborateur.from_int(1));	
								idCollabPermUniq++;
						try {
							int numeroId = serviceAnnuaire.ajouterDansAnnuaire(collaborateurPonc);
							System.out.println("L'id du nouveau collaborateur "+numeroId);
						} catch (collabExisteDeja e1) {
							// TODO Auto-generated catch block
							System.out.println(e1.messageDErreur);
						}
						break;
					case 2://Accueil : modifier :// le metching se fait avec l'id et le nom
						String reponseii="";
						System.out.println("pour la recherche du collaborateur");
						System.out.println("entrer l'id ");
						int idzz = entree_id.nextInt();
						System.out.println("entrer le Nom");
						String nomd = entree_Nom.nextLine();
						System.out.println("entrer l'ancienne Photo");
						String photozz = entree_photo.nextLine();
						try {
						reponseii= serviceAnnuaire.associationDansAnnuaire(1, photozz);
						if (!reponseii.isEmpty())System.out.println("Le collabolarateur existe:  ");
							try {
								boolean reponse = false;	
								System.out.println("Les modifications");
								System.out.println("entrer la photo :");
								String photod = entree_photo.nextLine();	
								System.out.println("entrer le Prenom");
								String prenomd = entree_Prenom.nextLine();
								System.out.println("entrer le mot de passe :");
								String motDePassed = entree_mdp.nextLine();
								reponse = serviceAnnuaire.modifierDansAnnuaire(idzz, nomd, prenomd, motDePassed, photod);
								System.out.println("Le collaborateur : "+nomd.toUpperCase()+" est modifié ");
							}catch (collabNExistepas e1) {
								System.out.println(e1.messageDErreur);
							}
						} catch (collabNExistepas e4) {
							System.out.println(e4.messageDErreur);
						}
						break;
					case 3://Accueil : supprimer
						boolean supp =false, suue = false;
						System.out.println("entrer l'id ");
						int ids = entree_id.nextInt();
						System.out.println("entrer la photo");
						String photos = entree_photo.nextLine();						
						try {
							supp= serviceAnnuaire.supprimerDansAnnuaire(ids,photos , "permanent");
							if (supp){ 
								suue = serviceEmpreinte.supprimerEmpreinte(ids, "permanent");
								System.out.println("Le collaborateur est supprimé");
							}
						} catch (collabNExistepas | empreinteNExistepas e) {
							System.out.println(e.getMessage());
						}
					default:
						break;
					case 0:// End
						scPerm.close();
						fin = true;
						break;
					}
				}						
				break;
			case 0:
				// End
				sc.close();
				fin = true;
				break;
				
			}
		
		
		
	}
	}
}
