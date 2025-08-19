import java.util.Arrays;
import java.util.*;
public class Min_Sum_AbsoluteDiff {
    public static void main(String[] args) { // 0(nlogn)
        int A[]={1,8,3,6};
        int B[]={4,9,5,7};

        Arrays.sort(A); // {1,3,6,8} // logn
        Arrays.sort(B); // {4,5,7,9}  // logn
        int minsum=0;
        for(int i=0;i<A.length; i++){
            minsum+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Minmum Absolute Sum = "+minsum);
    }
}
