  import java.util.*;

public class Create_a_Graph {
    public static class Edge{
        int src;
        int des;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }
    public static void main(String[] args) {
        /*    
              (5)
          0----------1
                    /  \
               (1) /(1) \(3)
                  2----- 3
                  | 
                  |(2)
                  4
                  */
        int V=5;
      ArrayList<Edge> graph[]=new ArrayList[V]; // each Node are contain null value
               // hr ek ko empty se intilize krna padega
           
               for(int i=0;i<V;i++){
                graph[i]=new ArrayList<>();

               }
                // Vertex [0]
                graph[0].add(new Edge(0,1,5));
                //vertex [1]
                 graph[1].add(new Edge(1,0,5));
                graph[1].add(new Edge(1,2,1));
                graph[1].add(new Edge(1,3,3));
                //Vertex [2]
                graph[2].add(new Edge(2,1,1));
                graph[2].add(new Edge(2,3,1));
                graph[2].add(new Edge(2,4,2));
                //Vertex [3]
                graph[3].add(new Edge(3,1,3));
                graph[3].add(new Edge(3,2,1));
                //Vertex [4]
                graph[4].add(new Edge(4,2,2));
                   
                
                // for neighber element of 0's
                 System.out.println("neighber element of 0's"); 
                for(int i=0;i<graph[0].size();i++){
                    Edge e=graph[0].get(i);
                     System.out.println(e.des);
                }
                 // for neighber element of 1's
                 System.out.println("neighber element of 1's"); 
                for(int i=0;i<graph[1].size();i++){
                    Edge e=graph[1].get(i);
                    System.out.println(e.des);
                }
                 // for neighber element of 2's 
                  System.out.println("neighber element of 2's"); 
                for(int i=0;i<graph[2].size();i++){
                    Edge e=graph[2].get(i);
                     System.out.println(e.des);
                }
                 // for neighber element of 3's 
                  System.out.println("neighber element of 3's"); 
                for(int i=0;i<graph[3].size();i++){
                    Edge e=graph[3].get(i);
                     System.out.println(e.des);
                }
                 // for neighber element of 4's
                  System.out.println("neighber element of 4's"); 
                for(int i=0;i<graph[4].size();i++){
                    Edge e=graph[4].get(i);
                     System.out.println(e.des);
                }

    }
    
}
