import java.util.ArrayList;
public class Pair_Sum {

    // Brut Force Aproch 
    public static boolean pair_sum(ArrayList<Integer> list ,int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    // Optimize Aproch BY 2_POiter Aproch;
    public static boolean two_Pointer_Aproch(ArrayList<Integer> list ,int target){
        int lp=0,rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
           
        }
        return false;
    }
    public static void main(String [] args ){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        //System.out.println(pair_sum(list,7));
        System.out.println(two_Pointer_Aproch(list, 9));
    }
}
