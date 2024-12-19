package Patterns;

import java.util.Scanner;

public class VerticalFlippedTriangle {
    public static void main(String[] args) {
            System.out.println("Enter rows and columns");
            Scanner Sc=new Scanner(System.in);
            int m = Sc.nextInt();//rows and cols
            for(int i=1;i<=m;i++){
                for(int j=1;j<=m;j++){ //for flipped triangle j<=m
                    if(i+j>m)
                        System.out.print("*"+" ");
                    else
                        System.out.print(" "+" ");
                }
                System.out.println();// for next line
            }

        }
    }

