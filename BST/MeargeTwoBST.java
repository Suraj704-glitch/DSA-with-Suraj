import java.util.*;
public class MeargeTwoBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            
        }

    }
    public static void getinOrder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        getinOrder(root.left,arr);
        arr.add(root.data);
        getinOrder(root.right,arr);
    }
    // Creat BST By Sirted Array;
    public static Node createBST(ArrayList<Integer> finalarr,int st,int end){
        if(st>end){
            return null;
        }
        int mid=st+(end-st)/2;
        Node root=new Node(finalarr.get(mid));
        root.left= createBST(finalarr,st,mid-1);
        root.right= createBST(finalarr,mid+1,end);
        return root;
    }


    public static Node mearge(Node root1,Node root2){
        ArrayList<Integer> arr1=new ArrayList<>();
        getinOrder(root1,arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getinOrder(root2,arr2);

        // Mearge two Array;
        
        ArrayList<Integer> finalarr=new ArrayList<>();
       int i=0,j=0;
        while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size())  {
             finalarr.add(arr1.get(i));
                i++;
        }      
        while(j<arr2.size())  {
             finalarr.add(arr2.get(j));
                j++;
        }      

        // create BST by sorted array
       return createBST(  finalarr,0,finalarr.size()-1);
      
    }

    public static void preOrder(Node root){
       if(root==null){
             return;
                     }
     System.out.print(root.data+" ");
     preOrder( root.left);
     preOrder( root.right);
    }
public static void main(String[] args) {
   // First BST
    Node root1=new Node(2);
    root1.left=new Node(1);
    root1.right=new Node(4);

    // second root BST
    Node root2=new Node(9);
    root2.left=new Node(3);
    root2.right=new Node(12);
    Node root=mearge( root1, root2);
    preOrder(root);
    
}
}
