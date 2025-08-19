import java.util.ArrayList;

public class Operations {
    public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
     // for add element in list 
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.println(list);
    System.out.println("Size of list = " +list.size());
    // for get element at spesific posion 
    System.out.println(list.get(2));

    // for Remove element at spesific posions 
    list.remove(3);
    System.out.println(list);

    //Set Element at index
    list.set(3,7);
    System.out.println(list);
    System.out.println("Size of list = " +list.size());
    //For Contain Element  True OR False;
    System.out.println(list.contains(78));

    // Some Spacial Add Property;
    list.add(3,10);
    System.out.println(list);

    //for Size 
    System.out.println("Size of list = " +list.size());
}
}
