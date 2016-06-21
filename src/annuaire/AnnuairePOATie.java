package annuaire;

/**
 * Interface definition : Annuaire
 * 
 * @author OpenORB Compiler
 */
public class AnnuairePOATie extends AnnuairePOA
{

    //
    // Private reference to implementation object
    //
    private AnnuaireOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public AnnuairePOATie(AnnuaireOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public AnnuairePOATie(AnnuaireOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public AnnuaireOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(AnnuaireOperations delegate_)
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
     * Operation ajouterDansAnnuaire
     */
    public int ajouterDansAnnuaire(annuaire.Collaborateur c)
        throws annuaire.AnnuairePackage.collabExisteDeja
    {
        return _tie.ajouterDansAnnuaire( c);
    }

    /**
     * Operation modifierDansAnnuaire
     */
    public boolean modifierDansAnnuaire(int id, String nom, String prenom, String mdp, String photo)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        return _tie.modifierDansAnnuaire( id,  nom,  prenom,  mdp,  photo);
    }

    /**
     * Operation associationDansAnnuaire
     */
    public boolean associationDansAnnuaire(int id, String photo)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        return _tie.associationDansAnnuaire( id,  photo);
    }

    /**
     * Operation supprimerDansAnnuaire
     */
    public boolean supprimerDansAnnuaire(int id, String photo, String typeDuCollb)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        return _tie.supprimerDansAnnuaire( id,  photo,  typeDuCollb);
    }

    /**
     * Operation verifierDansAnnuaire
     */
    public boolean verifierDansAnnuaire(int id, String mdp)
        throws annuaire.AnnuairePackage.collabNExistepas
    {
        return _tie.verifierDansAnnuaire( id,  mdp);
    }

}
