package CompositePatterns;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        System.out.print("Enter no. of rows and columns");
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int nsp=m-1;
        int nst=1;
        for (int i = 1; i <=m ; i++) {//rows
            for (int j = 1; j <= nsp; j++) {//spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {//stars
                System.out.print("*" + " ");
            }
            nsp--;
            nst+=2;
            System.out.println();
            //the above is another way to print star pyramid

        }
        nsp=1;
        nst=nst-4;// always works important remember point
        for (int i = 1; i <=m ; i++) {//rows
            for (int j = 1; j <= nsp; j++) {//spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {//stars
                System.out.print("*" + " ");
            }
            nsp++;
            nst-=2;
            System.out.println();}
}}
