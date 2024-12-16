package Patterns;

import java.util.Scanner;

public class OddTriangle {
        public static void main(String[] args) {
            System.out.println("Enter rows and columns");
            Scanner Sc=new Scanner(System.in);
            int m = Sc.nextInt();//rows and cols
            for(int i=1;i<=m;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(2*j-1 +" ");// method 1
                    // method 2
                    // for(int j=1;j<=2*i-1;j+=2)
                    // method 3 = It can also be used for even odd triangle
                    // for(int i=1;i<=m;i++){a=1;for(int j=1;j<=i;j++){System.out.print(a+" ");a+=2;
                }
                System.out.println();// for next line
            }

        }
    }

