
/**
 * Driver class
 *
 * @author Antonio Rosado
 * @version 4/19/2022
 */
public class Driver
{   
    /**
     * Initializes Movie objects and lists them
    **/
    public static void main(String args[])
    {
        //six local variables
        TheaterCorp myCorp = new TheaterCorp("United Movies");
        //Theater objects and locations
        Theater theaterOne = new Theater("Pitman");
        Theater theaterTwo = new Theater("Glassboro");
        //Movies and ratings
        Movie bambi = new Movie("Bambi", Rating.G);
        Movie jumanji = new Movie("Jumanji", Rating.PG);
        Movie dieHard = new Movie("Die Hard", Rating.R);
        //Theaters
        myCorp.addTheater(theaterOne);
        myCorp.addTheater(theaterTwo);
        //Add movie
        myCorp.addMovie(bambi);
        myCorp.addMovie(jumanji);
        myCorp.addMovie(dieHard);
        //Add screens
        theaterOne.addScreen(1, bambi);
        theaterOne.addScreen(2, jumanji);
        theaterTwo.addScreen(1, jumanji);
        theaterTwo.addScreen(2, dieHard);
        //List all movies
        myCorp.listAllTheaterMovies();
    }    
}


