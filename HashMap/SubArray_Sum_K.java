import java.util.*;
public class SubArray_Sum_K {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};

        int ans=0,sum=0,k=-10;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            hm.put(0,1);
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}
