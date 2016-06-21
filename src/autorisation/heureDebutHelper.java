package autorisation;

/** 
 * Helper class for : heureDebut
 *  
 * @author OpenORB Compiler
 */ 
public class heureDebutHelper
{
    /**
     * Insert heureDebut into an any
     * @param a an any
     * @param t heureDebut value
     */
    public static void insert(org.omg.CORBA.Any a, String t)
    {
        a.type(type());
        write(a.create_output_stream(),t);
    }

    /**
     * Extract heureDebut from an any
     * @param a an any
     * @return the extracted heureDebut value
     */
    public static String extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the heureDebut TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_alias_tc(id(),"heureDebut",orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string));
        }
        return _tc;
    }

    /**
     * Return the heureDebut IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:autorisation/heureDebut:1.0";

    /**
     * Read heureDebut from a marshalled stream
     * @param istream the input stream
     * @return the readed heureDebut value
     */
    public static String read(org.omg.CORBA.portable.InputStream istream)
    {
        String new_one;
        new_one = istream.read_string();

        return new_one;
    }

    /**
     * Write heureDebut into a marshalled stream
     * @param ostream the output stream
     * @param value heureDebut value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, String value)
    {
        ostream.write_string(value);
    }

}
