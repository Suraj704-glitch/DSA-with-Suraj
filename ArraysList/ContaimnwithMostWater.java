import java.util.ArrayList;
public class ContaimnwithMostWater {
    public static void main(String [] args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(watercontain(height));
        // watercontain(height);

        System.out.println("Two_Pointer_Aproch print= " +Two_Pointer_Aproch(height));
    }

   // Brut Force Aproch  ,0(n^2)
    public static int watercontain(ArrayList<Integer> height){
        int maxwtr=Integer.MIN_VALUE;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1;j<height.size(); j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int wtrcot=ht*width;

                maxwtr=Math.max(wtrcot,maxwtr);
            }

        }
        return maxwtr;

    }



    // Two_Pointer_Aproch 0(n)
    public static int Two_Pointer_Aproch(ArrayList<Integer> height){
       int lp=0,rp=height.size()-1;
       int maxwtr=0;
        while(lp<rp){
            int ht= Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currwtr=ht*width;
            if(maxwtr<currwtr){
                maxwtr=currwtr;   
            }
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            rp--;
        }
        return maxwtr;
    }
}
