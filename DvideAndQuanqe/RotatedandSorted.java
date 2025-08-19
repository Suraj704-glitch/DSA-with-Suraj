
import java.util.*;
public class RotatedandSorted {
    public static int search(int arr[],int tar,int si,int ei){
        //base case
        if(si>ei){
            return -1;
        }
        //kam
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        // if mid lie on L1;
        if(arr[si]<=arr[mid]){// left part are sorted
              
             if(arr[si]<=tar&&tar<=arr[mid]){//if tar lie on left of mid
              return  search( arr, tar, si, mid-1);
             }
             else{// if tar lie on ringht of mid ;
               return search( arr, tar, mid+1, ei);
             }

        }
       // if mid lie on L2;
        else{  //  right parrt are sorted
            
            //if tar lie on right of mid
            if(arr[mid]<=tar&&tar<arr[ei]){
              return  search( arr, tar, mid+1, ei);

            }
            else{  //if tar lie on left of mid
              return  search( arr, tar, si, mid-1);
            }

            }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
       System.out.print (search( arr, 0, 0, arr.length-1));

    }
}
