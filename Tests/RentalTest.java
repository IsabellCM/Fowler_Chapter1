import static org.junit.Assert.*;

/**
 * Created by Isabell on 03.05.2017.
 */
public class RentalTest {
    public static final int DAYS_RENTED = 5;
    public static final double PRICE = 6.5;
    Rental testObject;
    Movie movie;

    @org.junit.Before
    public void setUp() throws Exception {
        movie = new Movie("Titel", Movie.REGULAR);
        testObject=new Rental(movie, DAYS_RENTED);

    }

    @org.junit.Test
    public void getDaysRented() throws Exception {
        assertEquals(DAYS_RENTED,testObject.getDaysRented());
    }

    @org.junit.Test
    public void getMovie() throws Exception {
assertSame(movie,testObject.getMovie());
    }

    @org.junit.Test
    public void amountFor() throws Exception {
assertEquals(PRICE,testObject.amountFor(),0.0);
    }

}