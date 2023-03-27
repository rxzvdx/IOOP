
/**
 * Creates a person with set first/middle name(s), age and whether said person is a parent or not. 
 *
 * @author (Antonio Rosado)
 * @version (2/22/22)
 */
public class Family
{
    private String surname; // surname
    private Person husband; // husband object
    private Person wife; // wife object
    private Person child; // child object

    /**
     * 
     * Creates a person with a first name and middle name, as well as their age and tells whether 
     * they are a parent or not. 
     * @param String firstName      First name of person object
     * @param String middleName     Middle name of person object
     * @param boolean isParent      True or false statement if person object is a parent or not
     * @param int age               Age of person object
     */
    public Family (String surname, Person husband, Person wife) // Constructor
    {
        surname.trim().toUpperCase();
        this.surname = surname;
        this.husband = husband;
        this.wife = wife;
        this.child = null;
    }
    
    /**
     * Return surname of person object
     *
     * @return    surname string 
     */
    public String getSurname () // Accessor method
    {
        return surname;
    }
    
    /**
     * Return husband person object
     *
     * @return    husband string 
     */
    public Person getHusband () // Accessor method
    {
        return husband;
    }
    
    /**
     * Return wife person object
     *
     * @return    wife string
     */
    public Person getWife () // Accessor method
    {
        return wife;
    }
    
    /**
     * Return child person object
     *
     * @return    child string
     */
    public Person getChild () // Accessor method
    {
        return child;
    }
    
    /**
     * 
     * Prints child's first and middle name
     * @param Person child      Person child object
     */
    public void haveChild (Person child) // Mutator method
    {   
        this.child = child;
        System.out.println (child.getFirstName() + " " + child.getMiddleName() + " is adopted");
    }
    
    /**
     * 
     * Creates a new Person baby object with a first/middle name and assigns child to baby
     * @param String firstName
     * @param String middleName
     */
    public void haveChild (String firstName, String middleName, boolean isParent) // Mutator method
    {
        Person baby = new Person (firstName, middleName, isParent);
        System.out.println (baby.getFirstName() + " " + baby.getMiddleName() + " is born");
        child = baby;
    }
    
    /**
     * 
     * Gives the family a "birthday" and increases the age of all family members by one
     */
    public void haveFamilyBirthday() // Mutator method
    {
        husband.incrementAge();
        wife.incrementAge();
        System.out.println("Husband is now " + husband.getAge() + " years old");
        System.out.println("Wife is now " + wife.getAge() + " years old");
        
        if (child != null) 
        {
            child.incrementAge();
            System.out.println ("Child is now " + child.getAge() + " years old");
        }
    }
    
    /**
     * 
     * Prints surname, first name, and middle name of child as well as age
     */
    public void printChild() // Mutator method
    {
        if (child != null) 
        {
            System.out.println ("The " + surname + " family " + child.getParentString() + " is: " + child.getFirstName() + " , " + child.getMiddleName() + " , " + child.getAge());
        }
        else
        {
            System.out.println("There is no child in the " + surname + " family");
        }
    }
    
    /**
     * 
     * Prints initials of all family members that exist
     */
    public void FamilyInitials() // Mutator method
    {
        System.out.println ("The " + surname + " Family:");
        System.out.println (husband.getInitialsString() + husband.getAge());
	System.out.println (wife.getInitialsString() + wife.getAge());
	
	if (child != null) 
	{
	    System.out.println (child.getInitialsString() + child.getAge());
	}
    }
}
