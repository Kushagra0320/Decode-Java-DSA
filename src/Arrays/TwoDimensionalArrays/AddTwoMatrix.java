package Arrays.TwoDimensionalArrays;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] a = {{2, 4, 3}, {3, 2, 4}};
        int[][] b = {{3, 1, 2}, {2, 4, 1}};
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];

        // Matrix addition: Calculate the sum of corresponding elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print the resulting matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}


