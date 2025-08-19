import java.util.*;
public class Sets {
    public static void main(String []args){
        HashSet<String> hs=new HashSet<>();
        hs.add("India");
        hs.add("Nepal");
           hs.add("US");
            hs.add("America");
             hs.add("AntarCuttica");
              hs.add("Arunachal Pradesh");
               hs.add("Rusia");
        // iterations by Iterator
        System.out.println("Iterations by Iterator");
        Iterator it=hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        // Iteration by inhance loops
        System.out.println("Iterations by Enhance loop");

        for(String s:hs){
            System.out.println(s);
        }

        System.out.println("Implimentations by Linked hashSet it's Store Shortest data in the Set Due to some extra propety ");
         LinkedHashSet<String> lhs=new LinkedHashSet<>();

          lhs.add("India");
          lhs.add("Nepal");
           lhs.add("US");
            lhs.add("America");
             lhs.add("AntarCuttica");
              lhs.add("Arunachal Pradesh");
               lhs.add("Rusia");
         System.out.println("Iterations by Iterator");
           Iterator lit=lhs.iterator();
             while (lit.hasNext()) {
               System.out.println(lit.next());
        }

        // Iteration by inhance loops
        System.out.println("Iterations by Enhance loop");
               for(String ls:lhs){
                  System.out.println(ls);
                  }
                  System.out.println("TreeSet");
                  TreeSet<String> ts=new TreeSet<>();
                  ts.add("India");
                  ts.add("Nepal");
                  ts.add("US");
                  ts.add("America");
                  ts.add("AntarCuttica");
                  ts.add("Arunachal Pradesh");
                  ts.add("Rusia");

                  System.out.println("HashSet"+hs);
                  System.out.println("LinkedHashSet"+lhs);
                  System.out.println("HashSet"+ts);
    }
}
