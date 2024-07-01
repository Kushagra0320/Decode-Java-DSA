package Arrays;
import java.util.*;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int min=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<min){
                min=arr[i];
                System.out.println("Minimum element is:" + min);
                break;
            }
            else{
                min=arr[0];
                System.out.println(min);
            }


        }
    }
}
