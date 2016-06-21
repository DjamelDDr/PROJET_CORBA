package entreeSortie.EntreeSortiePackage;

/**
 * Exception definition : nonAutorise
 * 
 * @author OpenORB Compiler
 */
public final class nonAutorise extends org.omg.CORBA.UserException
{
    /**
     * Exception member messageDErreur
     */
    public String messageDErreur;

    /**
     * Default constructor
     */
    public nonAutorise()
    {
        super(nonAutoriseHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public nonAutorise(String messageDErreur)
    {
        super(nonAutoriseHelper.id());
        this.messageDErreur = messageDErreur;
    }

    /**
     * Full constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public nonAutorise(String orb_reason, String messageDErreur)
    {
        super(nonAutoriseHelper.id() +" " +  orb_reason);
        this.messageDErreur = messageDErreur;
    }

}
