import java.util.*;

public class callingfunction {//class mi chhi jitna function save jr lo 

//     public static void main(String[] args) {
//         int x = 6;
//         int y = 7;
//         int ans = sum(x, y); 
//         System.out.println(ans);  
//     }

//     static void sum(int x, int y) {

//         int sum = x + y;
  
    
// }
public static int calculate (int num1,int num2){//yhha pr do int numbers li kr sum krni ka kam kr rhi hai;
    int sum =num1 +num2;
   return sum;
      //ystem.out.println("sum is :  "+ sum);
 } 
      
      
      
      public static void main(String args []){
        Scanner sc=new Scanner(System.in);
System.out.print("Enter the number a :"  );
    int a=sc.nextInt();
    System.out.print("Enter the number : ");
    int b=sc.nextInt();
    int sum =calculate(a,b);
    System.out.println(" sum is : " +sum);
}
    
}