

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class shoppingTripTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class shoppingTripTest
{
    private shoppingTrip shopping1;

    /**
     * Default constructor for test class shoppingTripTest
     */
    public shoppingTripTest()
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
        shopping1 = new shoppingTrip();
        shopping1.addFood("milk");
        shopping1.addFood("eggs");
        shopping1.addFood("bread");
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
