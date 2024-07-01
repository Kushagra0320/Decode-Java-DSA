package Arrays;
import java.util.*;

public class SortZeroesandOnes {
    public static void main(String[] args) {

        int[] arr={1,1,0,1,1,0,0,0,1,0};
        int n=arr.length;
        /*This is method 1 or Two pass method as we use two loops
        int noOfZeroes=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                noOfZeroes++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i<noOfZeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
            System.out.print(arr[i] + " ");

        }*/

        // Now we will use the more optimised merthod i.e the one pass method

        int i=0;
        int j=n-1;
        while(i<j){//if we take i<=j then elements at the correct place will also swap and solution will be wrong.
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;// for equal no. of zeroes and ones.
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;// swapping
                arr[j]=1;//swapping
                i++;
                j--;
            }}
            for (int k = 0; k < n ; k++) {
                System.out.print(arr[k] + " ");}
            System.out.println();

        }

    }

