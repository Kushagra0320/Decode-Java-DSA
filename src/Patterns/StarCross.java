package Patterns;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();//rows and cols
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == j || i+j==m+1)// for cross pattern, here first is for right diagonal and second for left.
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }

            System.out.println();// for next line
        }

    }}

