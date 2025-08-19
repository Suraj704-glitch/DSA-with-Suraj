 import java.util.*;
public class Activity_Sec_NotSortedEndTIME {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,6,3,9,7,9};
        
        // end time are not sorted for sorting end time 
        // make 2D array and store "INDEX" "Start" "End"
         int activity[][]=new int [start.length][3];
        for(int i=0;i<start.length; i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));    
                    // Sorting on the basies of end time 
                    ArrayList<Integer> ans=new ArrayList<>();
                    // store 1st index activity
                    ans.add(activity[0][0]);
                    int maxAct=1;
                    int Lastend=activity[0][2];
                    for(int i=1;i<activity.length;i++){
                        if(activity[i][1]>=Lastend){
                            maxAct++;
                            ans.add(activity[i][0]);// index which store in activity array
                            Lastend=activity[i][2];
                        }
                    }
                    System.out.println("Maximum Activity = "+maxAct);
                for(int i=0; i<ans.size();i++){
                    System.out.println("A" +ans.get(i));
                }
                }
            }

    