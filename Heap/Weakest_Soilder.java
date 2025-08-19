import java.util.Comparator;
import java.util.PriorityQueue;
public class Weakest_Soilder {
    public static class Row implements Comparable<Row>{
        int soilders;
        int idx;
        public Row(int soilders,int idx){
            this.soilders=soilders;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soilders==r2.soilders){// jb equal ho tb idx ke bases pr sort krenge

                return this.idx-r2.idx;
            }else{
            return this.soilders-r2.soilders;// otherwise no of soilders ki bsses pr krenge;
        }
    } 
    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}  
                     };
       PriorityQueue<Row> pq=new PriorityQueue<>();              
        

       for(int i=0; i<army.length;i++){
        int soliders=0;
        for(int j=0;j<army[0].length;j++){
            if(army[i][j]==1){ 
                soliders++;
            }
        }
         pq.add(new Row(soliders,i));
       }
       int k=2;
       for(int i=0;i<k;i++){
         System.out.println("R"+pq.remove().idx);
       }
       System.out.println();
    }
}
