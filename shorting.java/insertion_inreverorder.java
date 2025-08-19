public class insertion_inreverorder {
    public static void revers(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            int priv=i-1;
            
       
        while(priv>=0 && arr[priv]<curr){
                arr[priv+1]=arr[priv];

            priv--;
        }
        arr[priv+1]=curr;
    }
    }
    public static void prnter(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        revers(arr);
        prnter(arr);
    }
}
