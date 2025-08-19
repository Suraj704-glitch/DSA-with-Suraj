import java.util.*;
public class Height {

   public static class Node{
      public int data;
      public Node left;
       public Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
   // Height of Node 
        public static int Height(Node root){
            if(root==null){
                return 0;
            }
            int lh=Height(root.left);
            int  rh=Height(root.right);
           return Math.max(lh,rh)+1;
        }
      
        // Count the number of node 
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int lcount=count(root.left);
            int crount=count(root.right);
            return lcount+lcount+1;

        }

        // Sum of Node
        public static int sum(Node root  ){
             
            if(root==null){
                return 0;
            }
            int leftsum=sum(root.left);
            int rightsume=sum(root.right);
            return  leftsum+rightsume+root.data;
            
        } 
    public static void main(String[] args) {
         
                //       1
                //     /   \
                //    2    3
                //   / \   / \
                //  4   5  6  7

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Height of tree is = " +Height(root));
          
        System.out.println("Number of Node in Binary_Tree = " +count(root));
        System.out.println("Sum of all Node = " +sum(root));
   
    }

}
