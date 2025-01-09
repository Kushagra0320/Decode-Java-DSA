package Arrays.TwoDimensionalArrays;
import java.util.*;
public class setmatrixzero {
        public void setZeroes(int[][] arr) {
            int m=arr.length;int n =arr[0].length;
            boolean zeroRow=false;
            boolean zeroCol=false;
            boolean [] row=new boolean[m];
            boolean [] col=new boolean[n];
            // Check for 0th row
            for(int j=0;j<n;j++){
                if(arr[0][j]==0){
                    zeroRow=true;
                    break;
                }
            }
            // check for 0th col
            for(int i =0;i<m;i++){
                if(arr[i][0]==0){
                    zeroCol=true;
                    break;
                }
            }
            // marking 0 in the submatrix other than 0th row and 0th col
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0){
                        row[i]= true;
                        col[j]= true;
                    }
                }
            }
            // set the true rows to 0
            for(int i =0;i<m;i++){
                if(row[i]==true){
                    for(int j=0;j<n;j++){
                        arr[i][j]=0;
                    }
                }
            }
            // set the true cols to 0
            for(int j=0;j<n;j++){
                if(col[j]==true){
                    for(int i=0;i<m;i++){
                        arr[i][j]=0;
                    }
                }
            }
            // check for 0th row
            if(zeroRow==true){
                for(int j=0;j<n;j++){
                    arr[0][j]=0;
                }
            }
            // check for 0th col
            if(zeroCol==true){
                for(int i=0;i<m;i++){
                    arr[i][0]=0;
                }
            }


        }
    }

