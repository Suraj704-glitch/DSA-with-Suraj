import java.util.HashSet;
import java.util.Iterator;
public class HashSet_Implementations {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(4);
        hs.add(0);
        
        hs.add(70);
        // System.out.println(hs);

        // For Iteration on the set using Iterator;
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
 
        System.out.println();
        hs.remove(70);
          System.out.println(hs);
          System.out.println( hs.contains(90)) ;
          
          System.out.print(hs.size()+" ");
        // hs.clear();
        //   System.out.println(hs.isEmpty());
          
    }
}
