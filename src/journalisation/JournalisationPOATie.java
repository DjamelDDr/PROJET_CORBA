package journalisation;

/**
 * Interface definition : Journalisation
 * 
 * @author OpenORB Compiler
 */
public class JournalisationPOATie extends JournalisationPOA
{

    //
    // Private reference to implementation object
    //
    private JournalisationOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public JournalisationPOATie(JournalisationOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public JournalisationPOATie(JournalisationOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public JournalisationOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(JournalisationOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation historiser
     */
    public void historiser(journalisation.Collaborateur c, String numPorte, String idZone, String horaire, boolean autorise)
    {
        _tie.historiser( c,  numPorte,  idZone,  horaire,  autorise);
    }

}
