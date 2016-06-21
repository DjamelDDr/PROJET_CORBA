package gestionDesEmpreintes;

/** 
 * Helper class for : Empreinte
 *  
 * @author OpenORB Compiler
 */ 
public class EmpreinteHelper
{
    /**
     * Insert Empreinte into an any
     * @param a an any
     * @param t Empreinte value
     */
    public static void insert(org.omg.CORBA.Any a, gestionDesEmpreintes.Empreinte t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract Empreinte from an any
     * @param a an any
     * @return the extracted Empreinte value
     */
    public static gestionDesEmpreintes.Empreinte extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return gestionDesEmpreintes.EmpreinteHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the Empreinte TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"Empreinte");
        }
        return _tc;
    }

    /**
     * Return the Empreinte IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:gestionDesEmpreintes/Empreinte:1.0";

    /**
     * Read Empreinte from a marshalled stream
     * @param istream the input stream
     * @return the readed Empreinte value
     */
    public static gestionDesEmpreintes.Empreinte read(org.omg.CORBA.portable.InputStream istream)
    {
        return(gestionDesEmpreintes.Empreinte)istream.read_Object(gestionDesEmpreintes._EmpreinteStub.class);
    }

    /**
     * Write Empreinte into a marshalled stream
     * @param ostream the output stream
     * @param value Empreinte value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, gestionDesEmpreintes.Empreinte value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to Empreinte
     * @param obj the CORBA Object
     * @return Empreinte Object
     */
    public static Empreinte narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Empreinte)
            return (Empreinte)obj;

        if (obj._is_a(id()))
        {
            _EmpreinteStub stub = new _EmpreinteStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to Empreinte
     * @param obj the CORBA Object
     * @return Empreinte Object
     */
    public static Empreinte unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Empreinte)
            return (Empreinte)obj;

        _EmpreinteStub stub = new _EmpreinteStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
