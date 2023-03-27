

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class companyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class companyTest
{
    private company company1;

    /**
     * Default constructor for test class companyTest
     */
    public companyTest()
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
        company1 = new company("The Home Depot");
        company1.addEmployee("Tony Rosado");
        company1.addEmployee("Maria");
        company1.addEmployee("Lailaa");
        company1.addEmployee("Shaman");
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
