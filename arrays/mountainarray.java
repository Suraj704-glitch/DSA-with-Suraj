public class mountainarray {
    public static void peakvalue(int arr[] ){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]){
                System.out.print("Your peak index is : "+ mid);
              return;
            }
            else if(arr[mid]>=arr[mid-1]){
                start=mid+1;
            }
            else if(arr[mid]>=arr[mid+1]){
                end=mid-1;
            }
        }
        System.out.println();
    }
public static void main(String [] args){
    int arr[]= {0,3,8,9,4,2};
    peakvalue(arr);
}
}
 