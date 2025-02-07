//to find the power of a number using recursion
import java.util.Scanner;
public class power {
    public static int ppower(int base, int exponent){
        if(exponent == 0){
           return 1;
        }
        else{
                     return base * ppower(base, exponent-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = scanner.nextInt();
      int result =  ppower(base, exponent);
        System.out.println("The result is: "+result);
        scanner.close();
    }
}
