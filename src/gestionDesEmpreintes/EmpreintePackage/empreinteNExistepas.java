package gestionDesEmpreintes.EmpreintePackage;

/**
 * Exception definition : empreinteNExistepas
 * 
 * @author OpenORB Compiler
 */
public final class empreinteNExistepas extends org.omg.CORBA.UserException
{
    /**
     * Exception member messageDErreur
     */
    public String messageDErreur;

    /**
     * Default constructor
     */
    public empreinteNExistepas()
    {
        super(empreinteNExistepasHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public empreinteNExistepas(String messageDErreur)
    {
        super(empreinteNExistepasHelper.id());
        this.messageDErreur = messageDErreur;
    }

    /**
     * Full constructor with fields initialization
     * @param messageDErreur messageDErreur exception member
     */
    public empreinteNExistepas(String orb_reason, String messageDErreur)
    {
        super(empreinteNExistepasHelper.id() +" " +  orb_reason);
        this.messageDErreur = messageDErreur;
    }

}
