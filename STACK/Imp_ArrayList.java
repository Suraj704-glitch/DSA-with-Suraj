import java.util.ArrayList;
public class Imp_ArrayList {
    static class Stack {
       static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        // Push Operation
        public static void push(int data){ //0(1)
            
            list.add(data);// OR list.addLast(data);
            // ye auto metically last mi hi add krega
        }

        // POP Opretion 

        public static int pop(){// 0(1)
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // PeeK Opretion 
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }  
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(3);
        s.push(9);
        while(!s.isEmpty() ){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
