
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID) //EX 2.77
    {   
        name = fullName;
        id = studentID;
        credits = 0;
        
        
        if(fullName.length() < 4) 
        {
            System.out.println("Error occured: Name should be at least 4 characters long");
        }
        
        if(studentID.length() < 3)
        {
            System.out.println("Error occured: studentID should be at least 3 characters long");
        }
    }
    /* EX 2.74
     * student1 : Student
     * name: Benjamin Jonson
     * id: 738321
     * credits: 0 
     */

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {//EX 2.78
        String namePart = name;
        String idPart = id;
        if(name.length() > 4)
        {
            namePart = name.substring(0,4);
        }
        if(id.length() > 3) 
        {
            idPart = id.substring(0,3);
        }
        return namePart + idPart;
    }
    // EX 2.75 Henr557
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}
