//program to print fibonacci series upto n terms
import java.util.Scanner;
public class Fibonacci {
    public static int fibo(int n)
    {
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args)
    {
                Scanner scanner = new Scanner(System.in);
                System.out.println("ENTER THE NUMBER OF TERMS YOU WANT IN FIBONACCI SERIES : ");
                int n = scanner.nextInt();
                for(int i = 0; i<n; i++){
                    System.out.println("THE FIBONACCI SERIES IS : "+fibo(i));
                }
                scanner.close();
    }
}
