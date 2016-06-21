package annuaire.AnnuairePackage;

/**
 * Holder class for : collabNExistepas
 * 
 * @author OpenORB Compiler
 */
final public class collabNExistepasHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal collabNExistepas value
     */
    public annuaire.AnnuairePackage.collabNExistepas value;

    /**
     * Default constructor
     */
    public collabNExistepasHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public collabNExistepasHolder(annuaire.AnnuairePackage.collabNExistepas initial)
    {
        value = initial;
    }

    /**
     * Read collabNExistepas from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = collabNExistepasHelper.read(istream);
    }

    /**
     * Write collabNExistepas into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        collabNExistepasHelper.write(ostream,value);
    }

    /**
     * Return the collabNExistepas TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return collabNExistepasHelper.type();
    }

}
