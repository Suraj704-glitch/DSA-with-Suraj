import java.util.*;
public class Impliment_bY_AL {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){  //0(log(n))
           // add last
            arr.add(data);
            // last idx
            int x=arr.size()-1;// child ki index
            int par=(x-1)/2;// usi child ke parent ka index

            while(arr.get(x)<arr.get(par)){
                // swaping 
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
             int minIdx=i;
             int left=2*i+1;
             int right=2*i+2;
           
             // check minimum value between among three
             if(left<arr.size()  && arr.get(left)<arr.get(minIdx)){
                minIdx=left;
             }
              if(right<arr.size()  && arr.get(right)<arr.get(minIdx)){
                minIdx=right;

             }
             //swaping between minIdx and root idx(i);
             if(minIdx!=i){ // yani minIdx ager change ho gya ho 
             int temp=arr.get(i);
             arr.set(i,arr.get(minIdx));
             arr.set(minIdx,temp);
             
             // recursivelly call the function 
             heapify(minIdx);
             }
        }
        public int remove(){
           
            int data=arr.get(0);
            // setp 1st Swaping 
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // step 2nd  delete
            arr.remove(arr.size()-1);
            // step 3rd heapify
            heapify(0);  //O(logn)
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
       Heap h=new Heap();
       h.add(4);
       h.add(3);
       h.add(8);
       h.add(1);
       while(!h.isEmpty()){ // heap-sort O(nlogn);
        System.out.println(h.peek());
        h.remove();
       }
    }
}
  