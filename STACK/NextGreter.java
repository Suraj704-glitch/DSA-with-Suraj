import java.util.*;

public class NextGreter {

    // next Greter Right
    public static void nextgtrR(Stack<Integer> s,int arr[], int nextgtr[]){
        int j=nextgtr.length-1;
        for(int i=arr.length-1; i>=0; i--){// last se check kr lenge
            int curr=arr[i];
            // while loop
            while(!s.isEmpty()&&curr>=arr[s.peek()]){
                s.pop();

            }
            // check if-else
            if(s.isEmpty()){
                
                 nextgtr[j]=-1;
                 j--;
            }
            else{
                nextgtr[j]=arr[s.peek()];
                j--;
            }
            // push index in stack
            s.push(i);// idx of element;
        }
    }

    // Next Greter Left
    public static void nextgtrL(Stack<Integer> s,int arr[], int nextgtr[]){
        int j=0;
        for(int i=0; i<arr.length; i++){// last se check kr lenge
            int curr=arr[i];
            // while loop
            while(!s.isEmpty()&&curr>=arr[s.peek()]){
                s.pop();

            }
            // check if-else
            if(s.isEmpty()){
                
                 nextgtr[j]=-1;
                 j++;
            }
            else{
                nextgtr[j]=arr[s.peek()];
                j++;
            }
            // push index in stack
            s.push(i);// idx of element;
        }
    }

    // NEXT SMALEST RIGHT
    public static void nextsmalestR(Stack<Integer> s,int arr[], int nextgtr[]){
        int j=nextgtr.length-1;
        for(int i=arr.length-1; i>=0; i--){// last se check kr lenge
            int curr=arr[i];
            // while loop
            while(!s.isEmpty()&&curr<=arr[s.peek()]){
                s.pop();

            }
            // check if-else
            if(s.isEmpty()){
                
                 nextgtr[j]=-1;
                 j--;
            }
            else{
                nextgtr[j]=arr[s.peek()];
                j--;
            }
            // push index in stack
            s.push(i);// idx of element;
        }
    }


    //NEXT SMALEST LEFT
    public static void nextsmalestL(Stack<Integer> s,int arr[], int nextgtr[]){
        int j=0;
        for(int i=0; i<arr.length; i++){// last se check kr lenge
            int curr=arr[i];
            // while loop
            while(!s.isEmpty()&&curr<=arr[s.peek()]){
                s.pop();

            }
            // check if-else
            if(s.isEmpty()){
                
                 nextgtr[j]=-1;
                 j++;
            }
            else{
                nextgtr[j]=arr[s.peek()];
                j++;
            }
            // push index in stack
            s.push(i);// idx of element;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextgtr[]=new int [arr.length];
        nextgtrR( s,  arr ,   nextgtr );
        System.out.print("{");
        for(int i=0; i<nextgtr.length; i++){
           
            System.out.print (nextgtr[i]+",");
            
        }
        System.out.print("}");
    }
}
