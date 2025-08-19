import java.util.*;
public class largestofthreenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
    // if(a>=b&&a>=c){
    //     System.out.println("largest number is : "+ a);
    // }
    //     else if(b>=c&&b>=a){
    //     System.out.println("largest number is : "+ b);}
    //     else{
    //     System.out.println("largest number is : "+ c);
    // }/


    
    if(a>b){
        if(a>c){
            System.out.println("largeat number is :" +a);

        }
        else{
            System.out.println("largest number is : " +c);
        }
    } 
       else if(b>c){
            System.out.println("largesh number is : " +b);

        }
        else{
            System.out.println("largest number is :" +c);
        }
        
    }
    
    }
