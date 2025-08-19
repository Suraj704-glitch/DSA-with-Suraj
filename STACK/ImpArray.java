public class ImpArray {
    static class Stack{
       static int arr[];
       static int size;
       static int top; 
       Stack(int n){
        arr=new int[n];
        size =n;
        top=-1;
       }

       public static boolean isEmpty(){
        return top==-1;
       }
       public static void push(int data){
        if(top==size-1){
            System.out.println("Stack are full/overflow");
            return ;
        }
        top=top+1;
        arr[top]=data;
       }

       public static int pop(){
          if(isEmpty()){
            System.out.println("stack is Empty/underflow");
            return -1; 
        }

        int val=arr[top];
        top=top-1;
        return val;
       }  

       public static int peek(){
       if(isEmpty()){
        System.out.println("Stack are Empty");
        return -1;
       }
       return arr[top];
       }
  }
    public static void main(String[] args) {
        Stack s=new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
