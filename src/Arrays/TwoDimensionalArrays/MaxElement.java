package Arrays.TwoDimensionalArrays;

public class MaxElement {
    public static void main(String[] args) {
        int[][]arr={{1,11,34},{2,32,56},{98,74,89}};
        int m=arr.length;
        int n=arr[0].length;
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                mx=Math.max(mx,arr[i][j]);
            }}
        System.out.println(mx);
    }
}
