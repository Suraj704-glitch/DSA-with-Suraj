

public abstract class update {
    public static void updatingjava(int number[]){
        for(int i=0; i<number.length; i++){
             number[i] =number[i] + 5;

        }
    }



    public static void main(String[] args) {
        int number [] ={96,97,98,};
        updatingjava(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}
