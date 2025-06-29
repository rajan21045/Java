import java.util.Scanner;
public class shoppingCartProgram {
    public static void main(String[] args) {

        //Shopping Card Program
        Scanner sc = new Scanner(System.in);
        String items;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What Item Would You Like To Buy:  ");
        items = sc.nextLine();
 
        System.out.print("What Is The Price For Each?: ");
        price = sc.nextDouble();

        System.out.print("How Many Would You Like?: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou Have Bought "+quantity + " "+ items + "/s.");
        System.out.println("Your Total Is "+ currency +total);


        sc.close();

    }
}
