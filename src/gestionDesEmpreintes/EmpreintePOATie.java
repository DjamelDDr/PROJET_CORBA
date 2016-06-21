package gestionDesEmpreintes;

/**
 * Interface definition : Empreinte
 * 
 * @author OpenORB Compiler
 */
public class EmpreintePOATie extends EmpreintePOA
{

    //
    // Private reference to implementation object
    //
    private EmpreinteOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public EmpreintePOATie(EmpreinteOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public EmpreintePOATie(EmpreinteOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public EmpreinteOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(EmpreinteOperations delegate_)
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
     * Operation supprimerEmpreinte
     */
    public boolean supprimerEmpreinte(int id, String typeDuCollb)
        throws gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas
    {
        return _tie.supprimerEmpreinte( id,  typeDuCollb);
    }

    /**
     * Operation verifierEmpreinte
     */
    public boolean verifierEmpreinte(int id, String lempreinte)
        throws gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas
    {
        return _tie.verifierEmpreinte( id,  lempreinte);
    }

}
