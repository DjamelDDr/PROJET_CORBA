package entreeSortie;

/** 
 * Helper class for : typeCollaborateur
 *  
 * @author OpenORB Compiler
 */ 
public class typeCollaborateurHelper
{
    /**
     * Insert typeCollaborateur into an any
     * @param a an any
     * @param t typeCollaborateur value
     */
    public static void insert(org.omg.CORBA.Any a, entreeSortie.typeCollaborateur t)
    {
        a.type(type());
        write(a.create_output_stream(),t);
    }

    /**
     * Extract typeCollaborateur from an any
     * @param a an any
     * @return the extracted typeCollaborateur value
     */
    public static entreeSortie.typeCollaborateur extract(org.omg.CORBA.Any a)
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
     * Return the typeCollaborateur TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            String []_members = new String[2];
            _members[0] = "permanent";
            _members[1] = "ponctuel";
            _tc = orb.create_enum_tc(id(),"typeCollaborateur",_members);
        }
        return _tc;
    }

    /**
     * Return the typeCollaborateur IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:entreeSortie/typeCollaborateur:1.0";

    /**
     * Read typeCollaborateur from a marshalled stream
     * @param istream the input stream
     * @return the readed typeCollaborateur value
     */
    public static entreeSortie.typeCollaborateur read(org.omg.CORBA.portable.InputStream istream)
    {
        return typeCollaborateur.from_int(istream.read_ulong());
    }

    /**
     * Write typeCollaborateur into a marshalled stream
     * @param ostream the output stream
     * @param value typeCollaborateur value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, entreeSortie.typeCollaborateur value)
    {
        ostream.write_ulong(value.value());
    }

}
