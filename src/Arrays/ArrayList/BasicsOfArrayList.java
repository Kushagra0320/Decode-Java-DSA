package Arrays.ArrayList;
import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>arr= new ArrayList<>(6);//Declaration of ArrayList
        arr.add(0,10);//Initialisation
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.print(arr+"");//To print complete arraylist or all the elements
        /*for (int i = 0; i < 5; i++) {

            System.out.println(arr.get(i)+"");// To print a particular element

        }*/
        arr.set(2,300);// to modify value at a particular index
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(2));

        }
        arr.add(90);
        System.out.println(arr);
    }
}
