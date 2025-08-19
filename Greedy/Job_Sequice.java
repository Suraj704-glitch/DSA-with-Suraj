import java.util.*;
public class Job_Sequice {
    public static class job{
         int dedline ;
         int profit ;
         int id; // 1(c) ,2(b) , 3(c)
         public job(int i, int d,int p){
            id=i;
            dedline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},
                         {1,10},
                         {1,40},
                         {1,30}};

        ArrayList<job> jobs=new ArrayList<>();

        for(int i=0;i<jobinfo.length;i++){
            jobs.add(new job(i,jobinfo[i][0],jobinfo[i][1])); //( id's,dedline,profit)
        }
        // Sort jobs in Deccending order
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        
        int time=0;
        ArrayList<Integer> seq=new ArrayList<>();// for storing id's
        for(int i=0; i<jobs.size();i++){
            job curr=jobs.get(i);
            if(curr.dedline>time){
                seq.add(curr.id);
                time++;
            }

        }
        System.out.println("max job = " +seq.size());
        for(int i=0;i<seq.size(); i++){
            System.out.print(seq.get(i) +" ");
        }

        }
}
