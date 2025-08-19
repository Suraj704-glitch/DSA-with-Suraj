import java.util.*;
public class Duplicate_parentheses {
    public static boolean duplicateparentheses(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0; i<str.length();i++){
        char ch=str.charAt(i);
        if(ch==')'){
             
            int count=0;
            while(s.peek()!='('){ 
                s.pop();
                count++;
            }
            if(count<1){
                return true;
            }
            s.pop();

        }
        else{
            s.push(ch);
        }
        }
        
        return false;
    }
    public static void main(String[] args) {
        // alwase given Closing String ;
        String str1="((a+b))";
        String str2="((a-b)+((s-s)))";
        System.out.println(duplicateparentheses(str2));
        //duplicateparentheses(str1);
    }
}
