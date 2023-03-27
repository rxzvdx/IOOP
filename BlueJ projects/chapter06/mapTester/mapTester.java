import java.util.HashMap;

/**
 * Write a description of class mapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> contacts; 

    /**
     * Constructor for objects of class mapTester
     */
    public mapTester()
    {
        contacts = new HashMap<>();
    }
    
    public void enterNumber(String name, String number) 
    {
        contacts.put(name, number); 
    }
    
    public String lookupNumber(String name) 
    {   String number = contacts.get(name);
        String errorMsg = "Error";
        if(number != null)
        {
            return number;
        }
        else
        {
            return errorMsg;
        }
    }
    
    public void listContacts() 
    {
        System.out.println(contacts);
    }
}
