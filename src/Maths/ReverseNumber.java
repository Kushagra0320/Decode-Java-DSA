package Maths;
import java.util.*;

public class ReverseNumber {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int lastdigit=num%10;
            rev=(rev * 10)+lastdigit;
            num=num/10;

        }
        System.out.println("The Reverse of the number is:" + rev);

    }}
