import java.util.ArrayList;
/**
 * Creates a shopping list that allows user to add, remove, edit, and retrieve items in list
 *
 * @author (Antonio Rosado)
 * @version (03/08/2020)
 */
public class shoppingTrip
{
    private ArrayList<String> foods; // ArrayList for foods

    /**
     * Creates a new empty list to hold values of shopping list items
     */
    public shoppingTrip() // Constructor
    {
        foods = new ArrayList<>(); //default cap of ten
    }

    /**
     * Return food(s) in shopping list
     */
    public ArrayList<String> getFoods() // Accessor method
    {
        return foods;
    }

    /**
     * Returns number of food(s) in list
     */
    public int getNumberOfFoods () // Accessor Method
    {
        return foods.size();
    }
    
    /**
     * Allows user to add food(s) to shopping list and prints newly added food
     * @param String foodName       name of food added
     */
    public boolean addFood(String foodName) // Mutator method
    {   
        if (foodName != null) 
        {   
            System.out.println("ADDED " + foodName.toLowerCase());
            return foods.add(foodName.toLowerCase());
        }
        else 
        {
            System.out.println("Error: Can NOT add invalid food");
            return false;
        }
    } 
    
    /**
     * Allows user to add food(s) to shopping list by name at specified index 
     * @param int index             index of food in list
     * @param String foodName       name of food added
     */
    public void addFood(int index, String foodName) // Mutator method
    {
        if (index >= 0 && index <= foods.size() && foodName != null) 
        {   
            System.out.println("Added " + foodName.toLowerCase() + " at index " + index);
        }
        else 
        {
            System.out.println("Error; Can NOT add with invalid index/food");
        }
    }
    
    /**
     * Allows user to add food(s) to shopping list by name at first position in list
     * @param String foodName       name of food added
     */
    public void addFoodFirst(String foodName) // Mutator method
    {
        if (foodName != null) 
        {   foods.add(0, foodName.toLowerCase());
            System.out.println("ADDED " + foodName.toLowerCase() + " as first item");
        }
        else 
        {
            System.out.println("Error: Can NOT add invalid food");
        }
    }
    
    /**
     * Allows user to remove food(s) from shopping list by specified index
     * @param int index       index of food in list
     */
    public void removeFood(int index) // Mutator method
    {
        if (index >= 0 && index <= foods.size()) 
        {   
            System.out.println("REMOVED " + foods.remove(index) + " from index " + index);
            
        }
        else 
        {
            System.out.println("Error; NO food found at index " + index);
        }
    }
    
    /**
     * Allows user to remove food(s) from shopping list by specified name
     * @param String foodName       name of food added
     */
    public boolean removeFood(String foodName) // Mutator method
    {
         if (foodName != null) 
        {   
            System.out.println("REMOVED " + foodName.toLowerCase() + " " + foods.remove(foodName));
            return foods.remove(foodName);
        }
        else 
        {
            System.out.println("ERROR: Can NOT remove invalid food");
            return false; 
        }
    }
    
    /**
     * Prints food item by name based on specified index
     * @param int index       index of food in list
     */
    public void listFood(int index) 
    {
        if (index >= 0 && index <= foods.size()) 
        {   
            System.out.println(foods.get(index) + " at index " + index);
            
        }
        else 
        {
            System.out.println("NO food found at index " + index);
        }
    }
    
    /**
     * Prints food item(s) by name in list
     */
    public void listAllFoods() 
    {
        if (foods.isEmpty())
        {
            System.out.println("NO food items to list");
        }
        else 
        {
            System.out.println("Food items: ");
            for(String string : foods) 
            {
                System.out.println(string);
            }
        }
    }
    
    /**
     * Allows user to search for food item(s) then prints item if it exists
     * @param String searchFood       food item user is searching for
     */
    public void listFoodMatching(String searchFood) 
    {
        boolean noMatch = true;  
        System.out.println("Food items containing " + searchFood.toLowerCase());
        for(String string : foods) 
        { 
            if(string.toLowerCase().contains(searchFood.toLowerCase())) 
            {
                System.out.println();
                noMatch = false; 
            }
        }
        
        if (noMatch) 
        {
            System.out.println("NO food contains " + searchFood);
        }
    }
}
