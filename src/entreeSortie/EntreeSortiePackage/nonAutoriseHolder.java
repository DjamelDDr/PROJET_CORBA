package entreeSortie.EntreeSortiePackage;

/**
 * Holder class for : nonAutorise
 * 
 * @author OpenORB Compiler
 */
final public class nonAutoriseHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal nonAutorise value
     */
    public entreeSortie.EntreeSortiePackage.nonAutorise value;

    /**
     * Default constructor
     */
    public nonAutoriseHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public nonAutoriseHolder(entreeSortie.EntreeSortiePackage.nonAutorise initial)
    {
        value = initial;
    }

    /**
     * Read nonAutorise from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = nonAutoriseHelper.read(istream);
    }

    /**
     * Write nonAutorise into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        nonAutoriseHelper.write(ostream,value);
    }

    /**
     * Return the nonAutorise TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return nonAutoriseHelper.type();
    }

}
