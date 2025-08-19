
public class bubbleshort {
    public static void shorting(int arr[]){
        //tc =O(n*n);
        for(int turn=0; turn<arr.length-1; turn++){

            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void printarr( int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");



        }
        System.out.println();
    }

    // if array are alresat shortes than minimize for time complexcity (TC=O(1))
    public static void allredeyshortedarr(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            
            for(int j=0; j<arr.length-1-turn; j++){
                int swaps=0;
                //for swapping
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;

                }if(swaps==0){
                    System.out.print("Shortd array is : ");
                    for(int i=0; i<arr.length; i++){
                        System.out.print(arr[i]);
                    }
        
                }
                break;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
      
        // shorting( arr);
        //printarr(arr);
        allredeyshortedarr(arr); 
    }
}
