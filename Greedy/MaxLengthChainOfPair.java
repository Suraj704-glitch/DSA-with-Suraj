import java.util.*;

public class MaxLengthChainOfPair {
    public static void main(String[] args) {
        int pair[][]={{5,24},
                      {39,60},
                      {50,28},
                      {27,40},
                      {50,90}};
          Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));

          int maxChain_length=1; // taking first pair (first pair ko lina he padega)
          int Lastpair=pair[0][0];
          for(int i=1;i<pair.length;i++){
            if(pair[i][0]>=Lastpair  ){
                maxChain_length++;
                Lastpair=pair[i][1];
          }
        }
         
         System.out.println("Maximum number = " +maxChain_length );
    }
}
