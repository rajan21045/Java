//Write a Java program to count distinct elements in an array.

import java.util.Arrays;
public class distinct {
    public static void main(String[] args){
        int[] arr = {12, 13, 18, 1, 94, 4, 3};

        // Sort the array to bring duplicate elements together
        Arrays.sort(arr);

        int count = 1; // Start with 1 because the first element is always distinct
        for(int i = 1; i < arr.length; i++){
            // If the current element is different from the previous one, it's distinct
            if(arr[i] != arr[i-1]) {
                count++;
            }
        }
        System.out.println("THE NUMBER OF DISTINCT ELEMENTS IS " + count);
    }
}
