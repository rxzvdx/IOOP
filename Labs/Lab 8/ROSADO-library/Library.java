import java.util.ArrayList;                                                                                                                                 import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Library class creates a library based on books and genres from book and genre classes. 
 *
 * @author Antonio Rosado
 * @version 3/27/2022
 */
public class Library
{
    private Book bookOfTheWeek; // book of the week 
    private ArrayList<Genre> genres; // genre collectiom
    private Logger logger = Logger.getLogger(Library.class.getName()); // logger
    
    /**
     * Creates a library with a collection of genres based on books. 
     */
    public Library() // Constructor
    { 
        bookOfTheWeek = null;
        genres = new ArrayList<>();
        logger.log(Level.WARNING, "Name is INVALID");
    }

    /**
     * Return name of genre
     *
     * @return    genreName string
     */
    public int getNumberOfTotalBooks() // Accessor method
    {   int index = 0;
        for(Genre genre: genres) 
        {
            index += genre.getNumberOfGenreBooks();
        }
        return index;
    }
    
    /**
     * Adds a new genre to the library
     *
     * @param   Genre genre
     */ 
    public void addGenre(Genre genre) // Mutator method
    {   if (genre != null)
        {
            genres.add(genre);
        }
        else
        {
            System.out.println("Error! Unable to add genre that does not exist");
        }
    }
    
     /**
     * Adds a new genre to the library 
     *
     * @param   genreName
     */
    public void addGenre(String genreName) // Mutator method
    {   
        if (genreName != null) 
        {
            genres.add(new Genre(genreName));
        }
        else
        {
            System.out.println("Error! Unable to add genre that has no name");
        }
    }
    
    /**
     * Removes a genre from the library 
     *
     * @param   genreName
     */
    public void removeGenre(String genreName) // Mutator method
    {   
        Iterator<Genre> it = genres.iterator();
        boolean found = false;
        while(it.hasNext())
        {   Genre genre = (Genre) it.next();
            if(genre.getGenreName().equalsIgnoreCase(genreName))
            {
                System.out.println("REMOVED: " + genre.getGenreName());
                it.remove();
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("NO genre found with name: " + genreName);
        }
    }
    
    /**
     * Lists all genres in the library 
     *
     */
    public void listAllGenres() // Accessor method
    {   
        if(genres.isEmpty())
        {
            System.out.println("NO Genres to list");
        }
        else
        {
            System.out.println("THE GENRE NAMES: ");
            for(Genre genre: genres) 
            {
                System.out.println("\t" + genre.getGenreName());
            }   
        }
    }
    
    /**
     * Lists all books in the library 
     *
     */
    public void listAllLibraryBooks() // Accessor method
    {   
        if(getNumberOfTotalBooks() == 0)
        {
            System.out.println("NO books in library to list");
        }
        else
        {
            Iterator<Genre> it = genres.iterator();
            while(it.hasNext())
            {
                it.next().listAllGenreBooks();
            }
        }   
    }
    
    /**
     * Prints the book of the week 
     *
     */
    public void printBookOfTheWeek() // Accessor method
    {
        if(bookOfTheWeek == null)
        {
            System.out.println("NO book of the week");
        }
        else
        {
            System.out.println("The book of the week is: " + bookOfTheWeek.getBookDetails());
        }
    }   
    
    /**
     * Picks the book of the week randomly
     *
     */
    public void pickBookOfTheWeek() // Accessor method
    {
        if (getNumberOfTotalBooks() == 0)
        {
            System.out.println("There are no books in the library");
        }
        else
        {   Random random = new Random();
            Genre randomGenre = genres.get(random.nextInt(genres.size()));
            while(randomGenre.getNumberOfGenreBooks() == 0)
            {
                randomGenre = genres.get(random.nextInt(genres.size()));
            }
            bookOfTheWeek = randomGenre.getGenreBooks().get(random.nextInt(randomGenre.getNumberOfGenreBooks()));
        }
    }
}
