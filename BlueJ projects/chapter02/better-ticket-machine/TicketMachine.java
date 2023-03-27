/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
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

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost) //int cost is a formal parameter
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount <= 0) {
            System.out.println("Use a positive amount rather than: " +
                               amount);
                               
        }
        else {
            balance = balance + amount;
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
public void printTicket()
{
     int amountLeftToPay = price - balance;
if(amountLeftToPay <= 0) 
{
 // Simulate the printing of a ticket.
 System.out.println("##################");
 System.out.println("# The BlueJ Line");
 System.out.println("# Ticket");
 System.out.println("# " + price + " cents.");
 System.out.println("##################");
 System.out.println();
 // Updates the total added with the price.
 total += price; 
 // Reduces the balance by the price.
 balance -= price;
 }
 
 else 
 {
     System.out.println("You must insert: " +
     amountLeftToPay + " more cents.");
 }
} 
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    //EX 2.54 saving = price * discount;
        //EX 2.55 mean = total / count;
        /*
         * EX 2.57 
         * if(price > budget) 
         * {
             System.out.println("Too expensive.");
                       }
            else {
             System.out.println("Just right."); 
                }
         */
        /* 
         * if(price > budget) 
         * {
             System.out.println("Too expensive. Your budget is only: " + budget);
            }
           
            else {
             System.out.println("Just right.");
            } 
         */
         /*EX 2.69
     * public Person (String myName, int myAge)
     * {
     *      name = myName;
     *      age = myAge;
     *  }
     */
    /*EX 2.71
     *{
     *  public string getName()
     *  return name;
     * }
     */
    /*EX 2.72
     * public void setAge(int newAge)
     * {
     *   age = newAge;
        }
     */
    /*EX 2.73
     * public void printDetails()
     * {
     *   System.out.println("The name of this person is " + name);
        }
     */


    public int emptyMachine()
    {
        int oldTotal = total; 
        total = 0;
        return oldTotal;
    }
}
    
    