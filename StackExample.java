import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
                        Stack<Integer>stk = new Stack<>();
                        boolean result = stk.empty();

        System.out.println("Is The Stack Empty?: "+result);
        stk.push(78);
        stk.push(10111111);
        stk.push(2202);
        stk.push(22233455);

        System.out.println("Elements In Stack: "+stk);
        result = stk.empty();

        System.out.println("Is The Stack Empty?: "+result);

    }
}
