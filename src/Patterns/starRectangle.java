package Patterns;
import java.util.*;

public class starRectangle {
    public static void main(String [] args){
        System.out.println("Enter rows and columns");
        Scanner Sc=new Scanner(System.in);
        int m = Sc.nextInt();//rows
        int n= Sc.nextInt();//cols
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();// for next line
        }

    }
}
