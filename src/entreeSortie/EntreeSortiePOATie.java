package entreeSortie;

/**
 * Interface definition : EntreeSortie
 * 
 * @author OpenORB Compiler
 */
public class EntreeSortiePOATie extends EntreeSortiePOA
{

    //
    // Private reference to implementation object
    //
    private EntreeSortieOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public EntreeSortiePOATie(EntreeSortieOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public EntreeSortiePOATie(EntreeSortieOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public EntreeSortieOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(EntreeSortieOperations delegate_)
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

}
