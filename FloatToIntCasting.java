/* Question: 
Write a Java program to demonstrate explicit type casting  
from `float` to `int`. */

// Define the FloatToIntCasting class
public class FloatToIntCasting {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Declare and initialize a float variable
        float floatValue = 19.99f; // 'f' suffix denotes a float literal
        
        // Explicitly cast the float value to an integer, truncating decimal part
        int intValue = (int) floatValue;
        
        // Print the original float value
        System.out.println("Float Value : " + floatValue);
        
        // Print the integer value after casting
        System.out.println("Integer Value (after explicit casting): " + intValue);
    }
}