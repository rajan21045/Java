//Write a program to create a class with a numberfield "age".Throw an exception if the user enters a negative number for the age.
import java.util.Scanner;
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if (age < 0) {
                throw new Exception("Age cannot be negative");
            }
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
