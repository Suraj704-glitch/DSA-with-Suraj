import java.util.LinkedList;
public class JCF {// java collection freamwork;
    public static void main(String [] args){
        // create LinkedList --> only use Object 
        LinkedList<Integer> ll=new LinkedList<>();
        // ADD in LinkedList
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);
        // REMOVE In LinkedList 
        ll.removeLast();
        ll.removeFirst(); // OR ll.remove();
        ll.add(1,8); // spacfic position pr 
        System.out.println(ll);
    }
    
}
