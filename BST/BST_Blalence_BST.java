import java.util.*;
public class BST_Blalence_BST {
    static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        }
    }
    public static void inOrder_sor_arr(Node root,ArrayList<Integer> list){
    if(root==null){
        return ;
    }
    inOrder_sor_arr(root.left,list);
    // System.out.print(root.data+" ");
    list.add(root.data);
    inOrder_sor_arr(root.right,list);
 }
  public static Node creat_sorted_bal_BST(ArrayList<Integer> list,int st,int end){
    if(st>end){
        return null;
    }
    int mid=st+(end-st)/2;
    Node root=new Node(list.get(mid));
    root.left=creat_sorted_bal_BST(list,st,mid-1);
    root.right=creat_sorted_bal_BST(list,mid+1,end);
    return root;
  } 

  // BST_to_Balence_BST
   public static Node BST_to_Balence_BST(Node root){
    // inOeder sequance
    ArrayList<Integer> list=new ArrayList<>();
        inOrder_sor_arr(root,list);
       
    // balence BST
   Node bal_root=creat_sorted_bal_BST(list,0,list.size()-1);
   return bal_root;
  }

  // preorder
  public static void preOrder(Node root){
    if(root==null){
        return ;
    }
    System.out.print(root.data+" ");
    preOrder( root.left);
    preOrder( root.right);
  }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
         root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        
         Node bst=BST_to_Balence_BST( root);
         preOrder(bst);
    }
}
