package gestionDesEmpreintes;

import org.omg.CosNaming.NamingContext;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class ServeurEmpreinte {

public static void main(String[] args) {
	try {
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
        POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        ImplGestionDesEmpreintes empreinte = new ImplGestionDesEmpreintes();
        byte[] monEuroId = rootPOA.activate_object(empreinte);
        rootPOA.the_POAManager().activate();
        NamingContext nameRoot=org.omg.CosNaming.NamingContextHelper.narrow
        		(orb.resolve_initial_references("NameService"));
        org.omg.CosNaming.NameComponent[] nameToRegister = new org.omg.CosNaming.NameComponent[1];
        String nomObjEmpreinte = "serviceEmpreinte";
        nameToRegister[0] = new org.omg.CosNaming.NameComponent(nomObjEmpreinte,"");
        nameRoot.rebind(nameToRegister,rootPOA.servant_to_reference(empreinte));
        System.out.println("==> Nom '"+ nomObjEmpreinte + "' est enregistre dans le service de noms.");
        String IORServant = orb.object_to_string(rootPOA.servant_to_reference(empreinte));
        System.out.println("L'objet possede la reference suivante :");
        System.out.println(IORServant);
        orb.run();
    }
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}

}
