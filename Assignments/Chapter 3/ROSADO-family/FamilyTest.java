

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FamilyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FamilyTest
{
    private Person husband;
    private Person wife;

    
    

    /**
     * Default constructor for test class FamilyTest
     */
    public FamilyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        husband = new Person("Daddy", "Bear", true);
        wife = new Person("Mommy", "Bear", true);
        System.out.println(husband);;
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
