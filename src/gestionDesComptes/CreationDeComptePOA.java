package gestionDesComptes;

/**
 * Interface definition : CreationDeCompte
 * 
 * @author OpenORB Compiler
 */
public abstract class CreationDeComptePOA extends org.omg.PortableServer.Servant
        implements CreationDeCompteOperations, org.omg.CORBA.portable.InvokeHandler
{
    public CreationDeCompte _this()
    {
        return CreationDeCompteHelper.narrow(_this_object());
    }

    public CreationDeCompte _this(org.omg.CORBA.ORB orb)
    {
        return CreationDeCompteHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:gestionDesComptes/CreationDeCompte:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
}
