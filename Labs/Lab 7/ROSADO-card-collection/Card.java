
/**
 * Write a description of class Card here.
 *
 * @author Antonio Rosado
 * @version 3/18/2022
 */
public class Card
{
    private String player; // player name
    private int year; // player year
    
    /**
     * Creates a baseball card based on player and year input from user as details.
     * @param String player    input for player field
     * @param int year         input for year field
     */
    public Card(String player, int year) // Constructor
    {
        setDetails(player, year);
    }

    /**
     * Return name of player
     *
     * @return    player string
     */
    public String getPlayer() // Accessor method
    {
        return player;
    }
    
    /**
     * Return year of player
     *
     * @return    year int
     */
    public int getYear() // Accessor method
    {
        return year;
    }
    
    /**
     * Return details of card
     *
     * @return    details string
     */
    public String getDetails() // Accessor method
    {
        return player + "(" + year + ")"; 
    }
    
    /**
     * Sets details of the player
     *
     * @param String player    input for player field
     * @param int year         input for year field 
     */
    private void setDetails(String player, int year) // Mutator method
    {
        this.player = player;
        this.year = year;
    }
}
