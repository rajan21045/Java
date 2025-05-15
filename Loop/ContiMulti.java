//Write a Java program to print numbers from 1 to 100, skipping all multiples of 5 using the continue statement.
public class ContiMulti {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    continue; // Skip multiples of 5
                }
                System.out.print(i + " ");
            }
        }

}
