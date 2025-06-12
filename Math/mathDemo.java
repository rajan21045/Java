// Import the Math class from java.lang package
import java.lang.Math;

// Define the mathDemo class
public class mathDemo {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Declare and initialize integer variables
        int a = 30;
        int b = 50;
        int c = -1111111;
        
        // Print the maximum value between a and b
        System.out.println("The Maximum Value is " + Math.max(a, b));
        
        // Print the minimum value between a and b
        System.out.println("The Minimum Value is " + Math.min(a, b));
        
        // Calculate and print a raised to the power of 4
        System.out.println("The Power of " + a + " Is " + Math.pow(a, 4));
        
        // Calculate and print the square root of a
        System.out.println("The Sqrt of " + a + " Is " + Math.sqrt(a));
        
        // Print the absolute (positive) value of c
        System.out.println("The Absolute Value of " + c + " Is " + Math.abs(c));
        
        // Round 4.4 to the nearest integer and print
        System.out.println("The Round Up OF 4.4 Is " + Math.round(4.4));
        
        // Round 4.6 to the nearest integer and print
        System.out.println("The Round Up of 4.6 Is " + Math.round(4.6));
        
        // Print the ceiling value of 2.3 (smallest integer >= 2.3)
        System.out.println("The Ceiling Value of 2.3 Is " + Math.ceil(2.3));
        
        // Print the floor value of 88.98 (largest integer <= 88.98)
        System.out.println("The Flooring Value of 88.98 Is " + Math.floor(88.98));
        
        // Calculate and print the natural logarithm of 2.2
        System.out.println("Example Of Showing Log() Is " + Math.log(2.2));
        
        // Calculate and print the sine of 3.3 radians
        System.out.println("Example of Showing Sin() Is " + Math.sin(3.3));
        
        // Calculate and print the cosine of 3.3 radians
        System.out.println("Example Of Showing Cos() Is " + Math.cos(3.3));
        
    }
}
