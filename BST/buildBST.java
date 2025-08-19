public class buildBST {
    
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

    // Build BST
    public static Node inSertNode(Node root,int val){
      
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){  // left subtree;
            root.left=inSertNode(root.left,val);   
        }
        else{
            // right subtree;
            root.right=inSertNode(root.right, val);
        }
        return root;
    }
    public static void inOrderTrv(Node root){
        if(root==null){
            return ;
        }
        inOrderTrv(root.left);
        System.out.print(root.data +" ");
        inOrderTrv(root.right);
       
    }

    //  Search in BST
    public static boolean Searchkey(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
            return Searchkey(root.left,key);
        }
        else{
           return Searchkey(root.right,key);
        }
     
    }
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<value.length; i++){
           root= inSertNode(root, value[i]);
        }
      inOrderTrv( root);
      System.out.println();


      System.out.println( Searchkey(root,1));
    }
}
