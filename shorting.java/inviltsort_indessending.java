import java.util.Arrays;
   import java.util.Collections;
   
public class inviltsort_indessending {
    public static void main(String[] args){
        Integer arr[]={3,4,6,8,1};
          Arrays.sort(arr,0,3,Collections.reverseOrder()); 
        //  Arrays.sort(arr,Collections.reverseOrder());
       printArr(arr);
    }
    public static void printArr(Integer arr []) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
