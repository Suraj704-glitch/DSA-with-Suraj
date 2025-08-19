import java.util.*;
public class Valid_Parenthesise {
    public static boolean valid_str(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0; i<str.length(); i++){
            
            char ch=str.charAt(i);
            // for Opning 
             if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
             }
             else{
                if(s.isEmpty()){ // meens string start by closing breket }||)||] se start ho
                return false;
                }
                 // Closing of stack
                    // found pair
                    if((ch==')'&&s.peek()=='(') // ()
                    ||(ch=='}'&&s.peek()=='{')  // {}
                    ||(ch==']'&&s.peek()=='[') ) // []
                    {
                        s.pop();
                    }
                    else{
                        return false;
                    }
                
             }
            }
        if(s.isEmpty()){
            return true;
        }
        else{
        return false;
        }
    }
   public static void main(String[] args) {
    String str="(){}[]]";
     boolean ch=valid_str( str);
     System.out.println(ch);
   } 
}
