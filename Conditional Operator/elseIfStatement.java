import java.util.Scanner;
public class elseIfStatement {
    public static void main(String[] args) {
        /*
        The else if Statement
        Use the else if statement to specify a new condition to test if the first condition is false.

        Syntax:
        if (condition1) {
        // block of code to be executed if condition1 is true
        } else if (condition2) {
        // block of code to be executed if condition1 is false and condition2 is true
        } else {
        // block of code to be executed if both conditions are false
        }
        Think of it like real life: If it rains, bring an umbrella. Else if it is sunny, wear sunglasses. Else, just go outside normally.
        */

        //Grade Calculator: Input a student's percentage and print their grade (e.g., >= 90 is A, >= 80 is B, etc.).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();
        if(marks >=90 && marks <=100){
            System.out.println("Your Grade Is \'A+\'.");
            System.out.println("Outstanding.");
        }else if(marks >=80 && marks<90){
            System.out.println("Your Grade Is \'A\'.");
            System.out.println("Excellent.");
        }else if(marks >= 70 && marks <80){
            System.out.println("Your Grade Is \'B+\'.");
            System.out.println("Very Good.");   
        }else if(marks >= 60 && marks <70){
            System.out.println("Your Grade Is \'B\'.");
            System.out.println("Good.");   
        }else if(marks >= 50 && marks <60){
            System.out.println("Your Grade Is \'C+\'.");
            System.out.println("Above Average.");   
        }else if(marks >= 40 && marks <50){
            System.out.println("Your Grade Is \'C\'.");
            System.out.println("Average.");   
        }else if(marks >= 20 && marks <40){
            System.out.println("Your Grade Is \'D\'.");
            System.out.println("Below Average.");   
        }else if(marks >= 1 && marks <20){
            System.out.println("Your Grade Is \'D\'.");
            System.out.println("Insufficient.");   
        }else if(marks<0){
            System.out.println("Your Grade Is \'N\'.");
            System.out.println("Not Graded.");   
        }else if(marks>100){
            System.out.println("Cann't Generate The Graded Because Marks Cann't Be More Than 100.");
        }

        //Greatest of Three: Take three numbers from the user and determine which one is the largest.
        System.out.println("\n");
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.printf("%d Is Greatest Number Between %d And %d", a, b,c);
        }else if(b>c && b>c){
            System.out.printf("%d Is Greatest Number Between %d And %d", b, a, c);
        }else if(c>a && c>b){
            System.out.printf("%d Is Greatest Number Between %d And %d", c, a, b);
        }
        
        //Temperature Advisor: Write a program that suggests clothing based on temperature (e.g., > 30°C: "Wear light clothes"; 15–30°C: "Nice weather"; < 15°C: "Wear a jacket").
        System.out.println("\n");
        System.out.print("Enter The Temperature (In °C): ");
        int temperature = sc.nextInt();
        if(temperature>=30){
            System.out.println("Wear light clothes");
        }else if(temperature >= 15 && temperature <30){
            System.out.println("Nice weather");
        }else if(temperature<15){
            System.out.println("Wear a jacket");
        }

        sc.close();
    }
}
