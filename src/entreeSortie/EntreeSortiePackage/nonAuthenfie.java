package entreeSortie.EntreeSortiePackage;

/**
 * Exception definition : nonAuthenfie
 * 
 * @author OpenORB Compiler
 */
public final class nonAuthenfie extends org.omg.CORBA.UserException
{
    /**
     * Exception member messageDErreur
     */
    public String messageDErreur;

    /**
     * Default constructor
     */
    public nonAuthenfie()
    {
        super(nonAuthenfieHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public nonAuthenfie(String messageDErreur)
    {
        super(nonAuthenfieHelper.id());
        this.messageDErreur = messageDErreur;
    }

    /**
     * Full constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public nonAuthenfie(String orb_reason, String messageDErreur)
    {
        super(nonAuthenfieHelper.id() +" " +  orb_reason);
        this.messageDErreur = messageDErreur;
    }

}
