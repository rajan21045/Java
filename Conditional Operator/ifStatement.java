public class ifStatement {
    public static void main(String[] args) {
        /*
        Java Conditions and If Statements
        Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.
        Think of it like real life: If it rains, take an umbrella. Otherwise, do nothing.
        Every if statement needs a condition that results in true or false.
        This means if statements work hand-in-hand with boolean values:
        */

        boolean isUmberalla = true;
        if(isUmberalla){
            System.out.println("Yes, You have bring UMBERALLA today.");
        }

        /*
        Most often, conditions are created using comparison operators, like the ones below:
            - Less than: a < b
            - Less than or equal to: a <= b
            - Greater than: a > b
            - Greater than or equal to: a >= b
            - Equal to: a == b
            - Not equal to: a != b

        You can use these conditions to perform different actions for different decisions.

        Java has the following conditional statements:
            - Use if to specify a block of code to be executed, if a specified condition is true
            - Use else to specify a block of code to be executed, if the same condition is false
            - Use else if to specify a new condition to test, if the first condition is false
            - Use switch to specify many alternative blocks of code to be executed
        */

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        /*
        Example explained
        In the example above we use two variables, x and y, to test whether x is greater than y (using the > operator). 
        As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".
        */

        /*
        Comparison is also often used to check if two values are equal, using the == operator:
        Example
        */
        int x1 = 20;
        int y1 = 20;
        if (x1 == y1) {
            System.out.println("x1 is equal to y1");
        }
        //Here the condition x1 == y1 is true, because both x1 and y1 are 20, so the message "x1 is equal to y1" is printed.

        /*
        Using Boolean Variables
        You can also test boolean variables directly in an if statement:
        
        Example
        */
        boolean isLightOn = true;
        if (isLightOn) {
            System.out.println("The light is on.");
        }
        //Note: Writing if (isLightOn) is the same as writing if (isLightOn == true), but shorter and easier to read.

        /*
        If Without Braces
        If an if statement has only one line of code, you can write it without curly braces { }:
        Example
        */
        if (20 > 18)
            System.out.println("20 is greater than 18");
    }
}
