package autorisation;

public class ObjetAutoriz {
	private int idCollaborateur;
	/*
	 * si ZoneA =true c'est que le collab a 
	 * accès à cette zone
	 */
	private boolean zoneA;
	private boolean zoneB;
	private boolean zoneC;
	
	public ObjetAutoriz(int idCollaborateur, boolean zoneA, boolean zoneB,
			boolean zoneC) {
		super();
		this.idCollaborateur = idCollaborateur;
		this.zoneA = zoneA;
		this.zoneB = zoneB;
		this.zoneC = zoneC;
	}

	public boolean isZoneA() {
		return zoneA;
	}

	public void setZoneA(boolean zoneA) {
		this.zoneA = zoneA;
	}

	public boolean isZoneB() {
		return zoneB;
	}

	public void setZoneB(boolean zoneB) {
		this.zoneB = zoneB;
	}

	public boolean isZoneC() {
		return zoneC;
	}

	public void setZoneC(boolean zoneC) {
		this.zoneC = zoneC;
	}

	public int getIdCollaborateur() {
		return idCollaborateur;
	}
		
	
}
