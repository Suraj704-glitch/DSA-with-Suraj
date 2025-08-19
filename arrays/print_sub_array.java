// total number of sub array = n(n+1)/2;  hota hai  
public class print_sub_array {
    public static void subarray(int number[]){
        int total=0;
        for(int i=0; i<number.length; i++){
           int start =i;
           for(int j=i; j<number.length; j++){
            int end =j;
            int sum_sub_arrays=0;
                for(int k=start; k<=end; k++){//start and end ki beech ki sare eliment print krayenge

                    System.out.print(number[k] +" ");//subarray 
                    sum_sub_arrays=sum_sub_arrays+number[k];
                }
            
                System.out.print( "   sum of these sub arrays = "  + sum_sub_arrays);
                total++;
                System.out.println();
           }
           System.out.println();
           
        }
       
        System.out.print("TOTAL sub arrays : "+  total);
}


    public static void main(String args []){
        int number[] ={2,4,6,8,10};
        subarray( number);
    }
}
