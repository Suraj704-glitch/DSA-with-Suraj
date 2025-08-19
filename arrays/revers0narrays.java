

public class revers0narrays {
    public static void revers(int number[]){
       int start=0 , end =number.length-1;
       while(start<end){
       int temp =number[start];
        number[start]=number[end];
        number[end]=temp;
        start+=1;
        end-=1;
       }


    }


    public static void main(String[] args){
        int number[] ={1,2,3,4,5,6,7,8,9,10};
        revers(number);
        for(int i=0;i<number.length; i++){
            System.out.print(number[i] +" "); 
        } 
    }
}
