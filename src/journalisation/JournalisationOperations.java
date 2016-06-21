package journalisation;

/**
 * Interface definition : Journalisation
 * 
 * @author OpenORB Compiler
 */
public interface JournalisationOperations
{
    /**
     * Operation historiser
     */
    public void historiser(journalisation.Collaborateur c, String numPorte, String idZone, String horaire, boolean autorise);

}
