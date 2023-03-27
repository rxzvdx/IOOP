

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTest
{
    private Book IT;
    private Book RoseMadder;
    private Book BrianGreene;
    private Book GreenMile;
    private Genre Horror;
    private Genre SciFI;
    private Library library1;

    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
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
        IT = new Book("Stephen King", "IT", "H THR");
        RoseMadder = new Book("Stephen King", "Rose Madder", "L DRAM");
        BrianGreene = new Book("Brian Greene", "Until The End of Time", "S FICT");
        IT.getCallNumber();
        GreenMile = new Book("Stephen King", "The Green Mile", "H THR");
        IT.getAuthor();
        RoseMadder.getAuthor();
        BrianGreene.getAuthor();
        IT.getBookDetails();
        BrianGreene.getBookDetails();
        RoseMadder.getCallNumber();
        RoseMadder.getTitle();
        
        Horror = new Genre("Horror");
        Horror.addNewGenreBook(GreenMile);
        Horror.addNewGenreBook(IT);
        Horror.addNewGenreBook(RoseMadder);
        SciFI = new Genre("Science Fiction");
        SciFI.addNewGenreBook(BrianGreene);
        library1 = new Library();
        library1.addGenre(SciFI);
        library1.addGenre(Horror);
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
