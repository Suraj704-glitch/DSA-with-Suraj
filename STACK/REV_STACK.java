import java.util.*;
public class REV_STACK {
    public static void extraMemory(Stack<Integer> s){
        Stack<Integer> news=new Stack<>();
        while(!s.isEmpty()){
              news.push(s.pop());
        }
        while(!news.isEmpty()){
            System.out.println(news.pop());
        }
    }


    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top=s.pop();
        by_recursion(s );
        s.push(top);
    }
    public static void by_recursion(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop();
        by_recursion(s);
        pushAtBottom(s,top);// top ko bottom pr add krenge;
    }



    public static void Stackprintln(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
        //   extraMemory(s);
         by_recursion(s);
        Stackprintln(s);

        

    }
}
