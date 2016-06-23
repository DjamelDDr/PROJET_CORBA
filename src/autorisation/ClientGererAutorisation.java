package autorisation;

import java.util.Scanner;

public class ClientGererAutorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner idCollaborateur = new Scanner(System.in);
		Scanner entree_empreinte = new Scanner(System.in);
		Scanner entree_id = new Scanner(System.in);
		Scanner zone = new Scanner(System.in);
		Scanner scTypC = new Scanner(System.in);
		
		Scanner var = new Scanner(System.in);
		int i= 3; 
		while(i!=0){
			System.out.println("+---------------------------------------------------+");
			System.out.println("|*********Ajout/Modification d'autorisation*********|");
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
				System.out.println("Saisir la zone parmi A, B, C");
				String laZone = zone.nextLine();
				System.out.println("0 : Quitter");
				
			break;  	
			case 2://retirer
				System.out.println("Entrer l'id du collaborateur");
				int idSalA= idCollaborateur.nextInt();
				System.out.println("Saisir la zone parmi A, B, C");
				String laZonecol = zone.nextLine();
				System.out.println("0 : Quitter");
			break;
			}
		}
	
		
	}

}
