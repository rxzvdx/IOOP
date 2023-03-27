 /*
 * Challenge exercise 2.93 Create a new project, heater-exercise, within 
BlueJ. Edit the details in the project description—the text note you see in the 
diagram. Create a class, Heater, that contains a single field, temperature
whose type is double-precision floating point—see Appendix B, Section B.1, for 
the Java type name that corresponds to this description. Define a constructor 
that takes no parameters. The temperature field should be set to the value 
15.0 in the constructor. Define the mutators warmer and cooler, whose effect 
is to increase or decrease the value of temperature by 5.0° respectively. Define 
an accessor method to return the value of temperature
 
* Challenge exercise 2.94 Modify your Heater class to define three 
new double-precision floating point fields: min, max, and increment. The 
values of min and max should be set by parameters passed to the constructor. 
The value of increment should be set to 5.0 in the constructor. Modify the 
definitions of warmer and cooler so that they use the value of increment
rather than an explicit value of 5.0. Before proceeding further with this exercise, 
check that everything works as before.

Now modify the warmer method so that it will not allow the temperature to be 
set to a value greater than max. Similarly modify cooler so that it will not allow 
temperature to be set to a value less than min. Check that the class works 
properly. Now add a method, setIncrement, that takes a single parameter of 
the appropriate type and uses it to set the value of increment. Once again, test 
that the class works as you would expect it to by creating some Heater objects 
within BlueJ. Do things still work as expected if a negative value is passed to 
the setIncrement method? Add a check to this method to prevent a negative 
value from being assigned to increment
 */

/**
 * Heater simulates a heater where it starts at 
 * a given temperature, and is incremented or reduced by 5 by 
 * the user resulting in the temperature being warmer or 
 * cooler.
 * @author  Antonio Rosado
 * @version 2/15/22
 */
public class Heater // Class
{
    private double temperature; // The initial temp of heater
    private double min; // The minimum temp heater can reach
    private double max; // The maximum temp heater can reach
    private double increment; //Amount temp will increment by
    
    /**
     * Create a heater with a set temp, max/min temps, and
     * value it will increment by. 
     * @param minimum       Minimum value of the heater temp
     * @param maximum       Maximum value of heater temp
     */
    public Heater(double minimum, double maximum) 
    // Constructor
    {   
        min = minimum;
        max = maximum; 
        temperature = 15.0;
        increment = 5.0;
    }
    
    /** Return the minimum temperature of heater.
    * 
    * @return       Minimum temperature value
    **/                                                                                     
    public double getMinimum() // Accessor method
    {
        return min;
    }
    
    /** Return the maximum temperature of heater.
    * 
    * @return       Maximum temperature value
    **/
    public double getMaximum() // Accessor method
    {
        return max;
    }
    
    /** Return the value heater will be incremented.
    * 
    * @return       Temperature of heater
    **/
    public double getIncrement() // Accessor method
    {
        return increment;
    }
    
    /** Return the temperature of heater.
    * 
    * @return       Temperature of heater
    **/
    public double getTemperature() // Accessor method
    {
        return temperature;
    }
    
    /**
    * The temperature if it is made warmer. 
    * 
    * Temp increase by 5 degrees
    **/
    public void warmer() // Mutator method
    {   double newTemperature = temperature + increment;
        if (temperature >= max)
        {
            System.out.println ("Error! That temperature is out of range. Temperature cannot exceed the maximum temp.");
        }
        else {
            temperature = newTemperature;
        }
    }
    
    /** 
    * The temperature if it is made cooler.
    * 
    * Temp decrease by 5 degrees
    **/
    public void cooler() // Mutator method
    {
        double newTemperature = temperature - increment;
        if (temperature <= min)
        {
            System.out.println ("Error! That temperature is out of range. Temperature cannot go below the minimum temp.");
        }
        else {
            temperature = newTemperature;
        }
    }
    
    /**
    * Set amount temperature will increment by.
    * @param inc    New variable for increment if the value
    * is correct. 
    **/
    public void setIncrement(double inc)
    {   
        if(increment > 0) {
            increment = inc;
        }
        if (increment < 0) {
            System.out.println("ERROR! Negative values cannot be inserted.");
        }  
    }
}

