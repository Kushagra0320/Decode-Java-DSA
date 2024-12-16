package Patterns;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        Scanner Sc=new Scanner(System.in);
        int m = Sc.nextInt();//rows and cols
        int a=1;//Floyd Triangle
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){ //for triangle j<=i
                System.out.print(a +" ");
                a++;// we can also directly print a++ as it is a post decrement operator
            }
            System.out.println();// for next line
        }

    }
}
