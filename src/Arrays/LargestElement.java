package Arrays;
import java.util.*;
public class LargestElement {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n= sc.nextInt();
        System.out.println("Enter elements of array:");
        int [] arr= new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        /*
        int max= arr[0];
        for (int i = 1; i < n ; i++) {
            if(arr[i]>max){
                max=arr[i];
                System.out.println("Max element is :" + max);
            }
            else{
                max=arr[0];
                System.out.println(max);
            }
            }
        */
        /*
        This method will not work for negative array.
        int max=-1;
         for (int i = 1; i < n ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Max element is :" + max);
            } else {
                max = arr[0];
                System.out.println(max);
            }
        }
        */
        int max=Integer.MIN_VALUE;
        for (int i = 1; i < n ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println("Max element is :" + max);
            } else {
                max = arr[0];
                System.out.println(max);
            }
        }

    }
}
