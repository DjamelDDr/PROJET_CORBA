package autorisation.AutorisationPackage;

/**
 * Exception definition : autorisationCollabInterdite
 * 
 * @author OpenORB Compiler
 */
public final class autorisationCollabInterdite extends org.omg.CORBA.UserException
{
    /**
     * Exception member messageDErreur
     */
    public String messageDErreur;

    /**
     * Default constructor
     */
    public autorisationCollabInterdite()
    {
        super(autorisationCollabInterditeHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public autorisationCollabInterdite(String messageDErreur)
    {
        super(autorisationCollabInterditeHelper.id());
        this.messageDErreur = messageDErreur;
    }

    /**
     * Full constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public autorisationCollabInterdite(String orb_reason, String messageDErreur)
    {
        super(autorisationCollabInterditeHelper.id() +" " +  orb_reason);
        this.messageDErreur = messageDErreur;
    }

}
