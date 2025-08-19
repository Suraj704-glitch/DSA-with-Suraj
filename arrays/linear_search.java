

public class linear_search {
    public static int searching(int number[], int key){

        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        int key=8;
       int index = searching( number, key);
if(index==-1){
    System.out.print("NOT INDEX");
}
else{
    System.out.print("index : " + index );
}
    }
    
}
