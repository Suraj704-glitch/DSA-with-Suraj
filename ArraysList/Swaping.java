import java.util.ArrayList;
public class Swaping {
    public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=10; i++){
            list.add(i);
        }
        System.out.println(list);
          
        swaping(list ,2,4);

    }
    public static void swaping(ArrayList<Integer> list ,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2)); 
        list.set(idx2,temp);
        System.out.println(list);
    }
    
}
