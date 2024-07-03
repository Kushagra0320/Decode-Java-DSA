package Arrays.TwoDimensionalArrays;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
            int m = arr.length;
           int n = arr[0].length;
           // taking input
            for (int i = 0; i < m; i++) {//rows
                for(int j=0;j<n;j++) {//columns
                    arr[i][j] = sc.nextInt();


                }
            }
            // taking output
            for (int i = 0; i < m; i++) {// rows
                for (int j = 0; j < n; j++) {//columns
                   System.out.print(arr[i] [j] + " ");
                }

            //}
           /* for(int [] ele : arr){
                for (int x:ele){
                    System.out.println(x + " ");
                }*/
            }
            System.out.println();

        }
    }

