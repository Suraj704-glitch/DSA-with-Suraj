

public class one_to_n {
    public static void printInc(int n){//on the base of my Thinking 
        //n=1;
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printInc(n+1);
    }
   public static void printIntsardha(int n){
     if(n==1){
        System.out.print(n);
        return;
     }   
    printIntsardha(n-1);
        System.out.print(n +" ");
   }

    public static void main(String[] args){
        printIntsardha(10);
        //printInc(1);
    }
}
