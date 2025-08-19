    import java.util.*;
public class solid_rombous {
    public static void rombous(int n){

        //for outtre loop
        for(int i=1; i<=n; i++){
        
        //for inner loop ki space
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");  
            }
                //for star
                for(int j=1;j<=n; j++ ){
                    System.out.print("*");
                }
                System.out.println();
            } 
        }
        public static void main(String[] args) {
            //for  taken input from user
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter  row number of your Solid_rombous :  ");
            int n=sc.nextInt();
            //calling the rombous function
            rombous(n);
        }
    }

