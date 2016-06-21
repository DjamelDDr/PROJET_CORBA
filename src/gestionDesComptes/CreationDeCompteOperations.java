package gestionDesComptes;

/**
 * Interface definition : CreationDeCompte
 * 
 * @author OpenORB Compiler
 */
public interface CreationDeCompteOperations
{
    /**
     * Operation ajouterCollab
     */
    public int ajouterCollab(gestionDesComptes.Collaborateur c)
        throws gestionDesComptes.CreationDeComptePackage.collabExisteDeja;

    /**
     * Operation modifierCollab
     */
    public boolean modifierCollab(gestionDesComptes.Collaborateur c)
        throws gestionDesComptes.CreationDeComptePackage.collabInconnu;

    /**
     * Operation supprimerCollab
     */
    public boolean supprimerCollab(int id, String typeDuCollb)
        throws gestionDesComptes.CreationDeComptePackage.collabInconnu;

}
