package gestionDesComptes.CreationDeComptePackage;

/**
 * Holder class for : collabExisteDeja
 * 
 * @author OpenORB Compiler
 */
final public class collabExisteDejaHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal collabExisteDeja value
     */
    public gestionDesComptes.CreationDeComptePackage.collabExisteDeja value;

    /**
     * Default constructor
     */
    public collabExisteDejaHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public collabExisteDejaHolder(gestionDesComptes.CreationDeComptePackage.collabExisteDeja initial)
    {
        value = initial;
    }

    /**
     * Read collabExisteDeja from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = collabExisteDejaHelper.read(istream);
    }

    /**
     * Write collabExisteDeja into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        collabExisteDejaHelper.write(ostream,value);
    }

    /**
     * Return the collabExisteDeja TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return collabExisteDejaHelper.type();
    }

}
