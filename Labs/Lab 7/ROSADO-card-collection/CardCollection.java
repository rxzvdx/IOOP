import java.util.ArrayList;

/**
 * Write a description of class CardCollection here.
 *
 * @author Antonio Rosado
 * @version 3/18/2022
 */
public class CardCollection
{
    private String collectorName; // Name of collector 
    private ArrayList<Card> cards = new ArrayList<>(); // List of cards in collection

    /**
     * Creates a collection of baseball cards with owner's name
     * 
     * @param String collectorName    input for collector name
     */
    public CardCollection(String collectorName) // Constructor
    {
        this.collectorName = collectorName;
    }

    /**
     * Return name of collector
     *
     * @return    collectorName string
     */
    public String getCollectorName() // Accessor Method
    {
        return collectorName;
    }
    
    /**
     * Return cards in collection
     *
     * @return    cards ArrayList<Card>
     */
    public ArrayList<Card> getCards() // Accessor Method
    {
        return cards;
    }
    
    /**
     * Return number of cards in collection
     *
     * @return    cards.size
     */
    public int getNumberOfCards() // Accessor Method
    {
        return cards.size();
    }
    
    /**
     * Return true if card index is correct
     * @param int index     user input for index
     * @return              true
     */
    private boolean indexValid (int index) // Accessor method
    {
        if(index < 0) 
        {
            System.out.println("Index cannot be negative: " + index);
        }
        else if(index >= cards.size()) 
        {
            System.out.println("Index is too large: " + index);
        }
        return (index >= 0 && index < cards.size());
    }
    
    /**
     * Adds card to the cards collection
     * @param Card card     card object
     */
    public void addCard(Card card) // Mutator method
    {
        if(card != null) 
        {
            cards.add(card);
            System.out.println("Added card: " + card.getDetails());
        }
        else 
        {
            System.out.println("Invalid card cannot be added");
        }
    }
    
    /**
     * Removes card from the cards collection
     * @param int index     index of card
     */
    public void removeCard(int index) // Mutator method
    {
        if(indexValid(index)) 
        {
            System.out.println("Removed card: "+ (cards.remove(index)).getDetails());
        }
        else 
        {
            System.out.println("NO card to be removed at index: " + index);
        }
    }
    
    /**
     * Lists card in the cards collection
     * @param int index     index of card
     */
    public void listCard (int index) // Mutator method 
    {
        if(index >= 0 && index < cards.size()) 
        {
            System.out.println("Card " + index + ":" + cards.get(index).getDetails());
        }
        else 
        {
            System.out.println("Invalid index: " + index);
        }
    }
    
    /**
     * Lists all cards in the cards collection
     */
    public void listAllCards () // Mutator method 
    {
        if(cards.isEmpty()) 
        {
            System.out.println("There are NO cards to print");
        }
        else 
        {
            System.out.println("Card listing: ");
            for(Card card: cards) 
            {
                System.out.println(card.getDetails());
            }
        }
    }
    
    /**
     * Lists card(s) in collection by user provided string player
     * @param String player         player on card in collection
     */
    public void listByPlayer (String player) // Mutator method 
    {   boolean found = false; 
        for(Card card: cards) 
        {
            if(card.getPlayer().equalsIgnoreCase(player)) 
            {
                System.out.println(card.getDetails());
                found = true; 
            }
        }
        
        if(!found)
        {
            System.out.println("NO cards found for player: " + player);
        }
    }
    
    /**
     * Lists card(s) in collection by user provided year
     * @param int year         year on card in collection
     */
    public void listByYear (int year) // Mutator method 
    {   boolean found = false; 
        for(Card card: cards) 
        {
            if(card.getYear() == year) 
            {
                System.out.println(card.getDetails());
                found = true; 
            }
        }
        
        if(!found)
        {
            System.out.println("NO cards found for year: " + year);
        }
    }
    
    /**
     * Returns first card found in collection with player name given
     * @param String searchString         player user is searching for
     * @return                            index of card found
     */
    public int findFirstOfPlayer (String searchString) // Accessor method 
    {   int index = 0;
        boolean searching = true; 
        while (searching && index < cards.size()) 
        {
            if(cards.get(index).getPlayer().contains(searchString)) 
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
            System.out.println("NO player card for: " + searchString);
        }
        
        else 
        {
            System.out.println("Player card for " + searchString + " at index: " + index);
        }
        return index;
    }
}
