   import java.util.Arrays;  // TC= 0(n)
   import java.util.Collections;
public class sorting_sumeNonZrroElement {
    public static void sumarr(Integer arr[]){
       
        Arrays.sort(arr);
        Integer count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }// number of zero count== 4;
        Arrays.sort(arr,count,arr.length,Collections.reverseOrder());
    }
     public static void main(String[] args) {
        Integer arr[]={5,0,1,2,0,0,4,0,3};
      sumarr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
     }
}
