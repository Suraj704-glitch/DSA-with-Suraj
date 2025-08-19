    import java.util.Arrays;
public class salectionsort {
    public static  void salection_sort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int minpos=i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[minpos]){
                       minpos=j;
                }
                 //swap
                int temp=nums[minpos];
                nums[minpos]=nums[i];
                nums[i]=temp; 
            }
        }
    }

    
    //insertion sort....................................


    public static void insertionsort(int nums[]){
        for(int i=1; i<nums.length; i++){
          int curr=nums[i];
            int priv=i-1;
             while(priv>=0 && nums[priv]>curr ){
                nums[priv+1]=nums[priv];
                priv--;
             }
             nums[priv+1]=curr;
        }
    }
    public static void print(int nums[]) {
        for(int i=0; i<nums.length; i++){
                 System.out.print(nums[i]);
             }
    }
public static void main(String[] args ){
    int nums[]={5,4,1,3,2};
    //salection_sort(nums);
    // insertionsort(nums);
    Arrays.sort(nums);
    print(nums);
}


}