package Arrays;
import java.util.*;
public class SecondLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; // Initialize max with the first element
        int smax = Integer.MIN_VALUE;

        for (int j = 0; j < n; j++) {
            if (arr[j] > max) {
                smax = max; // Update second maximum
                max = arr[j]; // Update maximum
            } else if (arr[j] > smax && arr[j] != max) {
                smax = arr[j];
            }
        }

        System.out.println("Second maximum value: " + smax);
    }
}