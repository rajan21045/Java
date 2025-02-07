// Program to check whether the given number is prime or not
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
                   Scanner sc = new Scanner(System.in);
                   System.out.println("ENTER THE NUMBER TO CHECK WHETHER IT IS PRIME OR NOT : ");
                   int n = sc.nextInt();
                   int count = 0;
                   for(int i =0 ; i>n; i++)
                   {
                    if(n%i==0)
                    count++;
                   }  
                   if(count==2)
                   System.out.println("THE NUMBER IS PRIME");
                   else
                   System.out.println("THE NUMBER IS NOT PRIME");
                   sc.close();               
    }
}