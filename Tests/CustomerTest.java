import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Isabell on 03.05.2017.
 */
public class CustomerTest {

    private static final String PERSON_NAME = "Testperson";
    private String STATEMENT = "Rental Record for Testperson\n" +
            "\tTitle\t\tDays\tAmount\n" +
            "\tmovie1\t\t10\t30.0\n" +
            "\tmovie2\t\t5\t4.5\n" +
            "Amount owed is 34.5\n" +
            "You earned 3 frequent renter points";
    private Customer testObject;

    @org.junit.Before
    public void setUp() throws Exception {
        Movie movie1 = new Movie("movie1", 1);
        Movie movie2 = new Movie("movie2", 2);
        Rental rental2 = new Rental(movie2, 5);
        Rental rental1 = new Rental(movie1, 10);

        testObject = new Customer(PERSON_NAME);

        testObject.addRental(rental1);
        testObject.addRental(rental2);

    }

    @Test
    public void getName() throws Exception {
        assertEquals(PERSON_NAME, testObject.getName());
    }

    @Test
    public void statement() throws Exception {
        assertEquals(STATEMENT, testObject.statement());
    }

}