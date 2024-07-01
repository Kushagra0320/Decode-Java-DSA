package Arrays;
//this is a brute force or reversing an array by using an extra variable
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");

        }
        System.out.println();

        //reversing the array
        for (int i= 0; i<n/2; i++)
        {

            int k = n - 1 - i;
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
    }
}