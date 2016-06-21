package entreeSortie;

/**
 * Interface definition : EntreeSortie
 * 
 * @author OpenORB Compiler
 */
public abstract class EntreeSortiePOA extends org.omg.PortableServer.Servant
        implements EntreeSortieOperations, org.omg.CORBA.portable.InvokeHandler
{
    public EntreeSortie _this()
    {
        return EntreeSortieHelper.narrow(_this_object());
    }

    public EntreeSortie _this(org.omg.CORBA.ORB orb)
    {
        return EntreeSortieHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:entreeSortie/EntreeSortie:1.0"
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
