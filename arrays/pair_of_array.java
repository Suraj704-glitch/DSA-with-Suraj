

public class pair_of_array {
    public static void pair(int number []){
    for(int i=0; i<number.length; i++){

        for(int j=i+1; j<number.length; j++){
            System.out.print("(" +number[i] +","+ number[j]+")");
        }
        System.out.println();
    }
    }


    public static void main (String[] args){
        int number[] ={1,2,3,4,5};
        pair( number);
    }
}
