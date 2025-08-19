public class Mirror_BST {
   public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
   } 
    public static Node mirror_img(Node root){  // 0(n)
        if(root==null){
            return null;
        }
        Node left_ST__mirr=mirror_img(root.left);
        Node right_ST_mirr=mirror_img(root.right);

        root.left=right_ST_mirr;
        root.right=left_ST__mirr;

        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
     
        /* 
              8
             / \
            5   10
           /\    /
          3  6  11  
        */
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);        
        root.right=new Node(10);
        root.right.left=new Node(11);

        
        /* 
               8
            /     \
          10        5
           \       /  \
            11    6     3
        */
        root= mirror_img(root);
        preOrder(root);












    }
}
