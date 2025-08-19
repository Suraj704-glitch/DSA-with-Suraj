import java.util.*;
public class SortedArrayToBalencedBST {
 static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        
    }

 }
 public static Node creat_sorted_bal_BST(int arr[],int st,int end){
    if(st>end){
        return null;
    }
    int mid=st+(end-st)/2;
    Node root=new Node(arr[mid]);
    root.left=creat_sorted_bal_BST(arr,st,mid-1);
    root.right=creat_sorted_bal_BST(arr,mid+1,end);
    return root;
 } 
 public static void inOrderTra(Node root,ArrayList<Integer> list){
    if(root==null){
        return ;
    }
    inOrderTra(root.left,list);
    System.out.print(root.data+" ");
    list.add(root.data);
    inOrderTra(root.right,list);
 }

public static void main(String[] args) {
    int arr[]={3,5,6,8,10,11,12};

    ArrayList<Integer> list=new ArrayList<>();
    inOrderTra(root,list);
   Node root=creat_sorted_bal_BST(arr,0,arr.length-1);
    
}
}
