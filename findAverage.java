// Define the findAverage class
public class findAverage {

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {10, 20, 30, 40};
        
        // Calculate the average by calling the average method
        double avg = average(arr);
        
        // Print the calculated average
        System.out.println("Average: " + avg);
        // Output: 25.0
    }

    // Method to calculate the average of an integer array
    public static double average(int[] arr) {
        // Initialize sum to store the total of array elements
        int sum = 0;
        
        // Loop through the array to add each element to sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        // Calculate and return the average by dividing sum by array length
        // Cast sum to double to ensure decimal precision in division
        return (double) sum / arr.length;
    }
}