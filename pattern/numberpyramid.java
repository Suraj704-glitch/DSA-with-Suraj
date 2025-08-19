public class numberpyramid {    
    public static void pyramid(int n){
        //outer loop 
        for(int i=1; i<=n; i++){
            //space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //desending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //isending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }    
    public static void main(String[] args) {
        pyramid(5);
    }
}
