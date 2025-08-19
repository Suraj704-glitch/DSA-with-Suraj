
import java.util.*;
public class Union_Of_Two_Array {
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
       for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        for(Integer i:hs){
            System.out.print(i+" ");
        }
      return hs.size();
    }
    // for Intersections
    public static int intersectiion(int arr1[],int arr2[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        int count=0;
        for(int i=0; i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                count++;
                System.out.println(arr2[i]);
                hs.remove(arr2[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
       System.out.println("Union =" +union(arr1,arr2));
       System.out.println();
       System.out.println("intersections ="+ intersectiion(arr1,arr2));
    }
}
