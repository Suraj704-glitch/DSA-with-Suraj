   // import java.util.*;
public class hoolow_rombous {
        public static void rombous(int n){
            //for outter loop
            for(int i=1; i<=n; i++){
                if(i>=2&&i<=n-1){
                    //for starting ka space 
                    for(int j=1;j<=n-i; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for(int j=1; j<=n-2;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
                
            else
             {
                //for space
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");

                }
                //for star 
                for(int j=1;j<=n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }     
            }
        }
        public static void rombousbysardhakhapra(int n){
            //for outer loop
            for(int i=1; i<=n; i++){
            
                //inner loop  spac
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");}


                //aplly boundary coundition for hollow ractangal
                for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
              System.out.println();
        } 
    }

    public static void butterfly(int n){
        for(int i=1; i<=n; i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }


            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }


            for(int j=1;j<=i; j++){
                System.out.print("*");
            }


            System.out.println();

        }


        //for second half
        for(int i=n; i>=1; i--){



            for(int j=1;j<=i;j++){
                System.out.print("*");
            }


            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }



            for(int j=1;j<=i; j++){
                
                
                
                System.out.print("*");
            }
        

            System.out.println();


        }


        }
    
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the row number :");
        // int n=sc.nextInt();
       // rombous(n);
        //rombousbysardhakhapra(n);
        butterfly(4);
    }    
}
