// Program to find the power of a number using recursion
import java.util.Scanner;

// Define the power class
public class power {

    // Recursive method to calculate base raised to the power of exponent
    public static int ppower(int base, int exponent) {

        // Base case: if exponent is 0, return 1
        if (exponent == 0) {
            return 1;
        } else {

            // Recursive case: multiply base by result of base^(exponent-1)
            return base * ppower(base, exponent - 1);
        }
        
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the base number
        System.out.println("Enter the base: ");

        // Read the base input from the user
        int base = scanner.nextInt();
        
        // Prompt the user to enter the exponent
        System.out.println("Enter the exponent: ");

        // Read the exponent input from the user
        int exponent = scanner.nextInt();
        
        // Calculate the power using the ppower method
        int result = ppower(base, exponent);
        
        // Print the result of base raised to the exponent
        System.out.println("The result is: " + result);
        
        // Close the Scanner to prevent resource leaks
        scanner.close();
        
    }
}
