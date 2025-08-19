public class WAF_FirstOccurence {
    public static int firstOccurence(int arr[],int i,int key){
         if(i==arr.length){
            return -1;
         }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    public static void main(String[] args){
        int arr[]={8,3,6,8,10,2,0,3,9};
        int key=9;
        int i=0;
        System.out.print(firstOccurence(arr,i,key));
    }
}
