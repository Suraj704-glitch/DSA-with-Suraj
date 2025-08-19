public class nums_appairing_one {
      public static int Single(int arr[], int k){ 
        int lergestlength =Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            int st=i;
            for(int j=0; j<arr.length; j++){
                int end=j;
                int corr_sum=0;
            
                for(int l=st; l<=end; l++){
                    corr_sum+=arr[l];
            
                }
                if(corr_sum==k){
                    int length = st==0?end +1:(end-(st-1));
                lergestlength = Math.max(length ,lergestlength);
              
                }
                // return lergestlength;
            }
        }
        return lergestlength;
        }
        public static void main(String[] args) {
            int arr[]={8,18,8,18};
            System.out.println(Single(arr,26) );
        }
    }