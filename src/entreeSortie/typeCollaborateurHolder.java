package entreeSortie;

/**
 * Holder class for : typeCollaborateur
 * 
 * @author OpenORB Compiler
 */
final public class typeCollaborateurHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal typeCollaborateur value
     */
    public entreeSortie.typeCollaborateur value;

    /**
     * Default constructor
     */
    public typeCollaborateurHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public typeCollaborateurHolder(entreeSortie.typeCollaborateur initial)
    {
        value = initial;
    }

    /**
     * Read typeCollaborateur from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = typeCollaborateurHelper.read(istream);
    }

    /**
     * Write typeCollaborateur into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        typeCollaborateurHelper.write(ostream,value);
    }

    /**
     * Return the typeCollaborateur TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return typeCollaborateurHelper.type();
    }

}
