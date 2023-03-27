public class Heater //class
{
    private double temperature; //field
    
    public Heater() //constructor with no parameters
    {
        temperature = 15.0;
    }
    
    /**
    * Temp increase by 5 degrees
    **/
    public void warmer() //mutator method
    {
        temperature += 5.0;
    }
    /**
    * Temp decrease by 5 degrees
    **/
    public void cooler() //mutator method
    {
        temperature -= 5.0;
    }
    public double getTemperature() //accessor method
    {
        return temperature;
    }
}
