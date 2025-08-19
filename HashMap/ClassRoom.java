 import java.util.*;
public class ClassRoom {
    public static void main(String []args){
        HashMap<String, Integer> hm=new HashMap<>();

        // insertionput 0(1)
        hm.put("india" ,100);
        hm.put("Chaina",150);
        hm.put("US",50);
        hm.put("amrica",200);

        System.out.println(hm);

        //  Get 0(1);
        //int parameter =hm.get("US");
        System.out.println(hm.get("US"));
        System.out.println(hm.get("Napal"));

        //containsKey("Key")  0(1)  
        System.out.println(hm.containsKey("Chaina"));

        System.out.println(hm.containsKey("Napal "));
        System.out.println();
        System.out.println();
        // remove(key)  0(1);

        System.out.println(hm.remove("amrica"));
        System.out.println(hm.remove("Napal"));
        System.out.println(hm);
    }
}
