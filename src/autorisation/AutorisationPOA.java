package autorisation;

/**
 * Interface definition : Autorisation
 * 
 * @author OpenORB Compiler
 */
public abstract class AutorisationPOA extends org.omg.PortableServer.Servant
        implements AutorisationOperations, org.omg.CORBA.portable.InvokeHandler
{
    public Autorisation _this()
    {
        return AutorisationHelper.narrow(_this_object());
    }

    public Autorisation _this(org.omg.CORBA.ORB orb)
    {
        return AutorisationHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:autorisation/Autorisation:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("autorisationPermanent")) {
                return _invoke_autorisationPermanent(_is, handler);
        } else if (opName.equals("autorisationPonctuel")) {
                return _invoke_autorisationPonctuel(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_autorisationPermanent(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = autorisation.IdHelper.read(_is);
        String arg1_in = _is.read_string();
        String arg2_in = _is.read_string();
        String arg3_in = _is.read_string();

        try
        {
            boolean _arg_result = autorisationPermanent(arg0_in, arg1_in, arg2_in, arg3_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (autorisation.AutorisationPackage.autorisationCollabInterdite _exception)
        {
            _output = handler.createExceptionReply();
            autorisation.AutorisationPackage.autorisationCollabInterditeHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_autorisationPonctuel(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = autorisation.IdHelper.read(_is);
        String arg1_in = _is.read_string();
        String arg2_in = _is.read_string();
        String arg3_in = _is.read_string();
        String arg4_in = _is.read_string();
        String arg5_in = _is.read_string();

        try
        {
            boolean _arg_result = autorisationPonctuel(arg0_in, arg1_in, arg2_in, arg3_in, arg4_in, arg5_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (autorisation.AutorisationPackage.autorisationCollabInterdite _exception)
        {
            _output = handler.createExceptionReply();
            autorisation.AutorisationPackage.autorisationCollabInterditeHelper.write(_output,_exception);
        }
        return _output;
    }

}
