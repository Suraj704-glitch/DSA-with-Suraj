import java.util.*;
public class Reverse_string {
    public static void reverse_string(String str){
        Stack<String> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(String.valueOf(str.charAt(idx)));
            idx++;
        }

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    // By Saradha mam
    public static String reverse_String_BY_SARADHA(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;

        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder("");
        while(!s.isEmpty()){
            sb.append(s.pop());

        }
       return sb.toString();
    }
    public static void main(String[] args) {
        String str="abcd";
         reverse_string(str);//
       String curr= reverse_String_BY_SARADHA(str);
       System.out.println(curr);
    }
}
