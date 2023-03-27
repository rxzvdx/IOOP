/**
 * Month gives users a choice between 1-12 to choose a month 
 * and returns the appropiate month by name.
 * @author  Antonio Rosado
 * @version 2/15/22
 */
public class Month // Class
{
    private int monthNumber; // The numeric value of the month
    private String monthName; // The name of the month
    
    /**
     * Create a month based on a numeric value, then match the number to the month by name.
     * @param int input       Numeric value input for month
     */
    public Month(int input) // Constructor
    {
        if (input == 0 || input > 12)
        {
            System.out.println("ERROR: Month " +input+ " must be between 1 and 12");
        }
        else if (input < 0) {
            System.out.println("ERROR: Month " +input+ " must be positive");
        }
        else {
            System.out.println("Month " +input+ " is VALID");
        }
        monthNumber = input;
        setMonthName();
        printMonth();
    }
    
    /** Return the value of month by number.
    * 
    * @return       Month numeric value
    **/ 
    public int getMonthNumber() // Accessor method
    {
        return monthNumber;
    }
    
    /** Return the name of month.
    * 
    * @return       Month name
    **/ 
    public String getMonthName() // Accessor method
    {
        return monthName;
    }
    
    /** All of the cases the month can be based on numeric values.
    * Months 1-12 respectively 
    **/ 
    public void setMonthName() // Mutator method
    { 
        switch (monthNumber) {
        case 1: monthName = "January";
                            break;
        case 2: monthName = "February";
                            break;
        case 3: monthName = "March";
                            break;
        case 4: monthName = "April";
                            break;
        case 5: monthName = "May";
                            break;
        case 6: monthName = "June";
                            break;
        case 7: monthName = "July";
                            break;
        case 8: monthName = "August";
                            break;
        case 9: monthName = "September";
                            break;
        case 10: monthName = "October";
                            break;
        case 11: monthName = "November";
                            break;
        case 12: monthName = "December";
                            break;
        default: monthName = "Invalid Month";
                            break;
        }
    }
    
    /** Prints which month numeric value corresponds with a month by name.
    *
    **/ 
    public void printMonth() // Mutator method
    {
        System.out.println("Month " + monthNumber+ " is " +monthName+".");
    }
}
