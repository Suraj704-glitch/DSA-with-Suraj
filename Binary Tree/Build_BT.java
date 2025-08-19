import java.util.*; 
public class Build_BT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }  
    }
    static class Binary_Tree{ 
    static int idx=-1;
    public static Node buildtree(int nodes[] ){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newnode=new Node(nodes[idx]);
        newnode.left=buildtree( nodes);
        newnode.right=buildtree(nodes);
        return newnode;
    } 
    
    // PreOrder Treavers
    public static void preOrder(Node root) {
        if(root==null){
            return;
        }
        // print root node 
     System.out.print(root.data+" ");
     preOrder(root.left);
     preOrder(root.right);
    }
    // InOrder Travers 
    public static void inOrder(Node root){
        if(root==null){
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }

    // PreOrder travers
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    // Level Iteration Traversing
    public static void levelOrder(Node root){ 
        if(root==null){
            return ;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                } 
            }
            else{
               System.out.print (currNode.data +" ");
               if(currNode.left!=null){
                q.add(currNode.left);
               }
               if(currNode.right!=null){
                q.add(currNode.right); 
               }
            }
             
        }



    }
}
   
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_Tree tree=new Binary_Tree();
        Node root=tree.buildtree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        System.out.println();
        tree.levelOrder(root);
    }
}
