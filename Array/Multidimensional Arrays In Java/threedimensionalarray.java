// Java Code to print a Three-dimensional Array

import java.util.Scanner; // Import Scanner class for taking input from the user
public class threedimensionalarray {
    public static void main(String[] args) {

        // Declare a 3x3x3 three-dimensional array
        int[][][] arr = new int[3][3][3];

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter elements
        System.out.println("Enter the elements of 3D array: ");

        // Loop to take input for each element in the 3D array
        for (int i = 0; i < 3; i++) {         // Loop for the first dimension
            for (int j = 0; j < 3; j++) {     // Loop for the second dimension
                for (int k = 0; k < 3; k++) { // Loop for the third dimension
                    arr[i][j][k] = sc.nextInt(); // Take input from the user
                }
            }
        }

        // Print a new line for clarity
        System.out.println(" ");
        
        System.out.println("The 3D array is: ");

        // Outer loop iterates over the 2 arrays
        for (int i = 0; i < 3; i++) {

            // Middle loop iterates over the rows in each 2D array
            for (int j = 0; j < 3; j++) {

                // Inner loop iterates over the columns in each row
                for (int k = 0; k < 3; k++) {

                    // Printing each element in the 3D array
                    System.out.print(arr[i][j][k] + " ");
                }

                // New line after printing all columns in a row
                System.out.println();
            }

            // New line after printing all rows in one 2D array
            System.out.println(" "); // Extra line after each 2D array for clarity
        }
    }
}
