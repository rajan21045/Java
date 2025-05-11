public class WrapperExample {
    public static void main(String[] args) {
        int a = 20; // Primitive int variable

        // Converting int to Integer explicitly (boxing)
        Integer i = Integer.valueOf(a);

        // Auto-boxing: Java automatically converts int to Integer
        Integer j = a;

        // Printing the primitive and wrapper values
        System.out.println("Value Of A Is: "+ a + " " +"Value Of I Is: "+ i + " " +"Value Of J Is: "+ j);
    }
}
