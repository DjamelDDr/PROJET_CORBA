package gestionDesEmpreintes;

/**
 * Interface definition : Empreinte
 * 
 * @author OpenORB Compiler
 */
public abstract class EmpreintePOA extends org.omg.PortableServer.Servant
        implements EmpreinteOperations, org.omg.CORBA.portable.InvokeHandler
{
    public Empreinte _this()
    {
        return EmpreinteHelper.narrow(_this_object());
    }

    public Empreinte _this(org.omg.CORBA.ORB orb)
    {
        return EmpreinteHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:gestionDesEmpreintes/Empreinte:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("supprimerEmpreinte")) {
                return _invoke_supprimerEmpreinte(_is, handler);
        } else if (opName.equals("verifierEmpreinte")) {
                return _invoke_verifierEmpreinte(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_supprimerEmpreinte(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = gestionDesEmpreintes.IdHelper.read(_is);
        String arg1_in = _is.read_string();

        try
        {
            boolean _arg_result = supprimerEmpreinte(arg0_in, arg1_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas _exception)
        {
            _output = handler.createExceptionReply();
            gestionDesEmpreintes.EmpreintePackage.empreinteNExistepasHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_verifierEmpreinte(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = gestionDesEmpreintes.IdHelper.read(_is);
        String arg1_in = _is.read_string();

        try
        {
            boolean _arg_result = verifierEmpreinte(arg0_in, arg1_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas _exception)
        {
            _output = handler.createExceptionReply();
            gestionDesEmpreintes.EmpreintePackage.empreinteNExistepasHelper.write(_output,_exception);
        }
        return _output;
    }

}
