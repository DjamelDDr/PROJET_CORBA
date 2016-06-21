package journalisation;

/**
 * Interface definition : Journalisation
 * 
 * @author OpenORB Compiler
 */
public class _JournalisationStub extends org.omg.CORBA.portable.ObjectImpl
        implements Journalisation
{
    static final String[] _ids_list =
    {
        "IDL:journalisation/Journalisation:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = journalisation.JournalisationOperations.class;

    /**
     * Operation historiser
     */
    public void historiser(journalisation.Collaborateur c, String numPorte, String idZone, String horaire, boolean autorise)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("historiser",false);
                    journalisation.CollaborateurHelper.write(_output,c);
                    _output.write_string(numPorte);
                    _output.write_string(idZone);
                    _output.write_string(horaire);
                    _output.write_boolean(autorise);
                    _input = this._invoke(_output);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("historiser",_opsClass);
                if (_so == null)
                   continue;
                journalisation.JournalisationOperations _self = (journalisation.JournalisationOperations) _so.servant;
                try
                {
                    _self.historiser( c,  numPorte,  idZone,  horaire,  autorise);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
