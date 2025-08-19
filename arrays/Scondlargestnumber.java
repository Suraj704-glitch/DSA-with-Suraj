public class Scondlargestnumber {
    public static int Scon_largest(int arr[]){
        int largest=arr[0];
        int Slargest=Integer.MIN_VALUE;

            for(int i=1; i<arr.length; i++){
                if(arr[i]>largest){
                    Slargest=largest;
                largest=arr[i];
                }
                else if(arr[i]<largest&&arr[i]>Slargest){
                    Slargest=arr[i];
                }
            }
            
            return (Slargest==Integer.MIN_VALUE)? -1:Slargest;
    }



//for Scond smallest element is 
public static int Scondsmallest(int arr[]){
   int Scon_smallest=Integer.MAX_VALUE;
   int smallest=arr[0];
   for(int i=1; i<arr.length; i++){
    if(arr[i]<smallest){
        Scon_smallest=smallest;
        smallest=arr[i];
    }
    else if(arr[i]>smallest&&arr[i]<Scon_smallest){
        Scon_smallest=arr[i];
    }
}

return (Scon_smallest==Integer.MIN_VALUE)? -1:Scon_smallest;
    
   
   
     
} 
public static void main(String[] args) {
    int arr[]={12,34,6,1,35,0};
    
    System.out.println( "Your Scond largest element is :" +Scon_largest(arr));
    System.out.println( "Your Scond Smallest element is :" +Scondsmallest(arr));
}    

}
