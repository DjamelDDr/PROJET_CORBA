package gestionDesComptes;

/**
 * Holder class for : Collaborateur
 * 
 * @author OpenORB Compiler
 */
final public class CollaborateurHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal Collaborateur value
     */
    public gestionDesComptes.Collaborateur value;

    /**
     * Default constructor
     */
    public CollaborateurHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public CollaborateurHolder(gestionDesComptes.Collaborateur initial)
    {
        value = initial;
    }

    /**
     * Read Collaborateur from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = CollaborateurHelper.read(istream);
    }

    /**
     * Write Collaborateur into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        CollaborateurHelper.write(ostream,value);
    }

    /**
     * Return the Collaborateur TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return CollaborateurHelper.type();
    }

}
