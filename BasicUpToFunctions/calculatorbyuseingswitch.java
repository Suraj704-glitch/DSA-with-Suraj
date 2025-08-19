        import java.util.*;

public class calculatorbyuseingswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of a :" );
        int a=sc.nextInt();
        System.out.print("enter value of b :");
        int b=sc.nextInt();
        System.out.println("enter oprator:");
        char oprator=sc.next().charAt(0);
        switch (oprator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            default :System.out.println("not a advancecalculator");
        }
    }
}
