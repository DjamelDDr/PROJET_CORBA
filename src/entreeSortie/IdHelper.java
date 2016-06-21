package entreeSortie;

/** 
 * Helper class for : Id
 *  
 * @author OpenORB Compiler
 */ 
public class IdHelper
{
    /**
     * Insert Id into an any
     * @param a an any
     * @param t Id value
     */
    public static void insert(org.omg.CORBA.Any a, int t)
    {
        a.type(type());
        write(a.create_output_stream(),t);
    }

    /**
     * Extract Id from an any
     * @param a an any
     * @return the extracted Id value
     */
    public static int extract(org.omg.CORBA.Any a)
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
     * Return the Id TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_alias_tc(id(),"Id",orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_ulong));
        }
        return _tc;
    }

    /**
     * Return the Id IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:entreeSortie/Id:1.0";

    /**
     * Read Id from a marshalled stream
     * @param istream the input stream
     * @return the readed Id value
     */
    public static int read(org.omg.CORBA.portable.InputStream istream)
    {
        int new_one;
        new_one = istream.read_ulong();

        return new_one;
    }

    /**
     * Write Id into a marshalled stream
     * @param ostream the output stream
     * @param value Id value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, int value)
    {
        ostream.write_ulong(value);
    }

}
