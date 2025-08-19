public class printXkipowerN {
    public static int  xkipowerN(int x,int n){
        if(n==1){
            return x;
        }
        int isfindxn=xkipowerN( x, n-1);
        return x*isfindxn;
    }
    public static int npower(int x,int n){
        if(n==0){
            return 1;
                }
                return x*npower(x,n-1);
    }

    //optmizxed  solution  TC= 0(logn);
    public static int optpower(int x,int n){
        if(n==0){
            return 1;
        }
        //if n even ho to
        int halfpow=optpower( x, n/2);
        int halfpowsq=halfpow*halfpow;
        //if n odd ho to
        if(n%2!=0){
            halfpowsq=x*halfpow;
        }
        return halfpowsq;
    }



    public static void main(String[] args){
        System.out.println(xkipowerN( 2, 8));
        System.out.println(npower(2,8));
        System.out.println(optpower(2,8));
    }
}
