public class WAF_LastOccurence {
    public static int lastOccu(int arr[],int key,int i){                         
       if(i==arr.length){
        return -1;
       }
        int isfound=lastOccu(arr,key,i+1);//{8,3,6,5,10,2,5,6}
        if(isfound==-1&&arr[i]==key){// ye bhi self kr rha haii
            return i;
        }
        //  self checking
    //     if(arr[i]==key){
    //         return i;
    //             }
                return isfound;// ye last occurence ki liye
    }

    // by suraj\
    public static int latoccurance(int arr[],int key, int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return latoccurance(arr,key,i-1);
    } 
    public static void main(String [] args){
        int arr[]={8,3,6,5,10,2,5,6};
      System.out.println(lastOccu( arr,5 ,0));
        System.out.println(latoccurance(arr,5,arr.length-1));
    }
}
