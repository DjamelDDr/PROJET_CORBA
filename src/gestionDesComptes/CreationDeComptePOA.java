package gestionDesComptes;

/**
 * Interface definition : CreationDeCompte
 * 
 * @author OpenORB Compiler
 */
public abstract class CreationDeComptePOA extends org.omg.PortableServer.Servant
        implements CreationDeCompteOperations, org.omg.CORBA.portable.InvokeHandler
{
    public CreationDeCompte _this()
    {
        return CreationDeCompteHelper.narrow(_this_object());
    }

    public CreationDeCompte _this(org.omg.CORBA.ORB orb)
    {
        return CreationDeCompteHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:gestionDesComptes/CreationDeCompte:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("ajouterCollab")) {
                return _invoke_ajouterCollab(_is, handler);
        } else if (opName.equals("modifierCollab")) {
                return _invoke_modifierCollab(_is, handler);
        } else if (opName.equals("supprimerCollab")) {
                return _invoke_supprimerCollab(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_ajouterCollab(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        gestionDesComptes.Collaborateur arg0_in = gestionDesComptes.CollaborateurHelper.read(_is);

        try
        {
            int _arg_result = ajouterCollab(arg0_in);

            _output = handler.createReply();
            _output.write_long(_arg_result);

        }
        catch (gestionDesComptes.CreationDeComptePackage.collabExisteDeja _exception)
        {
            _output = handler.createExceptionReply();
            gestionDesComptes.CreationDeComptePackage.collabExisteDejaHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_modifierCollab(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        gestionDesComptes.Collaborateur arg0_in = gestionDesComptes.CollaborateurHelper.read(_is);

        try
        {
            boolean _arg_result = modifierCollab(arg0_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (gestionDesComptes.CreationDeComptePackage.collabInconnu _exception)
        {
            _output = handler.createExceptionReply();
            gestionDesComptes.CreationDeComptePackage.collabInconnuHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_supprimerCollab(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = gestionDesComptes.IdHelper.read(_is);
        String arg1_in = _is.read_string();

        try
        {
            boolean _arg_result = supprimerCollab(arg0_in, arg1_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (gestionDesComptes.CreationDeComptePackage.collabInconnu _exception)
        {
            _output = handler.createExceptionReply();
            gestionDesComptes.CreationDeComptePackage.collabInconnuHelper.write(_output,_exception);
        }
        return _output;
    }

}
