package Patterns;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        Scanner Sc=new Scanner(System.in);
        int m = Sc.nextInt();//rows and cls
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                System.out.print ((char)(j+64) +" ");// to print alphabets we write ((char)(j+64) + " ");
                // System.out.print(i + " "); / 1 1 1 1
            }
            System.out.println();// for next line
        }

    }
}

