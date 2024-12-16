package Sorting;

public class SelectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr={1,5,3,2,4};
        int n=arr.length;
        print(arr);
        //Selection Sort
        for (int i = 0; i <n-1 ; i++) {
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = i; j < n ; j++) {
                if(arr[j]< min){
                    min=arr[j];
                    mindx=j;
                }

            }
            // swap arr[i] and mindx
            int temp= arr[i];
            arr[i]= arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);
    }
}
