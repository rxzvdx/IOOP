
/**
 * Book class creates a book based on title, author, and/or callNumber to be added to a library.
 *
 * @author Antonio Rosado
 * @version 3/27/2022
 */
public class Book
{
    private String author; // author name
    private String title; // book title
    private String callNumber; // callNumber for book
    
    /**
     * Creates a book based on author, title, and callNumber input from user as details.
     * @param String author        input for author field
     * @param String title         input for title field
     * @param String callNumber    input for callNumber
     */
    public Book(String author, String title, String callNumber) // Overloaded Constructor
    {
        setBookDetails(author,title, callNumber);
    }

    /**
     * Creates a book based on author, and title input from user as details.
     * @param String author        input for author field
     * @param String title         input for title field
     */
    public Book(String author, String title) // Constructor
    {
        setBookDetails(author,title, "");
    }

    /**
     * Return name of author
     *
     * @return    author string
     */
    public String getAuthor() // Accessor method
    {
        return author;
    }
    
    /**
     * Return title of book
     *
     * @return    title string
     */
    public String getTitle() // Accessor method
    {
        return title;
    }
    
    /**
     * Return callNumber of book object
     *
     * @return    callNumber string
     */
    public String getCallNumber() // Accessor method
    {
        return callNumber; 
    }
    
    /**
     * Return details of book
     *
     * @return    title + " : " + author + " ( " + callNumber + " ) ";
     */
    public String getBookDetails() // Accessor method
    {
        return title + " : " + author + " ( " + callNumber + " ) ";
    }
    
    /**
     * Sets details of the book
     *
     * @param String author        input for author field
     * @param String title         input for title field
     * @param String callNumber    input for callNumber
     */
    private void setBookDetails(String author, String title, String callNumber) // Mutator method
    {
        this.author = author;
        this.title = title;
        this.callNumber = callNumber;
    }
}
