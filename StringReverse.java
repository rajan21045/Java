import java.util.*;
public class StringReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String ( in lower case without space ) : ");
        String A=sc.nextLine();
        String reversed = new StringBuilder(A).reverse().toString();
        if(A.equals(reversed))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}



