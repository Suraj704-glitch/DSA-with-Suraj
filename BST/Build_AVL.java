import java.util.*;
public class Build_AVL {
    static class Node {
        int data,height;
        Node left,right;
        Node(int data){
            this.data=data;
            height=1;
    }
    }
    public static Node root;
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }//
    public static int getbalance(Node root){
        if(root==null){
            return 0;
        }
        return (height(root.left)-height(root.right));
    }
    public static Node inSert(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(root.data>key){
            root.left=inSert(root.left,key);
        }
        if(key>root.data){
            root.right=inSert(root.right,key);
        }else{
            return root;// jb both key are equal But Duplicate are Not allow
        }
        // root height
        root.height=Math.max(height(root.left),height(root.right))+1;
        // balence factor
        int bf=getbalance( root);

        // LL code 
        if(bf>1&& key<root.left.data){
            return rightRotate(root);
        }
        if(bf<-1&& key>root.right.data){
            return leftRotate(root);

        }
        // LR code 
        if(bf>1&& key>root.left.data){
            root.left=leftRotate(root);
            return rightRotate(root);
        } 
        // RL Code 
        if(bf<-1&&key<root.right.data){
            root.right=rightRotate(root);
            return leftRotate(root);
        }
        return root;// AVL are balence 
    }

    //left rotation  
    public static Node leftRotate(Node x){
        Node y=x.right;
        Node T2=y.left;
        // Rotation perform
        y.left=x;
        x.right=T2;
        // Up date height
        x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;
        return y;

    }
    // righrRotate
    public static Node rightRotate(Node x){
        Node y=x.left;
        Node T2=y.right;
        // Ritation perform 
        y.right=x;
        x.left=T2;
          x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;
        return y;
    }
   // preOrder travers
   public static void preOrder(Node root){
    if(root==null){
        return ;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    // System.out.print(root.data+" ");
    preOrder(root.right);
   }
    public static void main(String[] args) {
        root=inSert(root, 10);
        root=inSert(root, 20);
        root=inSert(root, 30);
        root=inSert(root, 40);
        root=inSert(root, 50);
        root=inSert(root, 25);
        preOrder(root);
    }


}
