
public class ArrayBackTraking {
    public static void backtarckArr(int arr[],int i,int val){

        //base
        if(i==arr.length){
            printarr( arr);
            return;
        }
        // kam 
        arr[i]=val;//change value
        //recirsion call
        backtarckArr( arr, i+1, val+1);//function call
        arr[i]=arr[i]-2;// backtraking
        

    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
   public static void main(String[] args) {
    int arr[]=new int [5];
    backtarckArr( arr, 0, 1);
    printarr( arr);
   }
}

