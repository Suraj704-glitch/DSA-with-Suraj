import java.util.*;
public class NearestN_car {
    public static class Point implements Comparable<Point>{
        int x;
        int y;
        int disSqr;
        int idx;
        Point(int x,int y,int disSqr,int idx){
            this.disSqr=disSqr;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.disSqr-p2.disSqr;
        }
    }
   public static void main(String[] args) {
int pts[][]={{3,3},{5,-1},{-2,4}};
int k=2;    // if k are not given than (k=n-1); 
PriorityQueue<Point> pq=new PriorityQueue<>();
for(int i=0; i<pts.length;i++){
    int disSqr=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
    pq.add(new Point(pts[i][0],pts[i][1],disSqr,i));
}  // neaRST 
    for(int i=0; i<k;i++){
        System.out.print("C"+pq.remove().idx +" ");
    }
}
}