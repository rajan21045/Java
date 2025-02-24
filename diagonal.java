// Sum of Diagonal Element
public class diagonal {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int i,sum=0;
        for (i = 0; i < arr.length; i++) {
                sum +=arr[i][i];
        }
        System.out.println("Sum of diagonal elements is: " + sum);
    }
}
