

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BaseballRosterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BaseballRosterTest
{
    private BaseballRoster baseball1;

    

    /**
     * Default constructor for test class BaseballRosterTest
     */
    public BaseballRosterTest()
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
        baseball1 = new BaseballRoster("atlantic city", "jersey demons", 2014, "Tomski Rosa");
        baseball1.assignPlayerInPosition("shink algae", "P");
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
