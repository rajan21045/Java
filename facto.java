// Program to find the factorial of a number
import java.util.Scanner;

// Define the facto class
public class facto {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        
        // Read the integer input from the user
        int n = sc.nextInt();
        
        // Initialize fact variable to store factorial result, starting at 1
        int fact = 1;
        
        // Loop from 1 to n to calculate factorial
        for (int i = 1; i <= n; i++) {
            // Multiply fact by the current number i
            fact = fact * i;
        }
        
        // Print the factorial result
        System.out.println("Factorial of " + n + " is: " + fact);
        
        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}