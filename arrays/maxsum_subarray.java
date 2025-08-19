public class maxsum_subarray {

    public static void maxsum(int number[]){
         int maxsum=Integer.MIN_VALUE;//ye -infinity ki liye;
                                                 //(2,4);(2,4,6)
         for(int i=0; i<number.length; i++){//aage wala number yani 2 ;

            for(int j=i; j<number.length; j++){//peeche wala number  yanin 4---6 ki liye ;    
                 int curr_sum=0;
                for(int k=i; k<=j; k++){
                        curr_sum+=number[k];
                }
                
                System.out.println( "sum of subarrays " + curr_sum);
               
                if(curr_sum>maxsum){
                    maxsum=curr_sum;
                }
            }
         }
         System.out.print( "MAX sum of subarray sum = " +maxsum);;
    }
        public static void main(String args []){
              
            int number[]={1,-2,6,-1,3};
            maxsum(number);
        }
}
