    
public class pair_of_array {
    public static void printpair(int number []){
for(int i=0; i<number.length-1; i++){
    int curr=number [i];
    for(int j=i+1; j<number.length; j++){
        System.out.print("(" + curr + "," + number [j] + ")" + " ") ;
}
        System.out.println();
    }
}
    public static void main(String[] args) {
          int number[] ={2, 4, 6, 8, 10 };
          printpair(number);
    }    
    }

