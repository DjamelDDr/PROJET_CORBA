package autorisation;

public class TestMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplAutorisationImpl impl = new ImplAutorisationImpl();
		ObjetZone oz = new ObjetZone("A");
		
		//System.out.println(oz.dimanche);
		boolean a = oz.ajouterHoraireAucollab("LUNDI", "Debut", "Fin");
		System.out.println(oz.consulteAutorizJour("LUNDI"));
		
		
	}

}
