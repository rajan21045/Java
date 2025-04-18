import java.util.Arrays;
public class Largest {

    public static void secondla(int arr[]) {
        int size = arr.length;
        if (size < 2) {
            System.out.println("Invalid Input");
        } else {
            Arrays.sort(arr);
            System.out.println("Second largest element is: " + arr[size - 2]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        secondla(arr);
    }
}
