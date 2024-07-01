package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] a={12,34,54,67,87,98};
        int []b={13,14,35,65,86,94};
        int n = a.length + b.length;
        int []c=new int[n]; // remember to initialize like this
        int i =0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                k++;i++;
            }
            else{
                c[k]=b[j];
                k++;j++;
            }

        }
        if(i==a.length){// if all elements in array 'a' are traversed
            while(j<b.length){
                c[k]=b[j];
                k++;j++;
            }
        }
        if(j==b.length){// if all elements in array 'b' are traversed
            while(i<a.length){
                c[k]=a[i];
                k++;i++;
            }
        }
        for(int l=0;l<n;l++){
            System.out.print(c[l] + " ");

        }

    }
}
