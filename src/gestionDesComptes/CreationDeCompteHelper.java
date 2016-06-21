package gestionDesComptes;

/** 
 * Helper class for : CreationDeCompte
 *  
 * @author OpenORB Compiler
 */ 
public class CreationDeCompteHelper
{
    /**
     * Insert CreationDeCompte into an any
     * @param a an any
     * @param t CreationDeCompte value
     */
    public static void insert(org.omg.CORBA.Any a, gestionDesComptes.CreationDeCompte t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract CreationDeCompte from an any
     * @param a an any
     * @return the extracted CreationDeCompte value
     */
    public static gestionDesComptes.CreationDeCompte extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return gestionDesComptes.CreationDeCompteHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the CreationDeCompte TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"CreationDeCompte");
        }
        return _tc;
    }

    /**
     * Return the CreationDeCompte IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:gestionDesComptes/CreationDeCompte:1.0";

    /**
     * Read CreationDeCompte from a marshalled stream
     * @param istream the input stream
     * @return the readed CreationDeCompte value
     */
    public static gestionDesComptes.CreationDeCompte read(org.omg.CORBA.portable.InputStream istream)
    {
        return(gestionDesComptes.CreationDeCompte)istream.read_Object(gestionDesComptes._CreationDeCompteStub.class);
    }

    /**
     * Write CreationDeCompte into a marshalled stream
     * @param ostream the output stream
     * @param value CreationDeCompte value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, gestionDesComptes.CreationDeCompte value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to CreationDeCompte
     * @param obj the CORBA Object
     * @return CreationDeCompte Object
     */
    public static CreationDeCompte narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof CreationDeCompte)
            return (CreationDeCompte)obj;

        if (obj._is_a(id()))
        {
            _CreationDeCompteStub stub = new _CreationDeCompteStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to CreationDeCompte
     * @param obj the CORBA Object
     * @return CreationDeCompte Object
     */
    public static CreationDeCompte unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof CreationDeCompte)
            return (CreationDeCompte)obj;

        _CreationDeCompteStub stub = new _CreationDeCompteStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
