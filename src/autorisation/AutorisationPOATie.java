package autorisation;

/**
 * Interface definition : Autorisation
 * 
 * @author OpenORB Compiler
 */
public class AutorisationPOATie extends AutorisationPOA
{

    //
    // Private reference to implementation object
    //
    private AutorisationOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public AutorisationPOATie(AutorisationOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public AutorisationPOATie(AutorisationOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public AutorisationOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(AutorisationOperations delegate_)
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
     * Operation autorisationPermanent
     */
    public boolean autorisationPermanent(int id, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite
    {
        return _tie.autorisationPermanent( id,  heureDebut,  heureFin,  numPorte);
    }

    /**
     * Operation autorisationPonctuel
     */
    public boolean autorisationPonctuel(int id, String jourDebut, String jourFin, String heureDebut, String heureFin, String numPorte)
        throws autorisation.AutorisationPackage.autorisationCollabInterdite
    {
        return _tie.autorisationPonctuel( id,  jourDebut,  jourFin,  heureDebut,  heureFin,  numPorte);
    }

}
