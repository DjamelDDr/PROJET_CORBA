package autorisation.AutorisationPackage;

/**
 * Holder class for : autorisationCollabInterdite
 * 
 * @author OpenORB Compiler
 */
final public class autorisationCollabInterditeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal autorisationCollabInterdite value
     */
    public autorisation.AutorisationPackage.autorisationCollabInterdite value;

    /**
     * Default constructor
     */
    public autorisationCollabInterditeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public autorisationCollabInterditeHolder(autorisation.AutorisationPackage.autorisationCollabInterdite initial)
    {
        value = initial;
    }

    /**
     * Read autorisationCollabInterdite from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = autorisationCollabInterditeHelper.read(istream);
    }

    /**
     * Write autorisationCollabInterdite into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        autorisationCollabInterditeHelper.write(ostream,value);
    }

    /**
     * Return the autorisationCollabInterdite TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return autorisationCollabInterditeHelper.type();
    }

}
