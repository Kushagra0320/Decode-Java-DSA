package Arrays;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target element:");
        int x= sc.nextByte();
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found.");
        }

    }
}
