package gestionDesComptes;

/**
 * Interface definition : CreationDeCompte
 * 
 * @author OpenORB Compiler
 */
public class _CreationDeCompteStub extends org.omg.CORBA.portable.ObjectImpl
        implements CreationDeCompte
{
    static final String[] _ids_list =
    {
        "IDL:gestionDesComptes/CreationDeCompte:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = gestionDesComptes.CreationDeCompteOperations.class;

    /**
     * Operation ajouterCollab
     */
    public int ajouterCollab(gestionDesComptes.Collaborateur c)
        throws gestionDesComptes.CreationDeComptePackage.collabExisteDeja
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("ajouterCollab",true);
                    gestionDesComptes.CollaborateurHelper.write(_output,c);
                    _input = this._invoke(_output);
                    int _arg_ret = _input.read_long();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(gestionDesComptes.CreationDeComptePackage.collabExisteDejaHelper.id()))
                    {
                        throw gestionDesComptes.CreationDeComptePackage.collabExisteDejaHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("ajouterCollab",_opsClass);
                if (_so == null)
                   continue;
                gestionDesComptes.CreationDeCompteOperations _self = (gestionDesComptes.CreationDeCompteOperations) _so.servant;
                try
                {
                    return _self.ajouterCollab( c);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation modifierCollab
     */
    public boolean modifierCollab(gestionDesComptes.Collaborateur c)
        throws gestionDesComptes.CreationDeComptePackage.collabInconnu
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("modifierCollab",true);
                    gestionDesComptes.CollaborateurHelper.write(_output,c);
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
                    if (_exception_id.equals(gestionDesComptes.CreationDeComptePackage.collabInconnuHelper.id()))
                    {
                        throw gestionDesComptes.CreationDeComptePackage.collabInconnuHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("modifierCollab",_opsClass);
                if (_so == null)
                   continue;
                gestionDesComptes.CreationDeCompteOperations _self = (gestionDesComptes.CreationDeCompteOperations) _so.servant;
                try
                {
                    return _self.modifierCollab( c);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation supprimerCollab
     */
    public boolean supprimerCollab(int id, String typeDuCollb)
        throws gestionDesComptes.CreationDeComptePackage.collabInconnu
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("supprimerCollab",true);
                    gestionDesComptes.IdHelper.write(_output,id);
                    _output.write_string(typeDuCollb);
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
                    if (_exception_id.equals(gestionDesComptes.CreationDeComptePackage.collabInconnuHelper.id()))
                    {
                        throw gestionDesComptes.CreationDeComptePackage.collabInconnuHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("supprimerCollab",_opsClass);
                if (_so == null)
                   continue;
                gestionDesComptes.CreationDeCompteOperations _self = (gestionDesComptes.CreationDeCompteOperations) _so.servant;
                try
                {
                    return _self.supprimerCollab( id,  typeDuCollb);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
