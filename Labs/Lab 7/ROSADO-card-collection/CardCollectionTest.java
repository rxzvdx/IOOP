

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CardCollectionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardCollectionTest
{
    private Card tom;
    private Card tom2;
    private Card shink;
    private Card sons;
    private Card sons2;
    private CardCollection cardColl1;

    /**
     * Default constructor for test class CardCollectionTest
     */
    public CardCollectionTest()
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
        tom = new Card("tom bone", 2002);
        tom2 = new Card("tom bone", 2022);
        shink = new Card("shink algae", 2004);
        sons = new Card("sone malone", 1966);
        sons2 = new Card("sone malone", 2022);
        cardColl1 = new CardCollection("Tony Rosado");
        cardColl1.addCard(tom);
        cardColl1.addCard(tom2);
        cardColl1.addCard(shink);
        cardColl1.addCard(sons);
        cardColl1.addCard(sons2);
        cardColl1.findFirstOfPlayer("SONE MALONE");
        cardColl1.findFirstOfPlayer("sone malone");
        cardColl1.getCards();
        cardColl1.getCollectorName();
        cardColl1.getNumberOfCards();
        cardColl1.listAllCards();
        cardColl1.listByPlayer("tom bone");
        cardColl1.listByPlayer("TOM BONE");
        cardColl1.listByYear(2022);
        cardColl1.listCard(-1);
        cardColl1.listCard(0);
        cardColl1.listCard(6);
        cardColl1.removeCard(0);
        cardColl1.listAllCards();
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
