package CompositePatterns;
import java.util.*;

public class Rhombus {
    public static void main(String[] args) {
        System.out.print("Enter no. of rows and columns");
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= m ;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }}}
