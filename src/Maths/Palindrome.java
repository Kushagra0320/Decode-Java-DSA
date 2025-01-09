package Maths;
import java.util.*;

public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int duplicate=num;// for storing the original number,imp step
        int rev=0;
        while(num>0){
            int lastdigit=num%10;
            rev=(rev*10)+lastdigit;
            num=num/10;

        }
        if(rev==duplicate)
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is only reverse");
        System.out.println(rev);



    }
}
