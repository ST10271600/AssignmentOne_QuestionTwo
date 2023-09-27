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
public class RegularMovieTest {
   private RegularMovie regularMovie;

    @Before
    public void setUp() {
        // Initialize a RegularMovie object with sample data
        regularMovie = new RegularMovie("Regular Movie 1", 2022, 9.99);
    }

    @Test
    public void testConstructor() {
        // Verify that the constructor sets the attributes correctly
        assertEquals("Regular Movie 1", regularMovie.getName());
        assertEquals(2022, regularMovie.getYear());
        assertEquals(9.99, regularMovie.getRentalPrice(), 0.001); // Use delta for double comparison
    }

    @Test
    public void testGetRentalPrice() {
        // Verify that getRentalPrice() returns the expected rental price
        assertEquals(9.99, regularMovie.getRentalPrice(), 0.001); // Use delta for double comparison
    }
}