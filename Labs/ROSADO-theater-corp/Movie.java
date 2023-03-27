
/**
 * Movie class creates movie object with rating and title
 *
 * @author Antonio Rosado
 * @version 4/19/2022
 */
public class Movie
{
    private String title;
    private Rating rating;
    
    /**
     * Initializes Movie object 
     * @param String title       input for name field
     * @param Rating rating      input Rating object
    **/
    public Movie(String title, Rating rating) // Constructor
    {
        this.title = title;
        this.rating = rating; 
    }
    
    /**
     * Return title of movie
     *
     * @return    title String
     */
    
    public String getTitle() // Accessor Method
    {
        return title;
    }
    
    /**
     * Return rating of movie
     *
     * @return    rating String
     */
    public String getRatingString() // Accessor Method
    {
        return rating.toString();
    }
}
