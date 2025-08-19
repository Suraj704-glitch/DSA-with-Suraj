public class prifix_problem {
    public static class Node{
        Node children[]=new Node[26]; 
        boolean EOW=false;
        int freq;
        Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{// yani kuch valid value present ho
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.EOW=true;
    }
    // search 
    public static void finsPrefix(Node root,String ans ){
            
        if(root==null){
            return ;
        }
        if(root.freq==1){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){ // have a valid index
                finsPrefix( root.children[i], ans+(char)(i+'a') );
            }
        }
    }
    public static void main(String [] args){
        String []word={"zebra","dog","duck","dove"};
        String ans=new String();
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        root.freq=-1;
        finsPrefix(root, ans);
    }
}
