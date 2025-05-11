import java.util.Stack; // Importing Stack class from java.util package

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack of Integer type
        Stack<Integer> stk = new Stack<>();

        // Checking if the stack is empty (should return true)
        boolean result = stk.empty();
        System.out.println("Is The Stack Empty?: " + result);

        // Pushing elements onto the stack
        stk.push(78);
        stk.push(10111111);
        stk.push(2202);
        stk.push(22233455);

        // Printing the elements in the stack
        System.out.println("Elements In Stack: " + stk);

        // Checking again if the stack is empty (should return false)
        result = stk.empty();
        System.out.println("Is The Stack Empty?: " + result);
    }
}
