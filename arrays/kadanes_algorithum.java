public class kadanes_algorithum {
    public static void kadanes(int number[]){
        int maxsum =Integer.MIN_VALUE;
        int curr_sum=0;

        for(int i=0 ;i<number.length; i++){
            curr_sum+=number[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            maxsum=Math.max(curr_sum , maxsum);

        }
        System.out.print("Our max sum of subarray is : " + maxsum);
    }

    public static void main(String[] args) {
        int number[]={-2,-3,5,1,-2,1,5,-3};
       // prifix(number);
      
        kadanes(number);
    }
}
