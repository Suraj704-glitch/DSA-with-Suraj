import java.util.*;

public class taking {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
         String name=sc.next(); //.next only one word input liga
        System.out.println(name);
       Scanner sc1=new Scanner(System.in);
        String name1=sc1.nextLine();//.nextLine ka use whole line ko print kerne ki liye kiya jata hai
        System.out.println(name1);
       Scanner sc2=new Scanner(System.in);
        int number=sc2.nextInt();//use for number as a input
           System.out.println(number);
          Scanner sc3=new Scanner(System.in);
            float price=sc3.nextFloat();//use for frectinal value
            System.out.println(price);

    }
}
