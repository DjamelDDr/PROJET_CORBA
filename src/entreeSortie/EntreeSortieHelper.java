package entreeSortie;

/** 
 * Helper class for : EntreeSortie
 *  
 * @author OpenORB Compiler
 */ 
public class EntreeSortieHelper
{
    /**
     * Insert EntreeSortie into an any
     * @param a an any
     * @param t EntreeSortie value
     */
    public static void insert(org.omg.CORBA.Any a, entreeSortie.EntreeSortie t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract EntreeSortie from an any
     * @param a an any
     * @return the extracted EntreeSortie value
     */
    public static entreeSortie.EntreeSortie extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return entreeSortie.EntreeSortieHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the EntreeSortie TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"EntreeSortie");
        }
        return _tc;
    }

    /**
     * Return the EntreeSortie IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:entreeSortie/EntreeSortie:1.0";

    /**
     * Read EntreeSortie from a marshalled stream
     * @param istream the input stream
     * @return the readed EntreeSortie value
     */
    public static entreeSortie.EntreeSortie read(org.omg.CORBA.portable.InputStream istream)
    {
        return(entreeSortie.EntreeSortie)istream.read_Object(entreeSortie._EntreeSortieStub.class);
    }

    /**
     * Write EntreeSortie into a marshalled stream
     * @param ostream the output stream
     * @param value EntreeSortie value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, entreeSortie.EntreeSortie value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to EntreeSortie
     * @param obj the CORBA Object
     * @return EntreeSortie Object
     */
    public static EntreeSortie narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof EntreeSortie)
            return (EntreeSortie)obj;

        if (obj._is_a(id()))
        {
            _EntreeSortieStub stub = new _EntreeSortieStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to EntreeSortie
     * @param obj the CORBA Object
     * @return EntreeSortie Object
     */
    public static EntreeSortie unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof EntreeSortie)
            return (EntreeSortie)obj;

        _EntreeSortieStub stub = new _EntreeSortieStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
