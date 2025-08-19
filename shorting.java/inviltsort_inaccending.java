    import java.util.Arrays;
public class inviltsort_inaccending {
    public static void main(String[]  args){
        int arr[]={3,4,6,8,1};
        Arrays.sort(arr);
        printArr(arr);
    }
   


    
    // Define the printArr method to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


