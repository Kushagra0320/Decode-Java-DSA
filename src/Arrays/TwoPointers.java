package Arrays;
//this is an optimise approach to reverse an array without using an extra array
public class TwoPointers {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int n= arr.length;
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] +" ");

        }
        System.out.println();
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");

        }

        
    }
}
