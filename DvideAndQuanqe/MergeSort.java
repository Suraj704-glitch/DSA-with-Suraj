

public class MergeSort {
    public static void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        //kam 
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);// left part
        mergeSort(arr,mid+1,ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
    int temp[]=new int [ei-si+1];
    int i=si;//itration for left part 
    int j=mid+1; //itration for rigth part
    int k=0;// itration for temp arr;
    while(i<=mid&&j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
    }
    while(i<=mid){//left mi jo bach gaye the 
        temp[k++]=arr[i++];
    }
    while(j<=ei){// right mi jo bach gye the
        temp[k++]=arr[j++];
    }
    for( k=0, i=si; k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] arge){
        int [] arr={6,3,9,5,2,8,-10};
        mergeSort(arr,0,arr.length-1);
        printarr( arr);
    }
}
