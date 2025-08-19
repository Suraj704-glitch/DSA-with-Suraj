import java.util.*;
public class StartWith_Problem {
     
    static class Node{
        Node children[]=new Node[26];
        boolean EndOfWord=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }

        }
    }

    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.EndOfWord=true;
    }
    public static boolean startWithproblem(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }

        return true;
    }
    public static void main(String[] args) {
        String word[]={"apple","app","mango","man","womwn"};
        String prefix_1="app";
        String prefix_2="moon";
        for(int i=0;i< word.length;i++){
            insert(word[i]);
        }
        System.out.println(startWithproblem(prefix_1));
        System.out.println(startWithproblem(prefix_2));
    }
}
