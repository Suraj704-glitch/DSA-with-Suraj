import java.util.*;
public class Delete_a_Node {
    
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

    
    // inOrder Traverse

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

    // Delete Node 
    public static Node deleteNode(Node root,int val){
        if(root.data<val){
            root.right=deleteNode(root.right,val);

        }else if(root.data>val){
            root.left=deleteNode(root.left,val);
        }else{
        // Case 1 (Leaf Node)
        if(root.left==null&&root.right==null){
            return null;
        }
        // Case 2 (Node have one childrean )
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        // Case 3 (Node have bothchildrean )
        Node iS=succesor(root.right);// left most leaf node in right side
        root.data=iS.data;
        root.right= deleteNode(root.right,iS.data );
    }
            return root;
    }
    public static Node succesor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    

    //Print in Range
    public static void printRange(Node root, int k1,int k2){
        if(root==null){
            return ;
        }
        if(k1<=root.data&&root.data<=k2){
            printRange(root.left,k1,k2);
            System.out.print(root.data+" ");
              printRange(root.right,k1,k2);
        }
        if(root.data<k1){//yani whole tree lie in left in the tree 
              printRange(root.left,k1,k2);
        }
        else{ // right side lie krta hai
              printRange(root.right,k1,k2);
        }
    } 


     
    public static void main(String[] args) {
        int value[]={1,3,4,5,6,8,10,12,14};
       
        Node root=null;
        for(int i=0;i<value.length; i++){
           root= inSertNode(root, value[i]);
        }
         

     inOrderTrv( root);
 
      System.out.println();
      root= deleteNode(root,1);
       inOrderTrv( root);
 
    }
}


