package annuaire;

/**
 * Interface definition : Annuaire
 * 
 * @author OpenORB Compiler
 */
public abstract class AnnuairePOA extends org.omg.PortableServer.Servant
        implements AnnuaireOperations, org.omg.CORBA.portable.InvokeHandler
{
    public Annuaire _this()
    {
        return AnnuaireHelper.narrow(_this_object());
    }

    public Annuaire _this(org.omg.CORBA.ORB orb)
    {
        return AnnuaireHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:annuaire/Annuaire:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("ajouterDansAnnuaire")) {
                return _invoke_ajouterDansAnnuaire(_is, handler);
        } else if (opName.equals("associationDansAnnuaire")) {
                return _invoke_associationDansAnnuaire(_is, handler);
        } else if (opName.equals("existerDansLeSystem")) {
                return _invoke_existerDansLeSystem(_is, handler);
        } else if (opName.equals("modifierDansAnnuaire")) {
                return _invoke_modifierDansAnnuaire(_is, handler);
        } else if (opName.equals("supprimerDansAnnuaire")) {
                return _invoke_supprimerDansAnnuaire(_is, handler);
        } else if (opName.equals("verifierDansAnnuaire")) {
                return _invoke_verifierDansAnnuaire(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_ajouterDansAnnuaire(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        annuaire.Collaborateur arg0_in = annuaire.CollaborateurHelper.read(_is);

        try
        {
            int _arg_result = ajouterDansAnnuaire(arg0_in);

            _output = handler.createReply();
            _output.write_long(_arg_result);

        }
        catch (annuaire.AnnuairePackage.collabExisteDeja _exception)
        {
            _output = handler.createExceptionReply();
            annuaire.AnnuairePackage.collabExisteDejaHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_modifierDansAnnuaire(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = annuaire.IdHelper.read(_is);
        String arg1_in = annuaire.NomHelper.read(_is);
        String arg2_in = annuaire.PrenomHelper.read(_is);
        String arg3_in = annuaire.MotDePasseHelper.read(_is);
        String arg4_in = annuaire.PhotoHelper.read(_is);

        try
        {
            boolean _arg_result = modifierDansAnnuaire(arg0_in, arg1_in, arg2_in, arg3_in, arg4_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (annuaire.AnnuairePackage.collabNExistepas _exception)
        {
            _output = handler.createExceptionReply();
            annuaire.AnnuairePackage.collabNExistepasHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_associationDansAnnuaire(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = annuaire.IdHelper.read(_is);
        String arg1_in = annuaire.PhotoHelper.read(_is);

        try
        {
            boolean _arg_result = associationDansAnnuaire(arg0_in, arg1_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (annuaire.AnnuairePackage.collabNExistepas _exception)
        {
            _output = handler.createExceptionReply();
            annuaire.AnnuairePackage.collabNExistepasHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_supprimerDansAnnuaire(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = annuaire.IdHelper.read(_is);
        String arg1_in = annuaire.PhotoHelper.read(_is);
        String arg2_in = _is.read_string();

        try
        {
            boolean _arg_result = supprimerDansAnnuaire(arg0_in, arg1_in, arg2_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (annuaire.AnnuairePackage.collabNExistepas _exception)
        {
            _output = handler.createExceptionReply();
            annuaire.AnnuairePackage.collabNExistepasHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_verifierDansAnnuaire(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = annuaire.IdHelper.read(_is);
        String arg1_in = annuaire.MotDePasseHelper.read(_is);

        try
        {
            boolean _arg_result = verifierDansAnnuaire(arg0_in, arg1_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (annuaire.AnnuairePackage.collabNExistepas _exception)
        {
            _output = handler.createExceptionReply();
            annuaire.AnnuairePackage.collabNExistepasHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_existerDansLeSystem(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = annuaire.IdHelper.read(_is);
        String arg1_in = _is.read_string();

        try
        {
            boolean _arg_result = existerDansLeSystem(arg0_in, arg1_in);

            _output = handler.createReply();
            _output.write_boolean(_arg_result);

        }
        catch (annuaire.AnnuairePackage.collabNExistepas _exception)
        {
            _output = handler.createExceptionReply();
            annuaire.AnnuairePackage.collabNExistepasHelper.write(_output,_exception);
        }
        return _output;
    }

}
