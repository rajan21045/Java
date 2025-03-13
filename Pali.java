//Implement a recursive function to check if a string is a palindrome
import java.util.Scanner;
public class Pali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter An String : ");  // Prompting the user to enter a string
        String st = sc.next();
        String result = str(st); // Calling the 'str' method to check if the input is a palindrome and storing the result
        System.out.println(" The String is "+result);
        System.out.println("This Code Was Programmed By Rajan.");
        sc.close(); // Closing the Scanner object to free up resources
    }
    public static String str(String st)
    {
        String rev = new StringBuilder(st).reverse().toString();
        if(st.equals(rev)){  // Checking if the input string is equal to the reversed string
            return  "Palindrome"; // Returning "Palindrome" if the strings are equal
        }
        else {
            return "not palindrome"; // Returning "Not a palindrome" if the strings are not equal
        }
}
}
