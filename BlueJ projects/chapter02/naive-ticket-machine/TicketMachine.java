/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //field ^^
    //private int status;
    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    //constructor
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
        
    }
    public void TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    public void TicketMachine2()
    {
        price = 800;
        balance = 0;
        total = 0;
    }
    public void showPrice()
    {
    System.out.println("The price of a ticket is " + price + " cents");
    }
    /**
     * Return the price of a ticket.
     */
     //method
    //Accesor method; returns info
    public int getPrice()
    {
        return price;
       
    }
    
    public void empty()
    {
        total = 0;
    }
    //No parameters needed; its a mutator method.
    public void prompt()
    {
    System.out.println("Please insert the correct amount of money");
    }
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    //method
    //Accesor method; returns info
    public int getAmount()
    {
        return balance;
        
    }
    public int getTotal()
    {
        return total;
        
    }
    /**
     * Receive an amount of money from a customer.
     */
    //method that changes value
    public void insertMoney(int amount)
    {
        balance = balance + amount;
        
    }
    /*does not need return statement because it is adding 
     * value to the "balance" object. Which makes it a 
     * mutator method
     */
    

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    /*
     * Does not need a return statement because it has "void"
     * which means it returns nothing.
     */
    {
        // Simulate the printing of a ticket.
        //print methods
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        //method
        // Clear the balance.
        balance = 0;
        //constructor
    }
    
    
    /*
     * ex 2.33 
     * Increase score by the given # of points.
     */
    /*
     * public void increase(int points)
     * {
     *     score = score + points;
     *  }
     */
    
    /*
     * ex 2.35 
     * Reduce price by the given amount
     */
    /*
     * public void discount(int amount)
     * {
     *     amount = amount - price;
     *  }
     */
}

