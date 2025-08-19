import java.util.*;
public class itrationINhashmap {
    public static void main(String [] args){
        HashMap<String ,Integer> hm=new HashMap();

        hm.put("india",150);
        hm.put("Chaina",200);
        hm.put("US",50);
        System.out.println(hm);

        System.out.println(hm.entrySet());
           
        //.  Iterations by keyset method 
        Set<String> keys=hm.keySet();
        
            System.out.println(keys);

            for (String k : keys) {
                System.out.println("Key= "+ k +  " value=" + hm.get(k));
             //  System.out.println(hm.entrySet());
            }

            // Or in for Loop
            for(String k : hm.keySet()){
                System.out.println("Key ="+k +"Value="+hm.get(k));
            } 

            // By the entry foreach function
            
                System.out.println();
            
            for(Map.Entry<String,Integer> entry : hm.entrySet()){
                System.out.println("Key ="+entry.getKey() +"value =" +entry.getValue());
            }
           
         }
}
