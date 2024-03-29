import java.util.ArrayList;
import java.util.Iterator;

/**
 * Genre class allows the user to assign genre(s) to a book and manipulate the genre in various ways. 
 *
 * @author Antonio Rosado
 * @version 3/27/2022
 */
public class Genre
{
    private String genreName; // Genre name
    private ArrayList<Book> books; // List of cards in collection
    
    /**
     * Creates a genre based on input from user as details and allows for the assignment of genre(s) to book(s).
     * @param String author        input for author field
     * @param String title         input for title field
     * @param String callNumber    input for callNumber
     */
    public Genre(String genreName) // Constructor
    {   
        this.genreName = genreName; 
        books = new ArrayList<>();
    }

    /**
     * Return name of genre
     *
     * @return    genreName string
     */
    public String getGenreName() // Accessor method
    {
        return genreName;
    }
    
    /**
     * Return title of book
     *
     * @return    title string
     */
    public ArrayList<Book> getGenreBooks() // Accessor method
    {
        return books; 
    }
    
    /**
     * Return number of items in books collection
     *
     * @return    books.size() int
     */
    public int getNumberOfGenreBooks() // Accessor method
    {
        return books.size(); 
    }
    
    /**
     * Return whether index is valid or not
     * @param     int index
     * @return    isValid boolean
     */
    private boolean bookIndexValid(int index) // Accessor method
    {   
        boolean valid = true;
        if(index < 0) 
        {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index > books.size()) 
        {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else
        {
            valid = true; 
        }
        return (valid);
    }
    
    /**
     * Adds book to books collection
     *
     * @param       Book book
     */
    public void addNewGenreBook(Book book) // Mutator method
    {
        books.add(book);
    }
    
    /**
     * Adds book to books collection
     *
     * @param       Book book
     */
    public void addNewGenreBook(String author, String title, String callNumber ) // Mutator method
    {   if(books != null)
        {
            Book book = new Book(author, title, callNumber);
            books.add(book);
        }
        else
        {
            System.out.println("No books to assign genre to");
        }
    }
    
    /**
     * Finds book with index corresponding to callNumber given by user
     *
     * @param       String callNumber
     */
    public int findGenreBookWithCallNumber(String callNumber) // Accessor method
    {
        int index = 0;
        int searching = -1; 
        while (index < books.size()) 
        {  
            if(searching == -1 && books.get(index).getCallNumber().equals(callNumber)) 
            {
                searching = index;
            }
            index ++;
        }
        if (searching == -1) 
        {
            System.out.println("ERROR! No book with call number: " + callNumber);
        }
        else
        {
            System.out.println(books.get(searching).getBookDetails());
        }
        return searching; 
    }
    
    /**
     * Removes book with index corresponding to callNumber given by user
     *
     * @param       String callNumber
     */
    public void removeGenreBookWithCallNumber(String callNumber)  // Mutator method
    {
        int bookIndex = findGenreBookWithCallNumber(callNumber);
        
        if (bookIndexValid(bookIndex)) 
        {
            System.out.println("Removing: " + (books.remove(bookIndex)).getBookDetails());
        }
        else
        {
            System.out.println("NO book with call number: " + callNumber);
        }
    }
    
    /**
     * Removes book with author name corresponding to name given by user
     *
     * @param       String author
     */
    public void removeAllGenreBooksByAuthor(String author) // Mutator method
    {
        Iterator<Book> it = books.iterator();
        boolean found = false;
        while(it.hasNext())
        {   
            Book book = it.next();
            if(book.getAuthor().equalsIgnoreCase(author))
            {
                System.out.println("Removing: " + book.getBookDetails());
                it.remove(); 
            }
            else
            {
                System.out.println("NO books by author: " + author);
            }
        }
        found = true;
    }
    
    /**
     * Lists all books in collection
     */
    public void listAllGenreBooks() // Accessor method
    {
        if(books.isEmpty())
        {
            System.out.println("NO books to print");
        }
        else
        {
            System.out.println(genreName + " BOOKS:");
            for(Book book: books) 
            {
                System.out.println("\t" + book.getBookDetails());
            }
        }
    }
    
     /**
     * Lists all author(s) in collection based on user input 
     * 
     * @param       String author
     */
    public void listGenreBooksByAuthor(String author) // Accessor method
    {
        System.out.println(genreName + " BOOKS BY AUTHOR " + author + ":");
        boolean found = false;
        for(Book book: books) 
        {   if (book.getAuthor().equalsIgnoreCase(author)) 
            {
                System.out.println("\t" + book.getBookDetails());
                found = true; 
            }
            else
            {
                System.out.println("NO books by author: " + author);
            }
        }
    }
}
