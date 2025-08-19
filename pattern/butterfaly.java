public class butterfaly {
    public static void first_halfbutterflay(int n){

        //for outer loop
        for(int i=1; i<=n; i++){
            //for first side wali star
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            //for space 
                for(int j=1; j<=2*(n-i);j++){
                    System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//second side wali star
                System.out.print("*");
            }
            System.out.println();
        }
    
    //second half buttrer flay
    
        //outer loop
        for(int i=n;i>=1; i--){
            //inner lop same as 1st_halfbutterflay 
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            //for space 
                for(int j=1; j<=2*(n-i);j++){
                    System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        first_halfbutterflay(8);
        
}
}