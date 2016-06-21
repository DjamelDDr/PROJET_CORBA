package annuaire.AnnuairePackage;

/**
 * Exception definition : collabNExistepas
 * 
 * @author OpenORB Compiler
 */
public final class collabNExistepas extends org.omg.CORBA.UserException
{
    /**
     * Exception member messageDErreur
     */
    public String messageDErreur;

    /**
     * Default constructor
     */
    public collabNExistepas()
    {
        super(collabNExistepasHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public collabNExistepas(String messageDErreur)
    {
        super(collabNExistepasHelper.id());
        this.messageDErreur = messageDErreur;
    }

    /**
     * Full constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public collabNExistepas(String orb_reason, String messageDErreur)
    {
        super(collabNExistepasHelper.id() +" " +  orb_reason);
        this.messageDErreur = messageDErreur;
    }

}
