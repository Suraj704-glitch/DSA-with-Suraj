import java.util.*;
public class N_Ropes {

    // Greedy Approch  that is wronge 
    public static int  n_Ropes(int arr[]){ 
        Arrays.sort(arr);
        int ans=0;
        int cost=0;
        for(int i=0;i<arr.length;i++){

            ans+=arr[i];
            cost+=ans;
        }
        return cost-arr[0];
    }
   public static void main(String[] args) {
    int arr[]={2,3,3,4,6}; 
    System.out.println(n_Ropes(arr));
   } 
}
