public class LArgestBSTinBT {
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
    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    } 
    public static int maxBST=0;
        public static Node newNode;
    public static Info largestBST(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo=largestBST(root.left);
        Info rightInfo=largestBST(root.right);
        int min=Math.min(root.data,(Math.min(leftInfo.min,rightInfo.min)));
        int max=Math.max(root.data,(Math.max(leftInfo.max,rightInfo.max)));
        int size=leftInfo.size+rightInfo.size+1;
        if(leftInfo.max>=root.data||rightInfo.min<=root.data){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBST&&rightInfo.isBST){
            maxBST=Math.max(maxBST,size);
            newNode=root;
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
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
        


        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        largestBST( root);
        System.out.println( "Maximum size of BST= " +maxBST);
        System.out.println(newNode.data);
        System.out.println("PreOrder Travers");

        preOrder(newNode);

    }
}
