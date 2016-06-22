package journalisation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;



public class ImplJournalisation extends JournalisationPOA{
	
	public HashMap<Long, List<UneEntreeDeLhistorique>> historisation = new HashMap<Long, List<UneEntreeDeLhistorique>>();

	public void historiser(final Collaborateur c, final String numPorte, final String idZone, final String horaire, final boolean autorise) {
	List<UneEntreeDeLhistorique> histoire = historisation.get((long) c.idCollab);
	if (histoire == null) {
	histoire = new ArrayList<UneEntreeDeLhistorique>();
	}
	histoire.add(new UneEntreeDeLhistorique(c, numPorte, idZone, horaire, autorise));
	historisation.put((long) c.idCollab, histoire);
	}

}
