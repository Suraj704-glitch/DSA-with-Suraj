import java.util.*;
public class Imp_by_JCF {
    // JCF mi push(data)/pop()/peek()/isEmpty()
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
       s.push(2);
       s.push(3);
       s.push(7);
       s.push(0);
       while(!s.isEmpty()) {
         System.out.println(s.peek());
         s.pop();
       }
    }
}
