package gestionDesComptes;

/**
 * Enum definition : typeCollaborateur
 *
 * @author OpenORB Compiler
*/
public final class typeCollaborateur implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Enum member permanent value 
     */
    public static final int _permanent = 0;

    /**
     * Enum member permanent
     */
    public static final typeCollaborateur permanent = new typeCollaborateur(_permanent);

    /**
     * Enum member ponctuel value 
     */
    public static final int _ponctuel = 1;

    /**
     * Enum member ponctuel
     */
    public static final typeCollaborateur ponctuel = new typeCollaborateur(_ponctuel);

    /**
     * Internal member value 
     */
    private final int _typeCollaborateur_value;

    /**
     * Private constructor
     * @param  the enum value for this new member
     */
    private typeCollaborateur( final int value )
    {
        _typeCollaborateur_value = value;
    }

    /**
     * Maintains singleton property for serialized enums.
     * Issue 4271: IDL/Java issue, Mapping for IDL enum.
     */
    public java.lang.Object readResolve() throws java.io.ObjectStreamException
    {
        return from_int( value() );
    }

    /**
     * Return the internal member value
     * @return the member value
     */
    public int value()
    {
        return _typeCollaborateur_value;
    }

    /**
     * Return a enum member from its value
     * @param  an enum value
     * @return an enum member
         */
    public static typeCollaborateur from_int(int value)
    {
        switch (value)
        {
        case 0 :
            return permanent;
        case 1 :
            return ponctuel;
        }
        throw new org.omg.CORBA.BAD_OPERATION();
    }

    /**
     * Return a string representation
     * @return a string representation of the enumeration
     */
    public java.lang.String toString()
    {
        switch (_typeCollaborateur_value)
        {
        case 0 :
            return "permanent";
        case 1 :
            return "ponctuel";
        }
        throw new org.omg.CORBA.BAD_OPERATION();
    }

}
