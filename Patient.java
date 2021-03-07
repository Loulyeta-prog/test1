
/**
 * @author Loulyeta Al Arnaout
 * @version jan2013
 */
public class Patient
{
    // Bezugsobjekte

    // Attribute
    private String zName, zKasse;
    
    // Konstruktor
    public Patient(String pName, String pKasse)
    {
        zName = pName;
        zKasse = pKasse;
    }

    // Dienste
    public String name()
    {
        return zName;
    }
    
    public String kasse()
    {
        return zKasse;
    }
    
    public String toString()
    {
        return name() + ", " + kasse();
    }
}
