package annuaire.AnnuairePackage;

/**
 * Exception definition : collabExisteDeja
 * 
 * @author OpenORB Compiler
 */
public final class collabExisteDeja extends org.omg.CORBA.UserException
{
    /**
     * Exception member messageDErreur
     */
    public String messageDErreur;

    /**
     * Default constructor
     */
    public collabExisteDeja()
    {
        super(collabExisteDejaHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public collabExisteDeja(String messageDErreur)
    {
        super(collabExisteDejaHelper.id());
        this.messageDErreur = messageDErreur;
    }

    /**
     * Full constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public collabExisteDeja(String orb_reason, String messageDErreur)
    {
        super(collabExisteDejaHelper.id() +" " +  orb_reason);
        this.messageDErreur = messageDErreur;
    }

}
