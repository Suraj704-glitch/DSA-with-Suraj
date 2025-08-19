import java.util.*;

public class ItinerayFrom_Tikets {
    public static String getStart(HashMap<String ,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();//<to,from>
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){// yani mumbai tk jani ka tikext nhi hai
          if (! revMap.containsKey(key)){
            return key;
          }
        }
        return null;
    }
    public static void main(String[] args) {
      HashMap<String ,String> tickets=new HashMap<>();// <from,to>
      tickets.put("Chennai","Banguluru");
       tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
         tickets.put("Delhi","Goa");
        String start=getStart(tickets);
        
        for(String key:tickets.keySet()){
            System.out.println(start+"->" + tickets.get(start));
            start=tickets.get(start);
            System.out.println();
        }

    }
}
