public class check_Sortingarray {
  
    public static boolean isSorted(int arr[],int i){

        if(i==arr.length-1){//last wale index ki liye 
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        System.out.print( isSorted(arr,0));
    }
}
