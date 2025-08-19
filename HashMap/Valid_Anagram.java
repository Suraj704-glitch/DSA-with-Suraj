import java.util.*;
public class Valid_Anagram {
    public static boolean prank(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
         HashMap<Character ,Integer> hm=new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i) ;
            hm.put(ch ,hm.getOrDefault(ch,0)+1); 
        }
        // ab r ki sabhi charector ko check kr lo ki hr ek charector are present in the 
        // HashMap or not,
        for(int i=0;i<t.length();i++){
            
            if(hm.containsKey(t.charAt(i))!=true){
                return false;
            }
                
            }
        return true ;


// By saradha mam 
    //     for(int i=0;i<t.length(); i++){
    //         char ch=t.charAt(i);
    //         if(hm.get(ch)!=null){ // ch are present inn the hm
    //             if(hm.get(ch)==1){
    //                 hm.remove(ch);
    //             }else{

    // more than one frequancy are present 
    ////in the hashmap than value are updated

    //                 hm.put(ch,hm.get(ch)-1);

    //             }
    //         }else{
    //         return false;
    //     }
    // }
    //     return hm.isEmpty() ;


    }
    public static void main(String[] args) {
        String s="rsceeh";
        String t="csreeh";
       System.out.println(prank( s, t));
    }
}
