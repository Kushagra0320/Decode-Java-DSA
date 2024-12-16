package Sorting;

public class BubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);
        /* Bubble Sort-> 1
        for (int x = 0; x <= n - 1; x++) {// this is for multiple passes i.e works for all cases
            for (int i = 0; i < n - 1; i++) {// this is for single pass
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                //print(arr);
            }
           // print(arr);

        }
        print(arr);
    }*/
        /*Bubble Sort-> 2
        for (int x = 0; x <= n - 1; x++) {// this is for multiple passes i.e works for all cases
            for (int i = 0; i < n - 1-x; i++) {// optimisation of inner loop
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                //print(arr);
            }
            // print(arr);

        }
        print(arr);
    }*/
        // Bubble Sort Optimised
        for (int x = 0; x <= n - 1; x++) {// this is for multiple passes i.e works for all cases
            boolean flag=true;
            for (int i = 0; i < n - 1-x; i++) {// optimisation of inner loop
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag=false;
                }
                }
            // check if arr is sorted or not
            if(flag==true){
                System.out.println("Array is sorted");
                break;
            }
        }
        print(arr);
    }
}






