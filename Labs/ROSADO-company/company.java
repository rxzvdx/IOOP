import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Logger; 
import java.util.logging.Level;

/**
 * Company class creates a company with employees, their respective IDs, and 
 * allows manipulation for the above elements. 
 *
 * @author Antonio Rosado
 * @version 4/12/22
 */
public class company
{
    private static final int MIN = 100; // Minimum field
    private static final int MAX = 999; // Maximum field
    private Random randomGenerator = new Random(); // Random # generator field
    private String name; // name of company field
    private HashMap<String, String> employees = new HashMap<String, String>(); // HashMap<String, String> of employees field 
    private Logger logger = Logger.getLogger(company.class.getName()); // Logger field (debugging)

    /**
     * Initializes company name
     * @param String name       input for name field
    **/
    public company(String name) // Constructor
    {
        this.name = formatString(name);
    }
    
    /**
     * Return name of company
     *
     * @return    name String
     */
    public String getName() // Accessor method
    {
        return name; 
    }
    
    /**
     * Return employees of company
     *
     * @return    HashMap<String, String> employees
     */
    public HashMap<String, String> getEmployees() // Accessor method
    {
        return employees; 
    }
    
    /**
     * Return number of employees
     *
     * @return    employees.size()
     */
    public int getTotalNumberOfEmployees() // Accessor method
    {
        return employees.size(); 
    }
    
    /**
     * Return origString with leading and trailing spaces removed and all caps
     *
     * @return   origString != null ? origString.trim().toUpperCase().replaceAll("\\s+", " ") : " ";
     */
    private String formatString(String origString) // Accessor method
    {
       return origString != null ? origString.trim().replaceAll("\\s+", " ").toUpperCase() : " ";
    }
    
    /**
     * Return ID for given employee name
     *
     * @return   employeeName + (randomGenerator.nextInt(MAX - MIN) + MIN);
     */
    private String generateId(String name) // Accessor method
    {  
        String employeeName = "";
        String[] nameArray = formatString(name).split("\\s+");
        for(int index = 0; index < nameArray.length; index++)
        {
            employeeName += nameArray[index].substring(0,1);
        }
        return employeeName + (randomGenerator.nextInt(MAX - MIN + 1) + MIN);
    }
    
    /**
     * Add given employee name to HashMap of employees
     *
     * @param String inputName      inputName String
     */
    public void addEmployee(String inputName) // Mutator method
    {      
        formatString(inputName.trim());
        if(inputName == null || inputName.isEmpty())
        {
            logger.log(Level.WARNING, ("Name is INVALID"));
        }
        else if(employees.containsKey(inputName)) // ask about this
        {
            logger.log(Level.WARNING, ("Existing: " + inputName));
        }
        else
        {
            String id = generateId(inputName);
            employees.put(inputName, id);
            logger.log(Level.INFO, ("Added: " + inputName + " " + id));
        }
    }
    
    /**
     * Remove given employee name from HashMap of employees
     *
     * @param String inputName      inputName String
     */
    public void removeEmployee(String inputName) // Mutator method
    {      
        formatString(inputName.trim());
        if(inputName == null || inputName.isEmpty())
        {
            logger.log(Level.WARNING, ("Name is INVALID"));
        }
        else if(!employees.containsKey(inputName))
        {
            logger.log(Level.WARNING, ("Non-existing: " + inputName));
        }
        else
        {
            logger.log(Level.INFO, ("Removed: " + inputName + " " + employees.remove(inputName)));
        }
    }
    
    /**
     * Remove given id from HashMap of employees
     *
     * @param String inputName      inputName String
     */
    public void removeIds(String id) // Mutator method
    {      
        boolean found = false;
        formatString(id);
        if(id != null || !id.isEmpty())
        {
            for(Iterator<String> it = employees.keySet().iterator(); it.hasNext(); )
            {
                String key = it.next();
                if(employees.get(key).equalsIgnoreCase(id))
                {
                    it.remove();
                    found = true;
                    logger.log(Level.INFO, ("Removed: " + id));
                }
            }
            
            if(!found)
            {
                logger.log(Level.WARNING, ("NO employees with ID: " + id));
            }
        }
    }
    
    /**
     * List all employees of company
     *
     */
    public void listEmployees() // Accessor method
    {      
        if(employees.isEmpty())
        {
            logger.log(Level.WARNING, ("NO employees"));
        }
        else
        {
            logger.log(Level.INFO, ("Employees for " + name + ":"));
            for(String key : employees.keySet())
            {
                logger.log(Level.INFO, ("Key is: " + key + " value is: " + employees.get(key)));
            }
        }
    }
}
