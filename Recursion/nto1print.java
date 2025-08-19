public class nto1print {
    public static void printDec(int n){
     
        if(n==1){  // Base case );
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
         printDec(n-1);
    }
   
    public static void main(String[] args) {
        int n=10;
        printDec( n);

       
    }
}
