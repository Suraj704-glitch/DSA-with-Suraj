    import java.util.*;
public class invertpyramid {
    public static void invertedpiyramid(int row) {
        
         //outer loop for row
         for(int i=1;i<=row;i++){
            //for space print
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
           //for star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
         
        }
            public static void main(String args []){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter your number of row :");
                int n=sc.nextInt();
                invertedpiyramid(n);
            }
}
