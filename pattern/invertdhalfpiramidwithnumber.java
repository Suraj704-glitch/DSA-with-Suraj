    import java.util.*;
public class invertdhalfpiramidwithnumber {
    public static void piramidnum(int n){
    
        //for outer loop
        for(int i=1; i<=n; i++){
            //for inner loop
            int num=1;//for number print 

           for(int j=1; j<=n-i+1; j++){//for inner loop 
                 
                System.out.print(num);
                num++;
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number of rows : ");
        int n=sc.nextInt();
        piramidnum(n);
    }
}
