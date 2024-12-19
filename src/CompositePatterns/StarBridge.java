package CompositePatterns;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        System.out.print("Enter no. of rows and columns");
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        for (int i = 1; i <2*m-1 ; i++) {
            System.out.print("*"+" ");// first line of stars
        }
        System.out.println();
        m--;

        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <= m +1- i; j++) {//stars
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2*i-1; j++) {//spaces
                System.out.print(" "+ " ");
            }
            for(int j=1;j<=m+1-i;j++){//stars
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }}

