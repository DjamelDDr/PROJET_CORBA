package journalisation;

/**
 * Struct definition : Collaborateur
 * 
 * @author OpenORB Compiler
*/
public final class Collaborateur implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member idCollab
     */
    public int idCollab;

    /**
     * Struct member nom
     */
    public String nom;

    /**
     * Struct member prenom
     */
    public String prenom;

    /**
     * Struct member mdp
     */
    public String mdp;

    /**
     * Struct member photo
     */
    public String photo;

    /**
     * Struct member tcollab
     */
    public journalisation.typeCollaborateur tcollab;

    /**
     * Default constructor
     */
    public Collaborateur()
    { }

    /**
     * Constructor with fields initialization
     * @param idCollab idCollab struct member
     * @param nom nom struct member
     * @param prenom prenom struct member
     * @param mdp mdp struct member
     * @param photo photo struct member
     * @param tcollab tcollab struct member
     */
    public Collaborateur(int idCollab, String nom, String prenom, String mdp, String photo, journalisation.typeCollaborateur tcollab)
    {
        this.idCollab = idCollab;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.photo = photo;
        this.tcollab = tcollab;
    }

}
