

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class mapTesterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class mapTesterTest
{
    private mapTester mapTeste1;

    /**
     * Default constructor for test class mapTesterTest
     */
    public mapTesterTest()
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
        mapTeste1 = new mapTester();
        mapTeste1.enterNumber("tom", "6095157222");
        mapTeste1.enterNumber("tom", "6099579782");
        mapTeste1.lookupNumber("tom");
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
