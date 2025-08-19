

public class Sumof1stNnaturalnumber {
    public static int calsum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=calsum(n-1);
        int Sn=Snm1+n;
        return Sn;
    }
    public static void main(String[] args){
        System.out.print(calsum(5));
    }
}
