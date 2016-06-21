package gestionDesComptes.CreationDeComptePackage;

/**
 * Exception definition : collabInconnu
 * 
 * @author OpenORB Compiler
 */
public final class collabInconnu extends org.omg.CORBA.UserException
{
    /**
     * Exception member messageDErreur
     */
    public String messageDErreur;

    /**
     * Default constructor
     */
    public collabInconnu()
    {
        super(collabInconnuHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public collabInconnu(String messageDErreur)
    {
        super(collabInconnuHelper.id());
        this.messageDErreur = messageDErreur;
    }

    /**
     * Full constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public collabInconnu(String orb_reason, String messageDErreur)
    {
        super(collabInconnuHelper.id() +" " +  orb_reason);
        this.messageDErreur = messageDErreur;
    }

}
