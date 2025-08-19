import java.util.*;

public class Lonely_Number {// all number they are adjesent of x( ex:((x-1),(x+1))) they are not presen in list
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        Lonely(nums);
    }//10,5,6,8;
   public static void Lonely(ArrayList<Integer> nums) {
    Collections.sort(nums);// 5,6,8,10;
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=1; i<nums.size()-1; i++){
       if((nums.get(i-1)+1<nums.get(i) )&& (nums.get(i)+1<nums.get(i+1))){
        list.add(nums.get(i));
       }
       // edhar start and ending index ki element cover nhi hai than
    }
    if(nums.size()==1){
        list.add(nums.get(0));
    }
    if(nums.size()>1){
        if(nums.get(0)<nums.get(1)-1){
            list.add(nums.get(0));
        }
        if(nums.get(nums.size()-2)+1<nums.get(nums.size()-1)){
            list.add(nums.get(nums.size()-1));
        }
    }
    System.out.println(list);
   }
}
