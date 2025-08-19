import java.util.*;
public class Create_Trie {
    
    static class Node{
        Node childrane[]=new Node[26];
        boolean EndOfWord=false;
        Node(){
         for(int i=0;i<26;i++){
            childrane[i]=null;
         }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){ // 0(L)
        Node curr=root;
        for(int lavel=0;lavel<word.length();lavel++){
            int idx=word.charAt(lavel)-'a';
            if(curr.childrane[idx]==null){
                curr.childrane[idx]=new Node();
            }
            curr=curr.childrane[idx];

        }
        curr.EndOfWord=true;
    }
    

    // Search Any word in the Trie 
    public static boolean search(String key){
        Node curr=root;
        for(int leval=0;leval<key.length();leval++){
            int idx=key.charAt(leval)-'a';
            if(curr.childrane[idx]==null){
                return false;
            }
            curr=curr.childrane[idx];
        }
        return curr.EndOfWord=true;
    }
    public static void main(String[] args) {
        String word[]={"the","a","there","their","any","three"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(search("hbdhj"));
        
        

    }
}
