package Patterns;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();//rows and cols
        int mid = m / 2 + 1;// for plus pattern
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == mid || j == mid)// for plus pattern
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }

                    System.out.println();// for next line
                }

        }}



