public class CheckOccurencce {
    public static void printindx(int arr[],int i,int key){
        //baase case
        if(i==arr.length){
           
            return;
        }
        if(arr[i]==key){
            System.out.print(i +" ");
        }
        printindx(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        printindx( arr, 0, 2);
    }
}
