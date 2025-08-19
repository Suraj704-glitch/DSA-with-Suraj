
public class QUICK {
    public static int partetion(int arr[],int low,int high){
        int pivot=arr[high];//last element ko pivot man leya 
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){// than use time pr jo i ki jo value hogi usko arr[j]se Swap   kr do


            // swap the element at i and j
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // ye jb last mi pivot se bda element mil jaye to 
            i++;
            int temp=arr[i];
            arr[i]=arr[high];
            // pivot =temp , isliye nhi likhenge kyo ki jb dubra    recursion mi call ho ye phlew walepivot ko he lelega
              arr[high]=temp;
            return i;
        
    }
    public static void Quick(int arr[],int low, int high){
        if(low<high){
        int pindx=partetion(arr,low,high);//ye hmi pivot ka index de dega yani pivot ki posion pta chal jayegi
        Quick(arr, low,  pindx-1);//ye pivot se phle ki element ko sort krni ke liye
        Quick(arr, pindx+1,  high);// ye pivot ke bad ki element ko sort kene ke leye;
        
    }
}
    public static void main(String [] args){
        int arr[]={6,3, 9,5,2,8};
        int low=0,high=arr.length-1;
        Quick( arr, low,  high);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");  //ye hmi sorted array dega
        }
    }
}
