public class factorial {
    
    public static int factorial (int n){
            int f=1;
            for(int i=1; i<=n; i++){
            f=f*i;
            }
            return f;
    }
    public static int bincoff(int n,int r){
        int n_fact= factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int bincoff = n_fact/(r_fact*nmr_fact);
        return bincoff ;
    }
    public static void main(String[] args) {
    //    int ans= bincoff(5,4);
    //    System.out.println("your Binomial coefficiant is : " + ans);
    System.out.println("your binomial coifficiant is:  " +bincoff(5,4));
    }
}
