package annuaire;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import annuaire.AnnuairePackage.collabExisteDeja;
import annuaire.AnnuairePackage.collabNExistepas;

public class ImplAnnuaireImpl extends AnnuairePOA{
	public HashMap<Integer, Collaborateur> dansAnnuairePerm = new HashMap<Integer, Collaborateur>();
	public HashMap<Integer, Collaborateur> dansAnnuairePonc =new HashMap<Integer, Collaborateur>();
	
	public int taillePerm = 0;
	public int taillePonc = 0;
	public static int idCollabPermUniq = 0;
	public static int idCollabPoncUniq = 0;
/*
 * attention fonction à supprimer uniquement pr les tests
 */
	public void initialise(){
		Collaborateur clb = new Collaborateur(1, "a", "a", "a", "A",typeCollaborateur.from_int(0));dansAnnuairePerm.put(1, clb);
		Collaborateur clbb = new Collaborateur(2, "b", "b", "b", "b",typeCollaborateur.from_int(0));dansAnnuairePerm.put(2, clbb);
		Collaborateur clbc = new Collaborateur(1, "a1", "a1", "a1", "A1",typeCollaborateur.from_int(1));dansAnnuairePonc.put(2, clbc);
		Collaborateur clbbd = new Collaborateur(2, "b2", "b2", "b2", "b2",typeCollaborateur.from_int(1));dansAnnuairePonc.put(2, clbbd);
		dansAnnuairePerm.put(1, clb);dansAnnuairePerm.put(2, clbb);
		dansAnnuairePonc.put(1, clbc);dansAnnuairePonc.put(2, clbbd);
	}	
	@Override
	public boolean associationDansAnnuaire(int id, String photo)throws collabNExistepas {
		boolean reponse = false;
		initialise();//JDD
		if (dansAnnuairePerm.size()==0 && dansAnnuairePonc.size()==0 ) {				
			throw new collabNExistepas("Le collaborateur n'existe pas");
		}		
		for (Entry<Integer, Collaborateur> e : dansAnnuairePerm.entrySet()) {
			if (e.getValue().photo.toString().toUpperCase().equals(photo.toString().toUpperCase())  && 
					(e.getValue().idCollab==id )){
				reponse = true;	break;
			}else {
				for (Entry<Integer, Collaborateur> ep : dansAnnuairePonc.entrySet()) {
					if (ep.getValue().photo.toString().toUpperCase().equals(photo.toString().toUpperCase())  && 
							(ep.getValue().idCollab==id )){
						reponse = true;	break;
					}else {
						throw new collabNExistepas("Le collaborateur n'existe pas");
					}
				}				
			}
		}
		return reponse;
	}

/*les cas non pris en compte : 1 collab dans map Perm et Ponc == NON peut etre dans l'1 ou l'autre mais la vérif n'y est pas*/
	public int ajouterDansAnnuaire(Collaborateur c) throws collabExisteDeja {	
		initialise();//JDD
		if (c.tcollab.toString() == "permanent") {
			Iterator<Integer> iPerm = dansAnnuairePerm.keySet().iterator();
			if (dansAnnuairePerm.size()==0 ) {				
				idCollabPermUniq++;
				dansAnnuairePerm.put(idCollabPermUniq, c);
				return  idCollabPermUniq;
			}
			while (iPerm.hasNext() | taillePerm <=dansAnnuairePerm.size())
			{	taillePerm ++;
				Integer key = iPerm.next();
				if(	(dansAnnuairePerm.get(key).nom.toUpperCase().contains(c.nom.toUpperCase().toString())) && 
					(dansAnnuairePerm.get(key).prenom.toUpperCase().contains(c.prenom.toUpperCase().toString()) )){
					throw new collabExisteDeja("Le collaborateur M."+c.nom+" "+c.prenom+" existe deja");
				}else{
					idCollabPermUniq++;
					dansAnnuairePerm.put(idCollabPermUniq, c);
					return idCollabPermUniq;
				}
			}
		} else {
			Iterator<Integer> iPonc = dansAnnuairePonc.keySet().iterator();
			if (dansAnnuairePonc.size()==0 ) {				
				idCollabPoncUniq++;
				dansAnnuairePonc.put(idCollabPoncUniq, c);
				return  idCollabPoncUniq;
			}
			while (iPonc.hasNext() | taillePonc <=dansAnnuairePonc.size())
			{	taillePonc ++;
				Integer key = iPonc.next();
				if(	(dansAnnuairePonc.get(key).nom.toUpperCase().contains(c.nom.toUpperCase().toString())) && 
					(dansAnnuairePonc.get(key).prenom.toUpperCase().contains(c.prenom.toUpperCase().toString()) )){
					throw new collabExisteDeja("Le collaborateur M."+c.nom+" "+c.prenom+" existe deja");
				}else{
					idCollabPoncUniq++;
					dansAnnuairePonc.put(idCollabPoncUniq, c);
					return idCollabPoncUniq;
				}
			}
		}		
		return idCollabPoncUniq;	
	}

	@Override
	public boolean supprimerDansAnnuaire(int id, String photo,String typeDuCollb) throws collabNExistepas {
		boolean reponse=false;
		initialise();
		
		if (dansAnnuairePerm.size()==0 && dansAnnuairePonc.size()==0 ) {				
			throw new collabNExistepas("Le collaborateur n'existe pas");
		}
		if(typeDuCollb.equals("permanent") 
				&& (dansAnnuairePerm.get(id).photo.toString().toUpperCase().equals(photo.toUpperCase()))  ){
			dansAnnuairePerm.remove(id);
			reponse = true;
		}else if(typeDuCollb.equals("ponctuel")
				&& (dansAnnuairePonc.get(id).photo.toString().toUpperCase().equals(photo.toUpperCase()))){
			dansAnnuairePonc.remove(id);
			reponse = true;
		}else{
			throw new collabNExistepas("Veuillez entrer des des valeurs correctes");
		}
			
		return reponse;
	}

	public boolean associationDansAnnuaireInterne(int id, String photo,String nom)throws collabNExistepas {
		boolean reponse=false;
		initialise();//JDD
		if (dansAnnuairePerm.size()==0 && dansAnnuairePonc.size()==0 ) {				
			throw new collabNExistepas("Le collaborateur n'existe pas");
		}		
		for (Entry<Integer, Collaborateur> e : dansAnnuairePerm.entrySet()) {
			if (e.getValue().photo.toString().toUpperCase().equals(photo.toString().toUpperCase())  &&
				e.getValue().nom.toString().toUpperCase().equals(nom.toString().toUpperCase())  &&
					(e.getValue().idCollab==id )){
				reponse = true;//"permanent";	
				break;
			}else {
				for (Entry<Integer, Collaborateur> ep : dansAnnuairePonc.entrySet()) {
					if (ep.getValue().photo.toString().toUpperCase().equals(photo.toString().toUpperCase())  &&
						ep.getValue().nom.toString().toUpperCase().equals(nom.toString().toUpperCase())  &&
							(ep.getValue().idCollab==id )){
						reponse = false;//"ponctuel";	
						break;
					}else {
						throw new collabNExistepas("Le collaborateur n'existe pas");
					}
				}				
			}
		}//false;"ponctuel" et true;"permanent"
		return reponse;
	}
	@Override
	public boolean modifierDansAnnuaire(int id, String nom, String prenom,  String mdp,String photo)
			throws collabNExistepas {
	    boolean reponse = false;
		boolean pasDsPer =false;boolean pasDsPon =false;
		if (id ==0 && nom == null && prenom ==null  && mdp == null && photo == null  ) {throw new collabNExistepas("Les champs saisis vides, veuillez les renseigner ");}
		else{
			if(associationDansAnnuaireInterne(id,photo,nom)){
				for (Entry<Integer, Collaborateur> e : dansAnnuairePerm.entrySet()) {

					if(prenom != null){	e.getValue().prenom = prenom.toUpperCase();reponse = true;}
					if(mdp != null){    e.getValue().mdp    = mdp;reponse = true;}
					if(photo != null){e.getValue().photo    = photo;reponse = true;}
				}
			}else {
				for (Entry<Integer, Collaborateur> ep : dansAnnuairePonc.entrySet()) {
					if(prenom != null){	ep.getValue().prenom = prenom.toUpperCase();reponse = true;}
					if(mdp != null)   { ep.getValue().mdp    = mdp;reponse = true;}
					if(photo != null) { ep.getValue().photo  = photo;reponse = true;}
				}
			}
		}System.out.println("icciiii");
		return reponse;
	}

	@Override
	public boolean verifierDansAnnuaire(int id, String mdp)	throws collabNExistepas {
		boolean est = false;
		if (dansAnnuairePerm.size()==0 && dansAnnuairePonc.size()==0 ) {				
			throw new collabNExistepas("Le collaborateur n'existe pas");
		}
		if ((dansAnnuairePerm.get(id).mdp.toString().toUpperCase().equals(mdp.toUpperCase()))) {
			est = true;
		} else if ((dansAnnuairePonc.get(id).mdp.toString().toUpperCase().equals(mdp.toUpperCase()))){
			est = true;
		}else {
			throw new collabNExistepas("Le collaborateur n'existe pas");
		}
	
		return est;
		
		
	}


}
