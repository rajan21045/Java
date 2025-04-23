/* Question:  

Write a Java program to demonstrate implicit type casting from `int` to `double`.
*/

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = intValue;
        System.out.println("Integer value: "+ intValue);
        System.out.println("Double Value (after implicit conversion) : "+ doubleValue);
    }
}
