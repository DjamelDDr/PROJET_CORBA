package entreeSortie;

/**
 * Holder class for : EntreeSortie
 * 
 * @author OpenORB Compiler
 */
final public class EntreeSortieHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal EntreeSortie value
     */
    public entreeSortie.EntreeSortie value;

    /**
     * Default constructor
     */
    public EntreeSortieHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public EntreeSortieHolder(entreeSortie.EntreeSortie initial)
    {
        value = initial;
    }

    /**
     * Read EntreeSortie from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = EntreeSortieHelper.read(istream);
    }

    /**
     * Write EntreeSortie into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        EntreeSortieHelper.write(ostream,value);
    }

    /**
     * Return the EntreeSortie TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return EntreeSortieHelper.type();
    }

}
