import java.util.*;
public class Chocola_Problem {
    public static void main(String[] args) {
        int m=6,n=4;
    Integer costVer[]={2,1,3,1,4};
    Integer costHor[]={4,1,2};
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
     int h=0,v=0; // for traversing and for cut ye only pinter hai
     int Hpic=1,Vpic=1;
     int cost=0;
     while(h<costHor.length&& v<costVer.length){
        if(costHor[h]<=costVer[v]){   //for Vertical cut
            cost+=(costVer[v]*Hpic);
            Vpic++; // vertical cut to vertical pices hi badenge
            v++;

        }
        else{
            cost+=(costHor[h]*Vpic); // for horizotal cut
            Hpic++; // horizontal cut to horizotal pices hi bdenge
            h++;
        }
     }
     while(h<costHor.length){
        cost+=(costHor[h]*Vpic); // for horizotal cut
            Hpic++; // horizontal cut to horizotal pices hi bdenge
            h++;
     }
     while( v<costVer.length){  // for reaming vertical cut
        cost+=(costVer[v]*Hpic);
        Vpic++; // vertical cut to vertical pices hi badenge
         v++;
     }
     System.out.println("Min cost of squire = " +cost);
    }
}
