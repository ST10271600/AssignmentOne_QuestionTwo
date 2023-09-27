/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movierentalstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author annab
 */
public class Movie {
    
    // Define a static ArrayList to store the inventory of movies
    private static ArrayList<Movie> MoviesInventory = new ArrayList<>();

    public static ArrayList<Movie> getMoviesInventory() {
        return MoviesInventory;
    }
    
    // Declare instance variables for movie name and release year
    private String name;
    private int year;
    private double rentalPrice;

    
    
    // Constructor to initialize the movie's name and release year and rental price
    public Movie(String name, int year, double rentalPrice) {
        this.name = name;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }
    
    
    // Getter method for retrieving the movie's name
    public String getName() {
        return name;
    }
    
    // Getter method for retrieving the movie's release year
    public int getYear() {
        return year;
    }
    
    // Getter method for retrieving the movie's rental price
    public double getRentalPrice() {
        return rentalPrice;
    }
    
    // Override the toString method to provide a custom string representation of the movie
    @Override
    public String toString() {
        return name + " (" + year + ")";
    }
    
    
    // Method to add a regular movie to the MoviesInventory
    public static void addRegularMovie(String name, int year, double rentalPrice) {
        RegularMovie movie = new RegularMovie(name, year, rentalPrice);
        MoviesInventory.add(movie);
        System.out.println("Regular movie added to inventory: " + movie);
    }
    
    
     // Method to add a premium movie to the MoviesInventory
    public static void addPremiumMovie(String name, int year, double rentalPrice) {

        // Create a PremiumMovie object and add it to the MoviesInventory
        PremiumMovie movie = new PremiumMovie(name, year, rentalPrice);
        MoviesInventory.add(movie);
        System.out.println("Premium movie added to inventory: " + movie);
    }
    
    
    // Method to search for a movie by name in the MoviesInventory
    public static void searchMovieByName(String searchName) {
        

        //Initialize a boolean variable 'found' to keep track of whether a movie with the searched name is found.
        boolean found = false;
        // Iterate through each 'Movie' object in the 'MoviesInventory' ArrayList.
        for (Movie movie : MoviesInventory) {
            // Check if the movie name matches (case-insensitive) the search name
            if (movie.getName().equalsIgnoreCase(searchName)) {
                 // If a matching movie is found, display it and set 'found' to true.
                System.out.println("Movie found: " + movie);
                found = true;
            }
        }
        
        // If no movie with the search name is found, display a message
        if (!found) {
            System.out.println("Movie not found.");
        }
    }
    
    // Method to display all movies in the MoviesInventory
    public static void displayAllMovies() {
        System.out.println("All Movies in Inventory:");
        // Iterate through each 'Movie' object in the 'MoviesInventory' ArrayList.
        for (Movie movie : MoviesInventory) {
            // Display the current movie's details by implicitly calling its 'toString' method
            System.out.println(movie);
        }
    }

}//end of Movie
