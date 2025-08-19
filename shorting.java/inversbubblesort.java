public class inversbubblesort {

// Bubble sort in desending order
    public static void invers(int arr[]){
        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }
            }
        }
    }
    public static void printer(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
public static void main(String[] args) {
    int arr[]={3,6,2,1,8,7,5,3,1};
    invers(arr);
    printer(arr);
    
}
}
