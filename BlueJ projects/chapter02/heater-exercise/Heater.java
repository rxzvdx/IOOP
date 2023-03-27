/*
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
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater //class
{
    private int temperature; //fields
    private int min;
    private int max;
    private int increment;
    
    
    public Heater(int minimum, int maximum) 
    //constructor with variables
    {
        min = minimum; //double-precision floating point
        max = maximum;
        temperature = 15;
        increment = 5;
    }
    
    /**
    * Temp increase by 5 degrees
    **/
    public void warmer(int newTemp) //mutator method
    {
        newTemp = temperature + increment;
        if(newTemp <= max) {
            temperature = newTemp;
        }
    }
    /**
    * Temp decrease by 5 degrees
    **/
    public void cooler(int newTemp) //mutator method
    {
        newTemp = temperature - increment;
        if(newTemp >= min) {
            temperature = newTemp;
        }
    }
    public void setIncrement(int inc)
    {
        if(inc >= 0) {
            increment = inc;
        }
        if (inc < 0) {
            System.out.println("ERROR! Negative values can't be inputed");
        }
    }
    public int getTemperature() //accessor method
    {
        return temperature; 
    }
}    
