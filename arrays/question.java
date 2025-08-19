    import java.util.*;
public class question {
    public static boolean same(int nums[]){
        for(int i=0; i<nums.length; i++){

            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            //    else{
            //      return false;
            //    }
            
            }
        }
        return false;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter thr length the array : " );
        int n=sc.nextInt();
        int nums[]=new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Enter the element in array : ");
            nums[i]=sc.nextInt();}
System.out.println(same(nums));
    }
}
