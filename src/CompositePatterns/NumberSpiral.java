package CompositePatterns;
import java.util.*;

public class NumberSpiral {
    public static void main(String[] args) {
        System.out.println("Enter Rows and cols");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){//rows
            for(int j=1;j<=2*n-1;j++){//spaces
                int a=i,b=j;
                if(i>n) a=2*n-i;// updation of i
                if(j>n) b=2*n-j;// updation of j
                System.out.print(n+1-Math.min(a,b)+" ");
            }
            System.out.println();
        }


    }
}
