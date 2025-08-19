 
import java.util.*;
public class Activity_Selection {

   public static void main(String[] args) {
    int start[]={1,2,0,5,8,5};
    int end[]={2,4,6,7,9,9};

    // end time based shorted
    int maxAct=0; // initilize by zero;
    ArrayList<Integer> ans=new ArrayList<>(); // for store 
                                             // index
   // 1st Activity to add hi krengi tbhi kam start hoga
   ans.add(0);
    maxAct=1;
    int Lastend=end[0];
    for(int i=1; i<end.length;i++){
        if(start[i]>=Lastend){
            maxAct++;
            ans.add(i);
            Lastend=end[i];
        }
    }
    System.out.println("maximum Activity = "+maxAct);
    for(int i=0; i<ans.size();i++){
        System.out.println("A"+ans.get(i));
    }
} 
}
