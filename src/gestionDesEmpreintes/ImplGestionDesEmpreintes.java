package gestionDesEmpreintes;

import java.util.HashMap;
import java.util.Iterator;

import annuaire.Collaborateur;
import annuaire.typeCollaborateur;
import annuaire.AnnuairePackage.collabNExistepas;
import gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas;

public class ImplGestionDesEmpreintes extends EmpreintePOA{
	public HashMap<Integer, ObjetUneEmpreinte> dansEmpreintePerm = 
			new HashMap<Integer, ObjetUneEmpreinte>();
	public HashMap<Integer, ObjetUneEmpreinte> dansEmpreintePonc = 
			new HashMap<Integer, ObjetUneEmpreinte>();
	
	public void initialise(){
		ObjetUneEmpreinte clb   = new ObjetUneEmpreinte(1,"1A1","permanent");dansEmpreintePerm.put(1, clb);
		ObjetUneEmpreinte clbb  = new ObjetUneEmpreinte(2,"2B2","permanent");dansEmpreintePerm.put(2, clbb);
		ObjetUneEmpreinte clbc  = new ObjetUneEmpreinte(1,"1C1","ponctuel"); dansEmpreintePonc.put(1, clbc);
		ObjetUneEmpreinte clbbd = new ObjetUneEmpreinte(2,"2D2","ponctuel"); dansEmpreintePonc.put(2, clbbd);
	}
	public boolean verifierEmpreinte(int id, String lempreinte)
			throws empreinteNExistepas {
		boolean existe=false;
		initialise();
		if (dansEmpreintePerm.size()==0 && dansEmpreintePonc.size()==0 ) {				
			throw new empreinteNExistepas("Il n'y a d'empreinte. Le collaborateur n'existe pas");
		}else{
			if (dansEmpreintePerm.get(id).getIdCollaborateur()== id 
					&& dansEmpreintePerm.get(id).getUneEmpreinte() == lempreinte ) {
				existe = true;
			} else if (dansEmpreintePonc.get(id).getIdCollaborateur()== id 
					&& dansEmpreintePonc.get(id).getUneEmpreinte() == lempreinte ){
				existe = true;
			}else {
				throw new empreinteNExistepas("Le collaborateur n'existe pas");
			}
		}
		return existe;

	}

	@Override
	public boolean supprimerEmpreinte(int id, String typeDuCollb)
			throws empreinteNExistepas {
		initialise();
		boolean reponse = false; 
		if (dansEmpreintePerm.size()==0 && dansEmpreintePonc.size()==0 ) {				
			throw new empreinteNExistepas("Il n'y a d'empreinte. Le collaborateur n'existe pas");
		}else
			if(typeDuCollb.equals("permanent")  ){
				dansEmpreintePerm.remove(id);
				reponse = true;
			}else if(typeDuCollb.equals("ponctuel")){
				dansEmpreintePonc.remove(id);
				reponse = true;
			}else{
				throw new empreinteNExistepas("Veuillez entrer une empreinte correctes");
			}
		return reponse;
	}
	
	public String ajouterEmpreinte(int idCollaborateur,String uneEmpreinte,String typeCollab){				
			ObjetUneEmpreinte clb   = new ObjetUneEmpreinte(idCollaborateur,uneEmpreinte,typeCollab);
			dansEmpreintePerm.put(idCollaborateur, clb);
		return "l'empreinte du collaborateur est ajoutée";
	}
	
	public String modifierEmpreinte(String newEmpreinte, int idCollab, String typeCollab) {
		String reponse =  "";
		initialise();
		if(typeCollab.toUpperCase().equals("PERMANENT") && 
				dansEmpreintePerm.get(idCollab).getIdCollaborateur() == idCollab){
			dansEmpreintePerm.put(idCollab,new ObjetUneEmpreinte(idCollab, newEmpreinte, "PERMANENT"));
			reponse = "l'empreinte du collaborateur est modifiée";
		}else if(typeCollab.equals("PONCTUEL")){
			dansEmpreintePonc.put(idCollab,new ObjetUneEmpreinte(idCollab, newEmpreinte, "PONCTUEL"));
			reponse = "l'empreinte du collaborateur est modifiée";
		}else reponse = "l'empreinte du collaborateur n'est pas modifiée";
		return reponse;
	}
}
