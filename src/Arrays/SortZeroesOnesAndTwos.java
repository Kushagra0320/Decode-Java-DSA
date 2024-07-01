package Arrays;

public class SortZeroesOnesAndTwos {

    public static void main(String[] args) {
        // Method -1 using two pass solution

        int [] arr={0,1,2,0,1,2,1,2,1,2,0,0};
        int n = arr.length;
        /*
        int noOfZeroes=0;
        int noofOnes=0;

        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                noOfZeroes++;
            }
            if(arr[i]==1){
                noofOnes++;
            }
        }
        for (int i = 0; i <n ; i++) {
            if(i<noOfZeroes) arr[i]=0;
            else if (i<noOfZeroes+noofOnes) {
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+ " ");

        }*/

        int mid=0; int low=0; int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
            mid++;}
            else{//arr[mid]==2
                   int temp=arr[mid];
                   arr[mid]=arr[high];
                   arr[high]=temp;
                   high--;
                }
            }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");

        }



        }

    }

