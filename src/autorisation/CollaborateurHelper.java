package autorisation;

/** 
 * Helper class for : Collaborateur
 *  
 * @author OpenORB Compiler
 */ 
public class CollaborateurHelper
{
    private static final boolean HAS_OPENORB;
    static {
        boolean hasOpenORB = false;
        try {
            Thread.currentThread().getContextClassLoader().loadClass("org.openorb.CORBA.Any");
            hasOpenORB = true;
        }
        catch(ClassNotFoundException ex) {
        }
        HAS_OPENORB = hasOpenORB;
    }
    /**
     * Insert Collaborateur into an any
     * @param a an any
     * @param t Collaborateur value
     */
    public static void insert(org.omg.CORBA.Any a, autorisation.Collaborateur t)
    {
        a.insert_Streamable(new autorisation.CollaborateurHolder(t));
    }

    /**
     * Extract Collaborateur from an any
     * @param a an any
     * @return the extracted Collaborateur value
     */
    public static autorisation.Collaborateur extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof autorisation.CollaborateurHolder)
                    return ((autorisation.CollaborateurHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            autorisation.CollaborateurHolder h = new autorisation.CollaborateurHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;
    private static boolean _working = false;

    /**
     * Return the Collaborateur TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            synchronized(org.omg.CORBA.TypeCode.class) {
                if (_tc != null)
                    return _tc;
                if (_working)
                    return org.omg.CORBA.ORB.init().create_recursive_tc(id());
                _working = true;
                org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[6];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "idCollab";
                _members[0].type = autorisation.IdHelper.type();
                _members[1] = new org.omg.CORBA.StructMember();
                _members[1].name = "nom";
                _members[1].type = autorisation.NomHelper.type();
                _members[2] = new org.omg.CORBA.StructMember();
                _members[2].name = "prenom";
                _members[2].type = autorisation.PrenomHelper.type();
                _members[3] = new org.omg.CORBA.StructMember();
                _members[3].name = "mdp";
                _members[3].type = autorisation.MotDePasseHelper.type();
                _members[4] = new org.omg.CORBA.StructMember();
                _members[4].name = "photo";
                _members[4].type = autorisation.PhotoHelper.type();
                _members[5] = new org.omg.CORBA.StructMember();
                _members[5].name = "tcollab";
                _members[5].type = autorisation.typeCollaborateurHelper.type();
                _tc = orb.create_struct_tc(id(),"Collaborateur",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the Collaborateur IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:autorisation/Collaborateur:1.0";

    /**
     * Read Collaborateur from a marshalled stream
     * @param istream the input stream
     * @return the readed Collaborateur value
     */
    public static autorisation.Collaborateur read(org.omg.CORBA.portable.InputStream istream)
    {
        autorisation.Collaborateur new_one = new autorisation.Collaborateur();

        new_one.idCollab = autorisation.IdHelper.read(istream);
        new_one.nom = autorisation.NomHelper.read(istream);
        new_one.prenom = autorisation.PrenomHelper.read(istream);
        new_one.mdp = autorisation.MotDePasseHelper.read(istream);
        new_one.photo = autorisation.PhotoHelper.read(istream);
        new_one.tcollab = autorisation.typeCollaborateurHelper.read(istream);

        return new_one;
    }

    /**
     * Write Collaborateur into a marshalled stream
     * @param ostream the output stream
     * @param value Collaborateur value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, autorisation.Collaborateur value)
    {
        autorisation.IdHelper.write(ostream,value.idCollab);
        autorisation.NomHelper.write(ostream,value.nom);
        autorisation.PrenomHelper.write(ostream,value.prenom);
        autorisation.MotDePasseHelper.write(ostream,value.mdp);
        autorisation.PhotoHelper.write(ostream,value.photo);
        autorisation.typeCollaborateurHelper.write(ostream,value.tcollab);
    }

}
