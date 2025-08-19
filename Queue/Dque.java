import java.util.*;
public class Dque {
    
    public static void main(String[] args) {
        Dque<Integer> deque=new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2);//2 1
        deque.addFirst(3);//3 2 1
        deque.addLast(4); // 3 2 1 4
        System.out.println(deque);
    }
}
