package Arrays;
import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr={30,40,50,60,70,80};
        int n=arr.length;
        int k=5;
        int[]ans= new int[n];
        if(k>n){
            k=k%n;
        }
        System.out.print(arr+" ");

        for (int i = n-k; i < n ; i++) {
            ans[i]=arr[i];
        }
        for (int value : ans) {
            System.out.print(value + " ");
        }
    }
}
