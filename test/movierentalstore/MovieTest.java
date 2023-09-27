/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package movierentalstore;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author annab
 */
public class MovieTest {
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Movie instance = new Movie("Shotgun Wedding", 2022, 9.99);
        String expResult = "Shotgun Wedding";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Movie instance = new Movie("Shotgun Wedding", 2022, 9.99);
        int expResult = 2022;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Movie instance = new Movie("Shotgun Wedding", 2022, 9.99);
        String expResult = "Shotgun Wedding (2022)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
public void testAddRegularMovie() {
    Movie.addRegularMovie("In the heights", 2021, 5.99);
    Movie.addRegularMovie("The Lost City", 2022, 5.99);

    // Access MoviesInventory using the getter method
    ArrayList<Movie> inventory = Movie.getMoviesInventory();
    assertEquals(2, inventory.size());
}

@Test
public void testAddPremierMovie() {
    Movie.addPremiumMovie("Barbie", 2023, 9.99);
    Movie.addPremiumMovie("The Little ", 2023, 9.99);

    // Access MoviesInventory using the getter method
    ArrayList<Movie> inventory = Movie.getMoviesInventory();
    assertEquals(2, inventory.size());
}

    @Test
    public void testSearchMovieByName() {
        // Create a Movie object
        Movie movie = new Movie("Movie 1", 2022, 9.99);

        // Add movies to the inventory
        movie.addRegularMovie("In The Heights", 2022, 5.99);
        movie.addPremiumMovie("The Lost City", 2023, 9.99);

        // Access MoviesInventory using the getter method
        ArrayList<Movie> inventory = Movie.getMoviesInventory();

        // Search for a movie by name
        String searchName = "In The Heights";
        Movie foundMovie = null;
        for (Movie m : inventory) {
            if (m.getName().equals(searchName)) {
                foundMovie = m;
                break; // Found the movie, no need to continue searching
            }
        }

        // Assert that the movie with the specified name is found
        assertNotNull(foundMovie);
        assertEquals(searchName, foundMovie.getName());
        assertEquals(2022, foundMovie.getYear());
        // Assuming you have a getRentalPrice method
        assertEquals(5.99, foundMovie.getRentalPrice(), 0.01);
    }
}