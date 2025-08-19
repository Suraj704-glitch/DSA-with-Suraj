public class revesr {
    public static void revers(  int number[]){
        int start=0, end=number.length-1;
        while(start<end){
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start++; end--;
        }
    }


    public static void main(String[] args) {
        
        int number []={2,4,6,8,10};
        revers(number); //jis aray ko humni revrs kiya tha use hmni bula liya
        // ab array ko print krna hai 
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
System.out.println();
  
    }
}
