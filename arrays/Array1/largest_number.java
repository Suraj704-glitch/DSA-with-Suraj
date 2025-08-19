    import java.util.*;

public class largest_number {
    public static int largest_Ka(int numbers[]) {
       int largest=Integer.MIN_VALUE;
       int smallest =Integer.MAX_VALUE;
       for(int i=0;i<numbers.length; i++){
        if(numbers[i]>largest){
            largest=numbers[i];
        }
        if(smallest>numbers[i]){
            smallest=numbers[i];
            System.out.println("The Smallest number in array is :" + smallest);
        }
       }
       return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,4,6,4,2,8,5};
System.out.println("Ihe  largest number in array is : " + largest_Ka(numbers));
    }
}
