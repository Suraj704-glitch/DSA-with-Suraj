public class maxsubarraybyprifix_arrays {
    public static void prifix(int number[]){
        int curr_sum=0;
        int maxsum=Integer.MIN_VALUE;// ye -infinity ki liye

        int prifix[]=new int[number.length];

            prifix[0]=number[0];
        // for sum store in prifix array
        for(int i=1; i<prifix.length; i++){
            prifix[i]= prifix[i-1] + number[i];//isme sub array ka sum store ho rha hai ;

        }
        for(int i=0; i<number.length; i++){
           int start =i;
            for(int j=i; j<number.length; j++){
            int end=j;
                curr_sum= start==0 ? prifix[end]: prifix[end]-prifix[start-1]; 
                if(curr_sum>maxsum){
                    maxsum=curr_sum;
                }
            }
        }
System.out.print("max sum = " + maxsum);

    }

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
