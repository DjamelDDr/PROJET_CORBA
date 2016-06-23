package autorisation;

/**
 * Interface definition : Autorisation
 * 
 * @author OpenORB Compiler
 */
public class _AutorisationStub extends org.omg.CORBA.portable.ObjectImpl
        implements Autorisation
{
    static final String[] _ids_list =
    {
        "IDL:autorisation/Autorisation:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = autorisation.AutorisationOperations.class;

    /**
     * Operation autorisationPermanent
     */
    public boolean autorisationPermanent(autorisation.Collaborateur c, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("autorisationPermanent",true);
                    autorisation.CollaborateurHelper.write(_output,c);
                    _output.write_string(heureDebut);
                    _output.write_string(heureFin);
                    _output.write_string(numPorte);
                    _input = this._invoke(_output);
                    boolean _arg_ret = _input.read_boolean();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(autorisation.AutorisationPackage.autorisationCollabInterditeHelper.id()))
                    {
                        throw autorisation.AutorisationPackage.autorisationCollabInterditeHelper.read(_exception.getInputStream());
                    }

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("autorisationPermanent",_opsClass);
                if (_so == null)
                   continue;
                autorisation.AutorisationOperations _self = (autorisation.AutorisationOperations) _so.servant;
                try
                {
                    return _self.autorisationPermanent( c,  heureDebut,  heureFin,  numPorte);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation autorisationPonctuel
     */
    public boolean autorisationPonctuel(autorisation.Collaborateur c, String jourDebut, String jourFin, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("autorisationPonctuel",true);
                    autorisation.CollaborateurHelper.write(_output,c);
                    _output.write_string(jourDebut);
                    _output.write_string(jourFin);
                    _output.write_string(heureDebut);
                    _output.write_string(heureFin);
                    _output.write_string(numPorte);
                    _input = this._invoke(_output);
                    boolean _arg_ret = _input.read_boolean();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(autorisation.AutorisationPackage.autorisationCollabInterditeHelper.id()))
                    {
                        throw autorisation.AutorisationPackage.autorisationCollabInterditeHelper.read(_exception.getInputStream());
                    }

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("autorisationPonctuel",_opsClass);
                if (_so == null)
                   continue;
                autorisation.AutorisationOperations _self = (autorisation.AutorisationOperations) _so.servant;
                try
                {
                    return _self.autorisationPonctuel( c,  jourDebut,  jourFin,  heureDebut,  heureFin,  numPorte);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
