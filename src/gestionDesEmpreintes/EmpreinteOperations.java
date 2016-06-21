package gestionDesEmpreintes;

/**
 * Interface definition : Empreinte
 * 
 * @author OpenORB Compiler
 */
public interface EmpreinteOperations
{
    /**
     * Operation supprimerEmpreinte
     */
    public boolean supprimerEmpreinte(int id, String typeDuCollb)
        throws gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas;

    /**
     * Operation verifierEmpreinte
     */
    public boolean verifierEmpreinte(int id, String lempreinte)
        throws gestionDesEmpreintes.EmpreintePackage.empreinteNExistepas;

}
