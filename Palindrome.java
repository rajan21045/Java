//program to check whether a number is palindrome or not 
import java.util.Scanner;
public class Palindrome {
    public static void palindrome(int n)
    {
        int OriginalNumber = n;
      int  rev = 0;
        while (n!=0)
        {
            int r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        if(OriginalNumber == rev)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        palindrome(n);
        scanner.close();

    }
}
