import java.util.Scanner;
public class subString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String : ");
        String s = sc.nextLine();
        System.out.println("Enter A Starting And Ending Point of The String : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        if (end > s.length() || start < 0 || start > end) {
            System.out.println("Invalid start or end points! Cannot print the substring.");
        } else {
            String str = s.substring(start, end);
            System.out.println("Substring is: " + str);
        }
    }

}
