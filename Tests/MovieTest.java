import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Isabell on 03.05.2017.
 */
public class MovieTest {
    private static final int PRICE_CODE = 1;
    private static final String TITEL_1 = "Titel";
    private Movie movie;

    @org.junit.Before
    public void setUp() throws Exception {
        movie = new Movie(TITEL_1, Movie.REGULAR);

    }


    @Test
    public void getPriceCode() throws Exception {
        assertEquals(Movie.REGULAR,movie.getPriceCode());
    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(PRICE_CODE);
        assertEquals(PRICE_CODE,movie.getPriceCode());
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(TITEL_1,movie.getTitle());
    }

}