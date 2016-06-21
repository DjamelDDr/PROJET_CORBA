package gestionDesComptes.CreationDeComptePackage;

/**
 * Holder class for : collabInconnu
 * 
 * @author OpenORB Compiler
 */
final public class collabInconnuHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal collabInconnu value
     */
    public gestionDesComptes.CreationDeComptePackage.collabInconnu value;

    /**
     * Default constructor
     */
    public collabInconnuHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public collabInconnuHolder(gestionDesComptes.CreationDeComptePackage.collabInconnu initial)
    {
        value = initial;
    }

    /**
     * Read collabInconnu from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = collabInconnuHelper.read(istream);
    }

    /**
     * Write collabInconnu into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        collabInconnuHelper.write(ostream,value);
    }

    /**
     * Return the collabInconnu TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return collabInconnuHelper.type();
    }

}
