/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movierentalstore;

/**
 *
 * @author annab
 */
public class PremiumMovie extends Movie {
    
     // Declare a private instance variable to store the rental price of the premium movie.
    private double rentalPrice;
    
    //Constructor for 'PremiumMovie' class that initializes the movie's name, release year, and rental price.
     public PremiumMovie(String name, int year, double rentalPrice) {
         
         // Call the constructor of the superclass 'Movie' to set the name and release year.
        super(name, year, rentalPrice);
        // Initialize the 'rentalPrice' specific to premium movies.
        this.rentalPrice = rentalPrice;
    }

     
     //Getter method to retrieve the rental price of the premium movie.
    @Override
    public double getRentalPrice() {
        
        //returns the rental price of the premium movie.
        return rentalPrice;
    }
    
}
