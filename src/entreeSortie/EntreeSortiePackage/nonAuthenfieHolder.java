package entreeSortie.EntreeSortiePackage;

/**
 * Holder class for : nonAuthenfie
 * 
 * @author OpenORB Compiler
 */
final public class nonAuthenfieHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal nonAuthenfie value
     */
    public entreeSortie.EntreeSortiePackage.nonAuthenfie value;

    /**
     * Default constructor
     */
    public nonAuthenfieHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public nonAuthenfieHolder(entreeSortie.EntreeSortiePackage.nonAuthenfie initial)
    {
        value = initial;
    }

    /**
     * Read nonAuthenfie from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = nonAuthenfieHelper.read(istream);
    }

    /**
     * Write nonAuthenfie into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        nonAuthenfieHelper.write(ostream,value);
    }

    /**
     * Return the nonAuthenfie TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return nonAuthenfieHelper.type();
    }

}
