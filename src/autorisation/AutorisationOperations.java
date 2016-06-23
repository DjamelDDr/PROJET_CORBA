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
    public boolean autorisationPermanent(autorisation.Collaborateur c, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite;

    /**
     * Operation autorisationPonctuel
     */
    public boolean autorisationPonctuel(autorisation.Collaborateur c, String jourDebut, String jourFin, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite;

}
