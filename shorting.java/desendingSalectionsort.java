public class desendingSalectionsort {
    public static  void salection_sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int maxpos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[maxpos]){
                       maxpos=j;
                }
            }
                 //swap
                int temp=arr[i];
                arr[i]=arr[maxpos];
                arr[maxpos]=temp; 
            
                
        }
       
    }
    public static void printer(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    // public static void selectionSortDescending(int arr[]) {
    //     for(int turn=0; turn<arr.length; turn++) {
    //     int minPos = turn;
    //     for(int j=turn+1; j<arr.length; j++) {
    //     if(arr[minPos] < arr[j]) {
    //     minPos = j;
    //     }
    //     }
    //     //swap
    //     int temp = arr[turn];
    //     arr[turn] = arr[minPos];
    //     arr[minPos] = temp;
    //     }
    //     }
        
    public static void main(String [] arg){
        int arr[]={3,6,2,8,7,4,5,1};
        salection_sort(arr);
        //selectionSortDescending(arr);
        printer(arr);
    }
}
