package Maths;
import java.util.*;
public class CountOddDigits {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number");
        int num=sc.nextInt();
        int countodd=0;
        while(num>0){
            int lastdigit=0;
            if(num%2==1)
                countodd=countodd+1;
            num=num/10;
        }
        System.out.println(countodd);

    }}
