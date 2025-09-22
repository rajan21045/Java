/* Write a program to create a class named Person with a field age. Throw an exception if the user enters
a negative number for age. Demonstrate the use of exception handling to catch and display the error message. */

import java.util.Scanner;
class Per {
    int age;

    void setAge(int age) throws Exception {
        
        if (age < 0) {
            throw new Exception("Age cannot be negative");
        }
        this.age = age;
    }
}

public class Person{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Per p = new Per();

        try {
            System.out.print("Enter age: ");
            int inputAge = sc.nextInt();
            p.setAge(inputAge);
            System.out.println("Age is valid: " + p.age);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
