import java.util.*;
 
public class MaxAreaInHistogram {
    public static void nextsmallright(int arr[], int next_SR[]  ){
        Stack<Integer> s=new Stack<>();
        int j=next_SR.length-1;
        for(int i=arr.length-1;i>=0; i--){
            int curr=arr[i];
            while(!s.isEmpty()&&curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                next_SR[j]=next_SR.length;
                j--;
            }
            else{
                next_SR[j]=s.peek();
                j--;
            }
            s.push(i);
        }

    }
    public static void nextsmallLeft(int arr[], int next_SL[]  ){
        Stack<Integer> s=new Stack<>();
        int j=0;
        for(int i=0;i<arr.length; i++){
            int curr=arr[i];
            while(!s.isEmpty()&&curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                next_SL[j]=next_SL.length;
                j++;
            }
            else{
                next_SL[j]=s.peek();
                j++;
            }
            s.push(i);
        }

    }


    public static int mexareaOfHistogram(int arr[], int next_SR[],int next_SL[] ){
          int maxarea=Integer.MIN_VALUE;
          // Next Smaller Left 
        nextsmallLeft( arr,  next_SL );
        // Next Smaller Right
        nextsmallright( arr,  next_SR  );
        // Area
        for(int i=0; i<arr.length; i++){
            int area=arr[i]*(next_SR[i]-next_SL[i]-1);
              maxarea=Math.max(area,maxarea);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        int next_SR[]=new int [arr.length];// only index store krenge
        int next_SL[]=new int [arr.length];// only index store krenge
        System.out.println(mexareaOfHistogram(arr,next_SR,next_SL));
        
    }
}
