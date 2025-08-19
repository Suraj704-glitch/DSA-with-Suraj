import java.util.*;

public class Fracitional_Knapsack {
    public static void main(String[] args) {
        int value[]={60,100,240};
        int weigth[]={10,20,30};
        int W=50;
         
        double ratio[][]=new double[value.length][2];
        // 0th col=>index ; 1st col=>ratio
         for(int i=0;i<value.length;i++){
            ratio[i][0]=i;// index
            ratio[i][1]=  value[i]/(double)weigth[i] ; // ratio

        }
        // Assending Order Sorting array onn the basis of ratio
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int cap=W;
        int finalval=0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx=(int) ratio[i][0]; // sorting ki bad index change ho jayega & wronge 
                                // index ka weigth mil jaywga kyoki weigth sorted nhi hai 
            if(cap>=weigth[idx]){ // whole weigth occupie ho jayega;
                finalval+=value[idx];
                cap-=weigth[idx];  
            }
            else{ 
                finalval= (int)(finalval+ratio[i][1]*cap);
            }
        }
        System.out.println(finalval);
    }
}
