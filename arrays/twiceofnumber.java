public class twiceofnumber {
    public static boolean twiceoftwonumber(int nums[]){
        for(int i=0; i<nums.length; i++){

            for(int j=i+1; i<nums.length; j++){
                if(nums[j]==nums[i]){
                    return true;
                }

            }
        }return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=0; i<n; i++){
        // int nums[i]=sc.nextInt();
        twiceoftwonumber(nums);    }
}


