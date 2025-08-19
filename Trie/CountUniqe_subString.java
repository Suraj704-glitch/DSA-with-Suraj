public class CountUniqe_subString {
   
   public static class Node{
    Node children[]=new Node[26];
    boolean EndOfWord=false;
    Node(){
        for(int i=0;i<children.length;i++){
            children[i]=null;
        }
    }
   }
   public static Node root=new Node() ;

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


   public static int countNode(Node root){ // count all node iin the trie
    if(root==null){
        return 0;
    }
    int count=0;
    for(int i=0; i<26;i++){
        if(root.children[i]!=null){
           count += countNode(root.children[i]);
        }
        
    }
    return count+1;
   }
    public static void main(String[] args) {
        String str="ababa";
        //Find  all suffic=>inSeart in Trie
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);// all uniqe prefix are insert in the trie

        }
        System.out.println(countNode(root));
    }

}
