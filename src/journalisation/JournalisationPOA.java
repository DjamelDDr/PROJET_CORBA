package journalisation;

/**
 * Interface definition : Journalisation
 * 
 * @author OpenORB Compiler
 */
public abstract class JournalisationPOA extends org.omg.PortableServer.Servant
        implements JournalisationOperations, org.omg.CORBA.portable.InvokeHandler
{
    public Journalisation _this()
    {
        return JournalisationHelper.narrow(_this_object());
    }

    public Journalisation _this(org.omg.CORBA.ORB orb)
    {
        return JournalisationHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:journalisation/Journalisation:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("historiser")) {
                return _invoke_historiser(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_historiser(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        journalisation.Collaborateur arg0_in = journalisation.CollaborateurHelper.read(_is);
        String arg1_in = _is.read_string();
        String arg2_in = _is.read_string();
        String arg3_in = _is.read_string();
        boolean arg4_in = _is.read_boolean();

        historiser(arg0_in, arg1_in, arg2_in, arg3_in, arg4_in);

        _output = handler.createReply();

        return _output;
    }

}
