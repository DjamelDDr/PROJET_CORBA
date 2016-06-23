package gestionDesComptes;

/**
 * Interface definition : CreationDeCompte
 * 
 * @author OpenORB Compiler
 */
public class CreationDeComptePOATie extends CreationDeComptePOA
{

    //
    // Private reference to implementation object
    //
    private CreationDeCompteOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public CreationDeComptePOATie(CreationDeCompteOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public CreationDeComptePOATie(CreationDeCompteOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public CreationDeCompteOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(CreationDeCompteOperations delegate_)
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
