package Patterns;

import java.util.Scanner;

public class MixTriangle {
    public static void main(String[] args) {
            System.out.println("Enter rows and columns");
            Scanner Sc=new Scanner(System.in);
            int m = Sc.nextInt();//rows and cols
            for(int i=1;i<=m;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j +" ");
                }
                System.out.println();// for next line
            }

        }
    }


