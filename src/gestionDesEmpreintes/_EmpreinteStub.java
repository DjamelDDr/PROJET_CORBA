package gestionDesEmpreintes;

/**
 * Interface definition : Empreinte
 * 
 * @author OpenORB Compiler
 */
public class _EmpreinteStub extends org.omg.CORBA.portable.ObjectImpl
        implements Empreinte
{
    static final String[] _ids_list =
    {
        "IDL:gestionDesEmpreintes/Empreinte:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = gestionDesEmpreintes.EmpreinteOperations.class;

    /**
     * Operation supprimerEmpreinte
     */
    public boolean supprimerEmpreinte(int id, String typeDuCollb)
        throws gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("supprimerEmpreinte",true);
                    gestionDesEmpreintes.IdHelper.write(_output,id);
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
                    if (_exception_id.equals(gestionDesEmpreintes.EmpreintePackage.empreinteNExistepasHelper.id()))
                    {
                        throw gestionDesEmpreintes.EmpreintePackage.empreinteNExistepasHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("supprimerEmpreinte",_opsClass);
                if (_so == null)
                   continue;
                gestionDesEmpreintes.EmpreinteOperations _self = (gestionDesEmpreintes.EmpreinteOperations) _so.servant;
                try
                {
                    return _self.supprimerEmpreinte( id,  typeDuCollb);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation verifierEmpreinte
     */
    public boolean verifierEmpreinte(int id, String lempreinte)
        throws gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("verifierEmpreinte",true);
                    gestionDesEmpreintes.IdHelper.write(_output,id);
                    _output.write_string(lempreinte);
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
                    if (_exception_id.equals(gestionDesEmpreintes.EmpreintePackage.empreinteNExistepasHelper.id()))
                    {
                        throw gestionDesEmpreintes.EmpreintePackage.empreinteNExistepasHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("verifierEmpreinte",_opsClass);
                if (_so == null)
                   continue;
                gestionDesEmpreintes.EmpreinteOperations _self = (gestionDesEmpreintes.EmpreinteOperations) _so.servant;
                try
                {
                    return _self.verifierEmpreinte( id,  lempreinte);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
