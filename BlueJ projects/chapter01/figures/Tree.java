
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle leaves;
    private Square trunk;
    private boolean isVisible;
    
    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
        leaves = new Triangle();
        trunk = new Square();
        setup();
    }

    public void setup()
    {   
        trunk.moveHorizontal(-90);
        trunk.moveVertical(70);
        trunk.changeSize(50);
        trunk.changeColor("brown");
        trunk.makeVisible();
        
        leaves.moveHorizontal(40);
        leaves.moveVertical(-100);
        leaves.changeSize(150, 120);
        leaves.changeColor("green");
        leaves.makeVisible();
    }
}
