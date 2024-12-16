package Patterns;

import java.util.Scanner;

public class HorizontallyFlippedTriangle {
    public static void main(String[] args) {
        System.out.println("Enter rows and columns");
        Scanner Sc=new Scanner(System.in);
        int m = Sc.nextInt();//rows and cols
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m+1-i;j++){// for reverse triangle we used m+1-i
                System.out.print("*" +" ");
            }
            System.out.println();// for next line
        }

    }
}
