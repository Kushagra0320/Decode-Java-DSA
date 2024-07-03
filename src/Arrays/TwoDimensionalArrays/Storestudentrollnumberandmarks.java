package Arrays.TwoDimensionalArrays;
import java.util.*;

public class Storestudentrollnumberandmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2]; // Declare a 2D array with 4 rows and 2 columns

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) { // Corrected the loop condition here
                arr[i][j] = sc.nextInt(); // Read input values
            }
        }

// Print the array in matrix form
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}

