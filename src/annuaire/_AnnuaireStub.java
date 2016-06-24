package annuaire;

/**
 * Interface definition : Annuaire
 * 
 * @author OpenORB Compiler
 */
public class _AnnuaireStub extends org.omg.CORBA.portable.ObjectImpl
        implements Annuaire
{
    static final String[] _ids_list =
    {
        "IDL:annuaire/Annuaire:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = annuaire.AnnuaireOperations.class;

    /**
     * Operation ajouterDansAnnuaire
     */
    public int ajouterDansAnnuaire(annuaire.Collaborateur c)
        throws annuaire.AnnuairePackage.collabExisteDeja
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("ajouterDansAnnuaire",true);
                    annuaire.CollaborateurHelper.write(_output,c);
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
                    if (_exception_id.equals(annuaire.AnnuairePackage.collabExisteDejaHelper.id()))
                    {
                        throw annuaire.AnnuairePackage.collabExisteDejaHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("ajouterDansAnnuaire",_opsClass);
                if (_so == null)
                   continue;
                annuaire.AnnuaireOperations _self = (annuaire.AnnuaireOperations) _so.servant;
                try
                {
                    return _self.ajouterDansAnnuaire( c);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation modifierDansAnnuaire
     */
    public boolean modifierDansAnnuaire(int id, String nom, String prenom, String mdp, String photo)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("modifierDansAnnuaire",true);
                    annuaire.IdHelper.write(_output,id);
                    annuaire.NomHelper.write(_output,nom);
                    annuaire.PrenomHelper.write(_output,prenom);
                    annuaire.MotDePasseHelper.write(_output,mdp);
                    annuaire.PhotoHelper.write(_output,photo);
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
                    if (_exception_id.equals(annuaire.AnnuairePackage.collabNExistepasHelper.id()))
                    {
                        throw annuaire.AnnuairePackage.collabNExistepasHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("modifierDansAnnuaire",_opsClass);
                if (_so == null)
                   continue;
                annuaire.AnnuaireOperations _self = (annuaire.AnnuaireOperations) _so.servant;
                try
                {
                    return _self.modifierDansAnnuaire( id,  nom,  prenom,  mdp,  photo);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation associationDansAnnuaire
     */
    public String associationDansAnnuaire(int id, String photo)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("associationDansAnnuaire",true);
                    annuaire.IdHelper.write(_output,id);
                    annuaire.PhotoHelper.write(_output,photo);
                    _input = this._invoke(_output);
                    String _arg_ret = _input.read_string();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(annuaire.AnnuairePackage.collabNExistepasHelper.id()))
                    {
                        throw annuaire.AnnuairePackage.collabNExistepasHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("associationDansAnnuaire",_opsClass);
                if (_so == null)
                   continue;
                annuaire.AnnuaireOperations _self = (annuaire.AnnuaireOperations) _so.servant;
                try
                {
                    return _self.associationDansAnnuaire( id,  photo);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation supprimerDansAnnuaire
     */
    public boolean supprimerDansAnnuaire(int id, String photo, String typeDuCollb)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("supprimerDansAnnuaire",true);
                    annuaire.IdHelper.write(_output,id);
                    annuaire.PhotoHelper.write(_output,photo);
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
                    if (_exception_id.equals(annuaire.AnnuairePackage.collabNExistepasHelper.id()))
                    {
                        throw annuaire.AnnuairePackage.collabNExistepasHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("supprimerDansAnnuaire",_opsClass);
                if (_so == null)
                   continue;
                annuaire.AnnuaireOperations _self = (annuaire.AnnuaireOperations) _so.servant;
                try
                {
                    return _self.supprimerDansAnnuaire( id,  photo,  typeDuCollb);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation verifierDansAnnuaire
     */
    public boolean verifierDansAnnuaire(int id, String mdp)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("verifierDansAnnuaire",true);
                    annuaire.IdHelper.write(_output,id);
                    annuaire.MotDePasseHelper.write(_output,mdp);
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
                    if (_exception_id.equals(annuaire.AnnuairePackage.collabNExistepasHelper.id()))
                    {
                        throw annuaire.AnnuairePackage.collabNExistepasHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("verifierDansAnnuaire",_opsClass);
                if (_so == null)
                   continue;
                annuaire.AnnuaireOperations _self = (annuaire.AnnuaireOperations) _so.servant;
                try
                {
                    return _self.verifierDansAnnuaire( id,  mdp);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation existerDansLeSystem
     */
    public boolean existerDansLeSystem(int id, String typeDuCollb)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("existerDansLeSystem",true);
                    annuaire.IdHelper.write(_output,id);
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
                    if (_exception_id.equals(annuaire.AnnuairePackage.collabNExistepasHelper.id()))
                    {
                        throw annuaire.AnnuairePackage.collabNExistepasHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("existerDansLeSystem",_opsClass);
                if (_so == null)
                   continue;
                annuaire.AnnuaireOperations _self = (annuaire.AnnuaireOperations) _so.servant;
                try
                {
                    return _self.existerDansLeSystem( id,  typeDuCollb);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
