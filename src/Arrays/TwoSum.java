package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={12,4,5,7,9,2};
        int x=9;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=i+1; j<n; j++){
                if (arr[i] + arr[j]==x) {
                    System.out.println(arr[i] + " " + arr[j]);


                }
            }


        }

    }
}
