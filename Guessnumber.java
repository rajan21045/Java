import java.util.Scanner;
import java.util.Random;
public class Guessnumber{
        public static void main(String[] args)
        {

            int guess;
            int attempt=0;
            int min =1;
            int max=100;


            // creating random object called rand
            Random rand = new Random();

            // it will generates random numbers between 1 and 100
            int random = rand.nextInt(max - min + 1) + min;


            // creating scanner object called sc
                Scanner sc = new Scanner(System.in);


                System.out.println("Welcome to the Guessing Game");


         do{
        
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            //to know at how many attempts the user has guessed the number
            attempt++;

            
            // to let the user know if the number is higher or lower than the number he guessed
            if(guess<random){
                System.out.println("Your guess is too low");
            }
            else if(guess>random){
                System.out.println("Your guess is too high");
                }
                else{
                    System.out.println("You guessed it in " + attempt + " attempts");
                    System.out.println("THE NUMBER WAS " + random);
                }
         }while(guess!=random);
         sc.close();
        }
}