import java.util.*;
public class Stack_Using_two_Queue {
    public static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        public static void push(int data){ // 0(1); // last mi add krna hai to jo EMPTY nhi hai us mi add kr denge
            if(!q1.isEmpty()){ 
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int pop(){ // 0(n)
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int top=-1;
             if(!q1.isEmpty()){ 

                while(!q1.isEmpty()){
                      top=q1.remove();
                    if(q1.isEmpty()){ // jb last element aye to break kr jao ;
                        break ;       // yani q2 mi last element ko add nhi krenge;
                    }
                    q2.add(top);
                }
             }
             else{ // q2 is not empty
                while(!q2.isEmpty()){
                     top=q2.remove();
                    if(q2.isEmpty()){
                        break ;
                    }
                    q1.add(top);
                }
             }
             return top;
        }

        public static int peek(){ // 0(n)
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }  
            int top=-1;
             if(!q1.isEmpty()){ 

                while(!q1.isEmpty()){
                      top=q1.remove();
                    
                    q2.add(top);
                }
             }
             else{ // q2 is not empty
                while(!q2.isEmpty()){
                     top=q2.remove();
                    
                    q1.add(top);
                }
             }
             return top;
        }
    }


    // For Add 0(n) and Remove&Peek() 0(1) 

    static class StackB {
       static  Queue<Integer> q1=new LinkedList<>();
       static  Queue<Integer> q2=new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty()&&q2.isEmpty();
        }

        public static void push(int data){
            
            while(!q1.isEmpty()){
                 q2.add(q1.remove());

            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        public static int pop(){ //0(1)
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return q1.remove();
        }
 
        public static int peek(){ //0(1)
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return q1.peek();
        }

    }



    public static void main(String[] args) {
        
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
        System.out.println();
        
        StackB sb=new StackB();
        sb.push(1);
        sb.push(2);
        sb.push(3);
        while(!sb.isEmpty()){
            System.out.println(sb.peek());
            sb.pop();
    }
}
}
