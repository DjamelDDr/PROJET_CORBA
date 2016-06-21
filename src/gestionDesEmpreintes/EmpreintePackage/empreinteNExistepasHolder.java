package gestionDesEmpreintes.EmpreintePackage;

/**
 * Holder class for : empreinteNExistepas
 * 
 * @author OpenORB Compiler
 */
final public class empreinteNExistepasHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal empreinteNExistepas value
     */
    public gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas value;

    /**
     * Default constructor
     */
    public empreinteNExistepasHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public empreinteNExistepasHolder(gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas initial)
    {
        value = initial;
    }

    /**
     * Read empreinteNExistepas from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = empreinteNExistepasHelper.read(istream);
    }

    /**
     * Write empreinteNExistepas into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        empreinteNExistepasHelper.write(ostream,value);
    }

    /**
     * Return the empreinteNExistepas TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return empreinteNExistepasHelper.type();
    }

}
