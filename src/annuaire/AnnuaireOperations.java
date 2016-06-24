package annuaire;

/**
 * Interface definition : Annuaire
 * 
 * @author OpenORB Compiler
 */
public interface AnnuaireOperations
{
    /**
     * Operation ajouterDansAnnuaire
     */
    public int ajouterDansAnnuaire(annuaire.Collaborateur c)
        throws annuaire.AnnuairePackage.collabExisteDeja;

    /**
     * Operation modifierDansAnnuaire
     */
    public boolean modifierDansAnnuaire(int id, String nom, String prenom, String mdp, String photo)
        throws annuaire.AnnuairePackage.collabNExistepas;

    /**
     * Operation associationDansAnnuaire
     */
    public String associationDansAnnuaire(int id, String photo)
        throws annuaire.AnnuairePackage.collabNExistepas;

    /**
     * Operation supprimerDansAnnuaire
     */
    public boolean supprimerDansAnnuaire(int id, String photo, String typeDuCollb)
        throws annuaire.AnnuairePackage.collabNExistepas;

    /**
     * Operation verifierDansAnnuaire
     */
    public boolean verifierDansAnnuaire(int id, String mdp)
        throws annuaire.AnnuairePackage.collabNExistepas;

    /**
     * Operation existerDansLeSystem
     */
    public boolean existerDansLeSystem(int id, String typeDuCollb)
        throws annuaire.AnnuairePackage.collabNExistepas;

}
