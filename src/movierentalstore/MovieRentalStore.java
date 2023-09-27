/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movierentalstore;

import java.util.ArrayList;
import java.util.Scanner;

/**Description of the scenario:
 *This is a Java console application for managing a movie rental store. 
 * Employees can add and search for movies in the store's inventory. 
 * The program supports two types of movies: Regular and Premium. 
 * Each movie has a name, release year, and rental price. 
 */
public class MovieRentalStore {

    

    
    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner kb = new Scanner(System.in);
        // Initialize choice to a default value
        int choice = 0;  

        // While loop that continues until the user selects option 4 to exit the program
         while (choice != 4) {
             // Displays the main menu to the user
            System.out.println("Welcome to Movie Rental Menu:");
            System.out.println("1. Add a regular movie");
            System.out.println("2. Add a premium movie");
            System.out.println("3. Search for a movie by name");
            System.out.println("4. Display all movies");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: " );
            
            choice = kb.nextInt();
            kb.nextLine();  
            
            // Use a switch statement to perform actions based on the user's choice
            switch (choice) {
                case 1:
                    // Call a method to add a regular movie
                    System.out.print("Enter the movie name: ");
                    String name = kb.nextLine();
                    System.out.print("Enter the release year: ");
                    int year = kb.nextInt();
                    kb.nextLine();
                    System.out.print("Enter the rental price for regular movie: ");
                    double rentalPrice = kb.nextDouble();
                    kb.nextLine();
                    
                    // Call the addRegularMovie method with movie details
                    Movie.addRegularMovie(name, year, rentalPrice);
                    break;
                case 2:
                    System.out.print("Enter the movie name: ");
                    String premierName = kb.nextLine();
                    System.out.print("Enter the release year: ");
                    int premierYear = kb.nextInt();
                    kb.nextLine();
                    System.out.print("Enter the rental price for premier movie: ");
                    double premierRentalPrice = kb.nextDouble();
                    kb.nextLine();
                    
                    // Call the addPremierMovie method with movie details
                    Movie.addPremiumMovie(premierName, premierYear, premierRentalPrice);
                    break;
                case 3:
                    // Call a method to search movie by name
                            System.out.print("Enter the movie name to search: ");
                            String searchName = kb.nextLine();
                            
                    Movie.searchMovieByName(searchName);
                    break;
                case 4:
                    // Call a method to display all movies
                    Movie.displayAllMovies();
                    break;
                case 5:
                    // Display an exit message
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Display an error message for invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        
    }
}



    