/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @Antonio Rosado
 * @2/6/2022
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; 
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText) //add bookPages as parameter
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; //add pages field 
        refNumber = ""; //initialized to zero length string
        courseText = bookCourseText;
    }
    //getPages accesor method
    public int getPages()
    {
        return pages;
    }
    //Returns author of book
    public String getAuthor()
    {
        return author;
    }
    //Returns title of book
    public String getTitle()
    {
        return title;
    }
    //Prints name of author in terminal
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    //Prints title of book in terminal
    public void printTitle()
    {
        System.out.println("Title: " + title);
    }
    //Sets ref number for the book
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void setRefNumber(String ref) 
    {
        if(ref.length() >= 3) 
        {
            refNumber = ref;
        }
        else {
            System.out.println("Error occurred: The reference number must be at least three characters long");
        }
    }
    //Gets ref number for the book
    public String getRefNumber()
    {
        return refNumber;
    }
    public void borrow()
    {
        borrowed ++; //"++" increments "borrowed" by 1 
    }
    //get the # of times a book has been borrowed
    public int getBorrowed() 
    {
        return borrowed;
    }
    public void printDetails()
    {
        System.out.println("Title: " + title + "Author: "+ author +" Pages: "+ pages +" Borrowed: "+ borrowed);
        String refNumberString;
        if(refNumber.length() > 0)
        {
            refNumberString = refNumber;
        }
        else {
            refNumberString = "ZZZ";
        }
        System.out.println("Reference number: " + refNumberString);
        System.out.println("Borrowed: " + borrowed);
    }
    
    // Add the methods here ...
}

//new Date ("March", 23, 1861)
