package Arrays.TwoDimensionalArrays;

public class sumofallelements {
    public static void main(String[] args) {
        int sum=0;
        int[][]arr={{1,11,34},{2,32,56},{98,74,89}};
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                sum+=arr[i][j];
            }}
        System.out.println(sum);
    }
}
