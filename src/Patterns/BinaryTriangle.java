package Patterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        Scanner Sc=new Scanner(System.in);
        int m = Sc.nextInt();//rows and cols
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){ //for triangle j<=i
                if(i%2==1){
                    if(j%2==1)
                System.out.print(1 +" ");
                else
                    System.out.print(0 + " ");}
                else
                if(i%2==0 && j%2==0)
                System.out.print(1+" ");
                else
                    System.out.print(0 + " ");
            }

            System.out.println();// for next line
        }

    }}

