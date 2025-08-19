import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(0);
    System.out.println(list);

    //For sorting
    Collections.sort(list);
    System.out.println("Assendiing Order " +list);

    //For decending Order
    Collections.sort(list,Collections.reverseOrder());
    System.out.println("Reverse Order " + list);
    }
    
}
