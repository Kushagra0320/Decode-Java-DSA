package Maths;
import java.util.*;

public class LargestDigit {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number");
        int num=sc.nextInt();
        int largest=0;
        while(num>0){
            int lastdigit=num%10;
            if(lastdigit>largest)
                largest=lastdigit;
            num=num/10;
        }
        System.out.println(largest);

    }
}
