
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    /**
     * Constructor for objects of class Driver
     */
    public static void main(String[] args)
    {
         company myCompany = new company(args[0]);
         
         myCompany.addEmployee(args[1]);
         myCompany.addEmployee(args[2]);
         myCompany.listEmployees();
    }
}
