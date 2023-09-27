/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movierentalstore;

/**
 *
 * @author annab
 */
public class RegularMovie extends Movie {
    
    // Declare a private instance variable to store the rental price.
   private double rentalPrice;
   
   //Constructor to initialize a RegularMovie object with a name, release year, and rental price.
    public RegularMovie(String name, int year, double rentalPrice) {
        // Call the constructor of the superclass ('Movie') to set the name and year.
        super(name, year, rentalPrice);
        // Set the rental price for the regular movie.
        this.rentalPrice = rentalPrice;
    }
    
    //Getter method for RentalPrice

    /**
     *
     * @return
     */
   @Override
    public double getRentalPrice() {
        // Return the rental price of the regular movie.
        return rentalPrice;
    } 
}
