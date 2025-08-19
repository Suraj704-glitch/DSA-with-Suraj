import java.util.*;
public class Queue_using_Deque {
    static class Queue{
      static  Deque<Integer> deque=new LinkedList<>();

        public static void add(int data){ // 0(1)
            deque.addLast(data);

        }
        public static int remove(){ // 0(1)
           return deque.removeFirst();
        }
        public static int peek(){ // 0(1)
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue  q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Peek Ele= "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
