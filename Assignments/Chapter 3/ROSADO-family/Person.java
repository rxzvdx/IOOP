
/**
 * Creates a person with set first/middle name(s), age and whether said person is a parent or not. 
 *
 * @author (Antonio Rosado)
 * @version (2/22/22)
 */
public class Person
{
    private String firstName; // First name
    private String middleName; // Middle name
    private boolean isParent; // True or false statement stating if person is a parent or not
    private int age; // Value of age 

    /**
     * 
     * Creates a person with a first name and middle name, as well as their age and tells whether 
     * they are a parent or not. 
     * @param String firstName      First name of person object
     * @param String middleName     Middle name of person object
     * @param boolean isParent      True or false statement if person object is a parent or not
     * @param int age               Age of person object
     */
    public Person(String firstName, String middleName, boolean isParent, int age) // Constructor
    {
        this.firstName = firstName.trim().toUpperCase();
        this.middleName = middleName.trim().toUpperCase();
        this.isParent = isParent;
        this.age = age; 
    }
    
    /**
     * 
     * Creates a baby or child person object with a first name and middle name, with age set to 0 and
     * tells whether they are a parent or not. 
     * @param String firstName      First name of person object
     * @param String middleName     Middle name of person object
     * @param boolean isParent      True or false statement if person object is a parent or not
     */
    public Person(String firstName, String middleName, boolean isParent) // Overloaded constructor
    {   
        this.firstName = firstName.trim().toUpperCase();
        this.middleName = middleName.trim().toUpperCase();
        this.isParent = isParent;
        age = 0;
    }

    /**
     * Return first name of person object
     *
     * @return    First name string
     */
    public String getFirstName() // Accessor method
    {
        return firstName;
    }
    
    /**
     * Return middle name of person object
     *
     * @return    Middle name string
     */
    public String getMiddleName() // Accessor method
    {
        return middleName;
    }
    
    /**
     * Return age of person object
     *
     * @return    Age numeric value
     */
    public int getAge() // Accessor method
    {
        return age;
    }
    
    /**
     * Return string value of parent
     *
     * @return    parent value
     */
    public String getParentString() // Accessor method
    {
        return isParent ? "parent" : "child"; 
    }
    
    /**
     * Return initials of person object
     *
     * @return    Initials of first and last name
     */
    public String getInitialsString() // Accessor method
    {
        return firstName.substring(0, 1) + middleName.substring(0, 1);
    }
    
    public String toString()
    {
        return firstName + " " + middleName + " (" + getParentString() + ")";
    }
    
    /**
     * 
     * Increments value of age by 1
     * @return    age + 1
     */
    public void incrementAge() // Mutator method
    {
        age ++;
    }
    
    /**
     * 
     * Allows for the change of the firstName string, and prints certain statements depending on 
     * whether firstName string is null or empty. 
     *
     * @param     String firstName
     */
    public void changeFirstName(String firstName) // Mutator method
    {
        if (firstName != null) 
        {
            String newName = firstName.trim().toUpperCase();
            if (newName.isEmpty() != true) 
            {
                this.firstName = newName;
                System.out.println ("First name changed to: " + newName);
            }
            else {
                System.out.println ("New first name does not contain any valid characters");
            }
        }
        else {
                System.out.println ("New first name is null");
        }
    }
}
