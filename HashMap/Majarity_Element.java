import java.util.HashMap;
import java.util.*;
public class Majarity_Element {
    public static void main(String [] args){
        int arr[]={1,3,2,5,1,4,3,1,5,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];// key
          if(hm.containsKey(num)){// key are alrady are present in the Map
            hm.put(num,hm.get(num)+1);
          }else{
           hm.put(num,1);
          }
        }
        Set<Integer> keys=hm.keySet();

        for(Integer k:keys){ // for(Integer k: hm.keySet()){....}
            if(hm.get(k)>(arr.length)/3){
            System.out.println("key: "+k+ " Value: "+hm.get(k));
        }
    }
    }
}
