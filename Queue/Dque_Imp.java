import java.util.*;
public class Dque_Imp {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2);//2 1
        deque.addFirst(3);//3 2 1
        deque.addLast(4); // 3 2 1 4
        System.out.println(deque);
        System.out.println("First ele = " +deque.getFirst());
        System.out.println("Last ele = "+deque.getLast());
        
        deque.removeLast();
        deque.removeFirst();
        System.out.println(deque);
    }
}
