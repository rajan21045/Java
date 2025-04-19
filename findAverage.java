public class findAverage {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        double avg = average(arr);
        System.out.println("Average: " + avg);
        // Output: 25.0
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;  // Cast to double to get decimal average
    }
}
