// Import Arrays class for sorting functionality
import java.util.Arrays;

// Define the Largest class
public class Largest {
    
    // Method to find and print the second largest element in an array
    public static void secondla(int arr[]) {
        // Get the length of the array
        int size = arr.length;
        
        // Check if array has fewer than 2 elements
        if (size < 2) {
            // Print error message for invalid input
            System.out.println("Invalid Input");
        } else {
            // Sort the array in ascending order
            Arrays.sort(arr);
            // Print the second largest element (second-to-last after sorting)
            System.out.println("Second largest element is: " + arr[size - 2]);
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize an array of integers
        int arr[] = {12, 35, 1, 10, 34, 1};
        // Call the secondla method to find and print the second largest element
        secondla(arr);
    }
}