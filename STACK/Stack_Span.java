import java.util.*;
public class Stack_Span {
    public static void spanstack(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);// only index(stoke ka) are store in the stack ;
        for(int i=1; i<stock.length;i++){
  
            int currprice=stock[i];
            while(!s.isEmpty() &&  currprice>stock[s.peek()]){
                s.pop();// smalle value ki index ko stack se delete krte jate hai
            }
            
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int preHigh=s.peek();
                span[i]=i-preHigh;
            }
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};

        int span[]=new int[stock.length];
         spanstack(stock,span);
         for(int i=0; i<span.length; i++){
            System.out.println(span[i]);
         }
    }
}
