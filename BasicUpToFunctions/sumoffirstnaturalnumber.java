    import java.util.*;
public class sumoffirstnaturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,val=1;
        while(val<=n){
            sum=sum+val;
            val++;
        }
        System.out.println(sum);

    }
}
