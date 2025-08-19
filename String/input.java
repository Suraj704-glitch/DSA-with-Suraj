import java.util.*;
public class input {
    public static void printstring(String str ){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) +" ");
        } 
    } 
    public static void main(String [] args ){
         char arr[]={'a','b','c','d'};
        String str="xyz@#4abcd";
        String str2=new String("xyz");
        Scanner sc=new Scanner(System.in);
        String firstname="SURAJ";
        String middname="KUMAR";
        String lastname="YADAV";
        String fullname=firstname+ " "+ middname + " "+ lastname;
        printstring(fullname);

    }
}
