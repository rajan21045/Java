import java.util.Scanner;
import java.util.Random; //Import Random class to generate a random number

public class guessnumber {
    public static void main(String[] args) {
                            int guess;
                            int attempt=0;
                            Random random = new Random();
                            int min = 1;       // Define the minimum value for the random number

                            int max = 100;  // Define the maximum value for the random number

                            int number = random.nextInt(min, max+1); // Generate a random number between 1 and 100

                            Scanner scanner = new Scanner(System.in);  // Create a Scanner object to take user input

                            System.out.println("Welcome To Guessing Game");

                              // Start a loop that continues until the user guesses the correct number
                            do{
                                System.out.println("Guess a number between 1 and 100");
                            
                                guess = scanner.nextInt();
                                attempt++; // Increment attempt count after each guess
                                if(guess < number){
                                    System.out.println("Too Low");
                                    }
                                    else if(guess > number){
                                        System.out.println("Too High");
                                        }
                                        else{
                                            System.out.println("You Won");
                                            System.out.println("Number of attempts: " + attempt);
                                            }
                                            
                            }while(guess!=number); // Continue looping until the user guesses correctly
                            scanner.close();
    }
}
