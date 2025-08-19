import java.util.ArrayList;

public class Print_rootToLeaf_Path {
    
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

     
    // Root to LEAF Path
    public static void printLeaf(Node root ,ArrayList<Integer> path){
        if(root==null){
            return ;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printpath(path);
         
        }
        
        printLeaf(root.left,path);
        printLeaf(root.right,path);
        
         path.remove(path.size()-1);
         }
         public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size()-1; i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

        public static boolean isValidBST(Node root, Node min, Node max){
            if(root==null){
                return true;
            }
            if(min!=null&&root.data<=min.data){
                return false;
            }
            if(max!=null&&root.data>=max.data);
            return isValidBST(root.left,min ,root)&&isValidBST(root.right,root,max);
        }
         public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<value.length; i++){
           root= inSertNode(root, value[i]);
        }
      inOrderTrv( root);
      System.out.println();


    //   System.out.println();
    //    printLeaf(root,new ArrayList<>());

    if(isValidBST(root,null,null)){
        System.out.println("BST are valid");
    }else{
        System.out.println("\"BST are not valid");
    }
      
 
    }
}
