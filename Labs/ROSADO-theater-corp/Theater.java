import java.util.HashMap;

/**
 * The theater class creates a theater object with a location and screen assignment.
 *
 * @author Antonio Rosado
 * @version 4/19/2022
 */
public class Theater
{
    private String location;
    private HashMap<Integer, Movie> screens;

    /**
     * Initializes theater object
     * @param String location       input for location field
     */
    public Theater(String location) // Constructor
    {
        this.location = location;
        this.screens = new HashMap<>();
    }

    /**
     * Return title of movie
     *
     * @return    title String
     */
    
    public HashMap<Integer, Movie> getScreens() // Accessor Method
    {
        return screens;
    }
    
    /**
     * Return location of movie
     *
     * @return    location String
     */
    
    public String getLocation() // Accessor Method
    {
        return location;
    }
    
    /**
     * Add screen integer and movie object to HashMap
     *
     * @param Integer screen       input for screen integer
     * @param Movie movie          input for Movie object
     */
    
    public void addScreen(Integer screen, Movie movie) // Mutator Method
    {
        if (screen != null && movie != null) 
        {
            screens.put(screen, movie);
            System.out.println(" ADDED " + movie.getTitle()+ " on screen "+ screen);
        }
        else 
        {
            System.out.println( "INVALID screen/movie");
        }
    }
}
