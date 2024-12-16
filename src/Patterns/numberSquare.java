package Patterns;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        Scanner Sc=new Scanner(System.in);
        int m = Sc.nextInt();//rows and cls
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                System.out.print(j+" ");// to print numbers we write j;
               // System.out.print(i + " "); / 1 1 1 1
            }
            System.out.println();// for next line
        }

    }
}

