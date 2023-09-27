/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package movierentalstore;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author annab
 */
public class PremiumMovieTest {
   private PremiumMovie testPremiumMovie;

    @Before
    public void setUp() {
        // Initialize a PremiumMovie instance for testing
        testPremiumMovie = new PremiumMovie("Premium Test Movie", 2023, 5.99);
    }

    @Test
    public void testGetRentalPrice() {
        // Test the getRentalPrice() method
        assertEquals(5.99, testPremiumMovie.getRentalPrice(), 0.001); // Use delta for double comparisons
    }
}