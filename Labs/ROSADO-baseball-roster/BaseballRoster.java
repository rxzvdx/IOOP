
/**
 * Baseball Roster class creates a baseball roster with city, name, year, positions, and players. 
 *
 * @author Antonio Rosado
 * @version 4/5/2022
 */
public class BaseballRoster
{
    private String city;
    private String name;
    private int year;
    private String[] positions = { "MGR", "P", "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF" };
    private String[] players = new String[positions.length];

    /**
     * Creates a baseball roster based on city, name, year, and manager input from user as details.
     * @param String city        input for city field
     * @param String name        input for name field
     * @param int year           input for year field
     * @param String manager     input for manager String
     */
    public BaseballRoster(String city, String name, int year, String manager) // Constructor
    {
        this.city = formatString(city);
        this.name = formatString(name);
        this.year = year;
        players[findIndex("MGR")] = formatString(manager);
        
    }

    /**
     * Return city of baseball roster
     *
     * @return    city String
     */
    public String getCity() // Accessor method
    {
        return city;
    }
    
    /**
     * Return name of baseball roster
     *
     * @return    name String
     */
    public String getName() // Accessor method
    {
        return name;
    }
    
    /**
     * Return year of baseball roster
     *
     * @return    year int
     */
    public int getYear() // Accessor method
    {
        return year;
    }
    
    /**
     * Return positions of baseball roster
     *
     * @return    positions String[]
     */
    public String[] getPositions() // Accessor method
    {
        return positions;
    }
    
    /**
     * Return players of baseball roster
     *
     * @return    players String[]
     */
    public String[] getPlayers() // Accessor method
    {
        return players;
    }
    
    /**
     * Return details of baseball roster
     *
     * @return    (year + " " + city + " " + name);
     */
    public String toString() // Accessor method
    {
        return (year + " " + city + " " + name);
    }
    
    /**
     * Return player and position string with corresponding index
     *
     * @return    (player + " " + "(" + posiitons[index] +")");
     */
    private String getPlayerString(int index) // Accessor method
    {
        String player = players[(index)] != null ? players[(index)] : "(N/A)" + " " + "(" + positions[index] +")";
        return ("\t" + player + " " + "(" + positions[index] +")");
    }
    
    /**
     * Return oldString with leading and trailing spaces removed and all caps
     *
     * @return   oldString != null ? oldString.trim().toUpperCase() : " ";
     */
    private String formatString(String oldString) // Accessor method
    {
       return oldString != null ? oldString.trim().toUpperCase() : " ";
    }
    
    /**
     * Return index matching position in roster
     *
     * @param String Position       input for position String
     * @return                      int index
     */
    public int findIndex(String position) // Accessor method
    {   
        int index = 0;
        boolean searching = true;
        while(index < positions.length && searching)
        {
            if(positions[index].equalsIgnoreCase(formatString(position))) 
            {   
                searching = false;
            }
            else
            {
                index++;
            }
        }
        
        if(searching) 
        {
            return -1;
        }
        else
        {
            return index;
        }
    }
    
    /**
     * Return true if index exists for a position in roster
     *
     * @param int index     input for index int
     * @return              boolean valid
     */
    private boolean indexValid(int index) // Accessor method 
    {   
        return index >= 0 && index < positions.length ? true : false;
    }
    
    /**
     * Find position of player given by user
     *
     * @param String player     input for player String
     * @return                  "NONE" String
     */
    private String findPlayerPosition(String player) // Accessor method 
    {
        formatString(player);
        int index = 0;
        boolean searching = true;
        while(index < positions.length && searching)
        {
            if(formatString(player).equals(players[index])) 
            {   
                searching = false;
            }
            else
            {
                index++;
            }
        }
        
        if(searching) 
        {
            return "NONE";
        }
        else
        {
            return formatString(positions[index]);
        }
    }
    
    /**
     * Assign position and player given by user
     *
     * @param String player     input for player String
     * @param String Position   input for position String
     */
    public void assignPlayerInPosition(String player, String position) // Mutator method
    {
        int index = findIndex(formatString(position));
        if(indexValid(index))
        {
            players[index] = formatString(player);
            System.out.println("ASSIGNED " + getPlayerString(index));
        }
        else
        {
            System.out.println("ERROR invalid player");
        }
    }
    
    /**
     * Removes player given by user
     *
     * @param String player     input for player String
     */
    public void takePlayerOut(String player) // Mutator method
    {
        int index = findIndex(findPlayerPosition(formatString(player)));
        if(indexValid(index))
        {
            System.out.println("TAKEN OUT " + getPlayerString(index));
            players[index] = null;
        }
        else
        {
            System.out.println("ERROR invalid player");
        }
    }
    
    /**
     * Prints roster
     */
    public void printRoster() // Accessor method
    {
        System.out.println(toString() + " ROSTER: ");
        for(int index = 0; index < positions.length; index++)
        {
            System.out.println(getPlayerString(index));
        }
    }
    
    /**
     * Prints players
     */
    public void listPlayers() // Accessor method
    {
        System.out.println(toString() + " PLAYERS: ");
        for(String player: players)
        {
            if(player != null)
            {
                System.out.println(player);
            }
        }
    }
}
