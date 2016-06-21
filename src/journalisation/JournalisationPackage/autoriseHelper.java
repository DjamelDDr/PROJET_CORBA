package journalisation.JournalisationPackage;

/** 
 * Helper class for : autorise
 *  
 * @author OpenORB Compiler
 */ 
public class autoriseHelper
{
    /**
     * Insert autorise into an any
     * @param a an any
     * @param t autorise value
     */
    public static void insert(org.omg.CORBA.Any a, boolean t)
    {
        a.type(type());
        write(a.create_output_stream(),t);
    }

    /**
     * Extract autorise from an any
     * @param a an any
     * @return the extracted autorise value
     */
    public static boolean extract(org.omg.CORBA.Any a)
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
     * Return the autorise TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_alias_tc(id(),"autorise",orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_boolean));
        }
        return _tc;
    }

    /**
     * Return the autorise IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:journalisation/Journalisation/autorise:1.0";

    /**
     * Read autorise from a marshalled stream
     * @param istream the input stream
     * @return the readed autorise value
     */
    public static boolean read(org.omg.CORBA.portable.InputStream istream)
    {
        boolean new_one;
        new_one = istream.read_boolean();

        return new_one;
    }

    /**
     * Write autorise into a marshalled stream
     * @param ostream the output stream
     * @param value autorise value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, boolean value)
    {
        ostream.write_boolean(value);
    }

}
