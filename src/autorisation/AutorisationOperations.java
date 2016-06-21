package autorisation;

/**
 * Interface definition : Autorisation
 * 
 * @author OpenORB Compiler
 */
public interface AutorisationOperations
{
    /**
     * Operation autorisationPermanent
     */
    public boolean autorisationPermanent(int id, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite;

    /**
     * Operation autorisationPonctuel
     */
    public boolean autorisationPonctuel(int id, String jourDebut, String jourFin, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite;

}
