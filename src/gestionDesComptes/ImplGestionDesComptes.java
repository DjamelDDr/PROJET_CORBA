package gestionDesComptes;

import gestionDesComptes.CreationDeComptePackage.collabExisteDeja;
import gestionDesComptes.CreationDeComptePackage.collabInconnu;

public class ImplGestionDesComptes extends CreationDeComptePOA{
	
	@Override
	public int ajouterCollab(Collaborateur c) throws collabExisteDeja {
		
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean modifierCollab(Collaborateur c) throws collabInconnu {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean supprimerCollab(int id) throws collabInconnu {
		return false;
		// TODO Auto-generated method stub
		
	}

}
