public class WrapperExample2 {
    public static void main(String[] args) {

        // Creating an Integer object using valueOf (preferred way)
        Integer a = Integer.valueOf(3);

        // Explicit unboxing
        int i = a.intValue();

        // Auto-unboxing
        int j = a;

        // Output: 3 3 3
        System.out.println(a + " " + i + " " + j);
    }
}
