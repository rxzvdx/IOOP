import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Overall "corporation" that owns the theaters that plays movies on screen
 *
 * @author Antonio Rosado
 * @version 4/18/2022
 */
public class TheaterCorp
{
    private String corpName;
    private ArrayList<Theater> theaters;
    private HashSet<Movie> movies;
    
    /**
     * Constructor for objects of class TheaterCorp
     */
    public TheaterCorp(String corpName) // Constructor
    {
        this.corpName = corpName;
        theaters = new ArrayList<>();
        movies = new HashSet<>();
    }

    /**
     * Return corpName String
     *
     * @return    corpName String
     */
    public String getCorpName() // Accessor Method
    {
        return corpName;
    }
    
    /**
     * Return theaters ArrayList
     *
     * @return    theaters ArrayList
     */
    public ArrayList<Theater> getTheaters() // Accessor Method
    {
        return theaters;
    }
    
    /**
     * Return movies HashSet
     *
     * @return    movies HashSet
     */
    public HashSet<Movie> getMovies() // Accessor Method
    {
        return movies;
    }
    
    /**
     * Add theater to theaters ArrayList
     *
     * @param Theater theater       input for Theater object
     */
    
    public void addTheater(Theater theater) // Mutator Method
    {
        if (theater != null ) 
        {
            theaters.add(theater);
            System.out.println("Theater: " + theater.getLocation() + " has been added");
        }
        else 
        {
            System.out.println( "INVALID Theater");
        }
    }
    
    /**
     * Add movie to movies HashSet
     *
     * @param Movie movie       input for Movie object
     */
    public void addMovie(Movie movie) // Mutator Method
    {
        if (movie != null ) 
        {
            movies.add(movie);
            System.out.println("Movie: " + movie.getTitle() + " has been added");
        }
        else 
        {   
            System.out.println( "INVALID Movie");
        }
    }
    
    /**
     * Add movie to movies HashSet
     *
     * @param String title       input for Movie title
     * @param Rating rating      input for Rating object 
     */
    public void addMovie(String title, Rating rating) // Mutator Method
    {
        if (title != null && rating != null ) 
        {
            movies.add(new Movie(title, rating));
            System.out.println("Movie: " + title + " has been added");
        }
        else 
        {
            System.out.println("INVALID Movie");
        }
    }
    
    /**
     * Remove theater from theaters HashMap    
     * @param String location    input for location field
     */
    public boolean sellTheater(String location) // Mutator Method
    {
        boolean sold = false;
        if (theaters.isEmpty())
        {
            System.out.println("NO THEATERS TO SELL");
        }
        else
        {
            for(Iterator<Theater> it = theaters.iterator(); it.hasNext() && !sold;)
            {
                if(it.next().getLocation().equalsIgnoreCase(location))
                {
                    it.remove();
                    sold = true;
                }
            }
            
            if(sold)
            {
                System.out.println("SELLING THEATER - " + location);
            }
            else
            {
                System.out.println("NO THEATER LOCAITON" + location);
            }
        }
        return sold; 
    }
    
    /**
     * List all movies in Movies HashSet
     *
     */
    public void listAllMovies() // Accessor method
    {      
        if(movies.isEmpty())
        {
            System.out.println("NO MOVIES EXIST");
        }
        else
        {
            for(Movie movie : movies)
            {
                System.out.println(movie.getTitle() + " " + movie.getRatingString());
            }
        }
    }
    
    /**
     * List all movies now playing in all theaters
     *
     */
    public void listAllTheaterMovies() // Accessor method
    {      
        if(theaters.isEmpty())
        {
            System.out.println("NO THEATERS EXIST");
        }
        else
        {
            System.out.println("NOW PLAYING!!");
        }
        
        for(Theater theater : theaters)
        {
            System.out.println("LOCATION - " + theater.getLocation());
            if(!theater.getScreens().isEmpty())
            {
                for (Integer key : theater.getScreens().keySet())
                {
                    System.out.println("\t" + "SCREEN " + key + " - " + theater.getScreens().get(key).getTitle() + " " + "(" 
                    + theater.getScreens().get(key).getRatingString() + ")");
                }
            }
            else
            {
                System.out.println("NO SCREENS EXIST");
            }
        }
    }
}
