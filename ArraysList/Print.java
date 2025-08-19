import java.util.ArrayList;

public class Print {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=1; i<=5; i++){
            list.add(i);
        }
        // for print ArrayList 
        System.out.println("print");
        for(int i=0; i<list.size(); i++){
           
            System.out.print( list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Revers Print ");
        for(int i=list.size()-1; i>=0; i--){
            
            System.out.print(  list.get(i) + " ");
        }
    }
}
