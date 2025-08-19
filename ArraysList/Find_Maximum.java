import java.util.ArrayList;

public class Find_Maximum {

   
    public static void main(String [] args){
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=10; i++){
            list.add(i);
        }
        for(int i=0; i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
            
    }
    System.out.println( "Print max " +max);
    }
     
}
 

