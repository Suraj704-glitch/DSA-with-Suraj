public class rotated_arrays {




    public static void Search11(int arr[], int key){
        int start=0; 
        int end=arr.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]==key){
                System.out.print("your index : " + mid);
                //return;
                break;

            }
            else if(arr[start]<=arr[mid]){//lef pat are sort
                if(arr[start]<=key&&key<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(arr[mid]<=key&&key<=arr[end] ){//rigth part are sorted
                start=mid +1;
            }
            else{
                end=mid-1;
            }
        }
        }
       
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,0,1,2};
         int key=0;
        Search11(arr,key);
    }
}
