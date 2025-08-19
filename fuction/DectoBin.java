public class DectoBin {
    public static void BinNum(int n){
        int bin=0,power=0;
       while(n>0){       
        int rem=n%2;
        bin=bin+(rem*(int)Math.pow(10,power));
        power++;
        n=n/2;
       }
       System.out.println(bin);
    }
   public static void main(String[] args) {
    BinNum(150);
   } 
}
