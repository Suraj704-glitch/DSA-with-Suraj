public class tailingproblem {
    public static int tilprob(int n){
        // Base case
        if( n==0||n==1){
            return 1;
        }
       // jb verticalchoise ho
        int fnm1=tilprob( n-1);
        //Horijontal ki liye
        int fnm2=tilprob(n-2);
       int totalway=fnm1+fnm2;
       return totalway;

    }
    public static int tilingprob(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        return tilingprob(n-1)+tilingprob(n-2);
    }
    public static void main(String[] args) {
        System.out.println( tilingprob(4));
    }
}
