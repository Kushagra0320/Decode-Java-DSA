package CompositePatterns;
import java.util.*;

public class StarPyramid {
    public static void main(String[] args) {
        System.out.print("Enter no. of rows and columns");
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }}}
