package gestionDesComptes;

/**
 * Holder class for : CreationDeCompte
 * 
 * @author OpenORB Compiler
 */
final public class CreationDeCompteHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal CreationDeCompte value
     */
    public gestionDesComptes.CreationDeCompte value;

    /**
     * Default constructor
     */
    public CreationDeCompteHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public CreationDeCompteHolder(gestionDesComptes.CreationDeCompte initial)
    {
        value = initial;
    }

    /**
     * Read CreationDeCompte from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = CreationDeCompteHelper.read(istream);
    }

    /**
     * Write CreationDeCompte into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        CreationDeCompteHelper.write(ostream,value);
    }

    /**
     * Return the CreationDeCompte TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return CreationDeCompteHelper.type();
    }

}
