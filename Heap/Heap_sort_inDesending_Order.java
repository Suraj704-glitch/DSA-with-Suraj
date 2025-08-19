public class Heap_sort_inDesending_Order {
    public static void heapify(int arr[],int i,int size){
        int minIdx=i;
        int left=2*i+1;
        int right=2*1+2;
        if(left<size&& arr[left]<arr[minIdx]){
            minIdx=left;
        }
        if(right<size&& arr[right]<arr[minIdx]){
            minIdx=right;
        }
        if(minIdx!=i){
            // swap minIdx and i
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
            heapify(arr,minIdx,size);
        }
    }
    // heap sort in desendiing order
    public static void heapsortdesingOrdr(int arr[]){
        // buld min heap
        int n=arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }
        // step 2  swap minimume(idx:0)& last in arr
        for(int i=n-1; i>=1; i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,0,i);
        }
    }

        public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
            heapsortdesingOrdr(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");

            }
            System.out.println();
    }
}
    
