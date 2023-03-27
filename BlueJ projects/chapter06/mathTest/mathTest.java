

/**
 * Write a description of class mathTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathTest
{
    // instance variables - replace the example below with your own
    private int count;
    private int total;
    /**
     * Constructor for objects of class mathTest
     */
    public mathTest()
    {
        total = 0; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int beginCount()
    {
        int count = 0;
        boolean counting = false; 
        while(count < 10000)
        {
            count++;
            if(count >= 10000)
            {
                counting = false;
            }
            else
            {
                counting = true; 
            }
        }
        System.out.println(System.currentTimeMillis());
        return count; 
    }
}
