/*
Write a program to create a class with  a number field "age". Throw an exception if the user enters a negative number
for the age.
 */

import java.util.Scanner;
public class ageException {
    public static void main(String[] args) {
        try{

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Age: ");
            int age = sc.nextInt();

            if(age<0) {
                throw new Exception("You Have Entered A Negative Age");
            }
                    else {
                            System.out.println("Your Age Is: " + age);
                          }
            }catch(Exception e){
                System.out.println("Error Occured: "+ e.getMessage());
            }
        }
    }

    /*

    What is Exception Handling?
      Exception handling is a programming mechanism that allows a program to gracefully deal with unexpected events or
      errors during runtime, preventing the program from crashing and allowing it to continue executing or recover from
      the error. Instead of halting execution upon encountering an error, exception handling uses specialized blocks of
      code to handle specific types of exceptions, ensuring a smoother user experience and more robust application behavior.
      
     */