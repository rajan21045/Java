// Program to check whether the given number is an Armstrong number or not
import java.util.Scanner;
public class Arstrongs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");  
        int n = scanner.nextInt();
        int temp = n;
        int r,sum=0;
        while(n>0)
        {
            r = n%10;
            sum +=r*r*r;
            n/=10;
        }
        if(temp == sum)
        {
            System.out.println("The number is an Armstrong number");
        }
        else
        {
            System.out.println("The number is not an Armstrong number");
        }
        scanner.close();
    }
}
