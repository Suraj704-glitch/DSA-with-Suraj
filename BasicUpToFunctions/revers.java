    import java.util.*;
public class revers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int rev=0;
        // while(n>0){
        //     int lastdigit=n%10;
        //     rev=rev*10 +lastdigit;
            
        //     n=n/10; 
        //  }
        //   System.out.print(rev);
        int d1,d2,d3,d4,d5;
        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        d3=n%10;
        n=n/10;
        d4=n%10;
        n=n/10;
        d5=n%10;
        n=n/10;
        int rev=d1*10000 +d2*1000 +d3*100 +d4*10 +d5;
        System.out.println(rev);
    }
    
}