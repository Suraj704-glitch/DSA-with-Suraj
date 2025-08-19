public class Min_dist_betweenTwoNode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public static Node lca2(Node root,int n1,int n2){
        if(root==null||root.data==n1|| root.data==n2){
            return root;
        }
        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);

        // leftLCA =val But rightLCA=null;
        if(rightLca==null){
            return leftLca;
        }
        // rightLCA=val But leftLCA==null
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }

    public static int lcadist(Node root,int n){
        if(root==null){  
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=lcadist(root.left,n);
        int rightdist=lcadist(root.right,n);
        if( leftdist==-1&&rightdist==-1){
            return -1;
        }
        else if(leftdist==-1){
            return rightdist+1;
        }
        else{
            return leftdist+1;
        }
    }
    public static int min_dist(Node root,int n1,int n2){
        Node lca=lca2(root,n1,n2);
        int dist1=lcadist(lca,n1);
        int dist2=lcadist(lca,n2);
        return dist1+dist2;
    }

    // Kth Ancester from a Node
    public static int kAncester(Node root,int n,int k){
        if(root==null){
            return -1;
        }
         if(root.data==n){
            return 0;
         }
         int leftancester=kAncester(root.left,n,k);
         int rightancester=kAncester(root.right,n,k);

         if(leftancester==-1&&rightancester==-1){
            return -1;
         }
        
         int max=Math.max(leftancester,rightancester);
         if(max+1==k){
            System.out.println(root.data);

         }
         return max+1;
    }

    
    public static void main(String[] args) {
                //  1
        //        /  \
        //       2    3
    //          / \  / \
      //       4   5 6  7

      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      int n1=4,n2=5;
      System.out.println(min_dist(root,n1,n2));
      System.out.println();
      System.out.println(kAncester(root,n1,2));   
    }
}
