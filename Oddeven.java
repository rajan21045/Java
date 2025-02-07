// Program to check whether a number is odd or even
import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        if(n%2==0)
        {
            System.out.println(n +" is even.");
        }
        else
        {
            System.out.println(n +" is odd");
        }
     scanner.close();   
    }
}
