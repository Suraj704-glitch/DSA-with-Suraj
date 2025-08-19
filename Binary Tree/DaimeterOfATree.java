public class DaimeterOfATree {
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
    public static int Daimeter1(Node root){  //0(n^2)
        if(root==null){
            return 0;
        }
        int leftDiametr=Daimeter1(root.left);
        int lefthight=Hight(root.left);
        int RigthDiametr=Daimeter1(root.right);
        int righthight=Hight(root.right);

        int d_Thr_self=lefthight+righthight+1;

           
          return Math.max( d_Thr_self,Math.max(leftDiametr,RigthDiametr));
    }

    public static int Hight(Node root){
        if(root==null){
            return 0;
        }
        int leftH=Hight(root.left);
        int rightH=Hight(root.right);
        return Math.max(leftH,rightH)+1;
    }

    //APROCH 2 FOR FOR CALCULATE Both Diameter and Hight at a time
    public static class Info{
         int diam;
         int ht;
        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    } 
    public static Info diameter(Node root){
        if(root==null){
           return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);// ld&lh
        Info rightInfo=diameter(root.right);// rd&rh
 
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }

    public static void main(String[] args) {
         
        //       1
        //     /   \
        //    2    3
        //   / \   / \
        //  4   5  6  7
        //           /
        //          8             
Node root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);
root.left.left=new Node(4);
root.left.right=new Node(5);
root.right=new Node(3);
root.right.left=new Node(6);
root.right.right=new Node(7);
root.right.right.left=new Node(8);
System.out.println("max Diameter = " +Daimeter1(root));

System.out.println();

System.out.println("max Diameter by Info = " +diameter(root).diam);
System.out.println();

System.out.println("max Hight by Info = " +diameter(root).ht);
    }
}
