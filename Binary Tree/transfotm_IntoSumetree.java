public class transfotm_IntoSumetree {
    
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

        public static int tranf_intoSum(Node root){ // by self
            if(root==null){
                return 0;
            }
            int leftsum=tranf_intoSum(root.left);
            int rightsum=tranf_intoSum(root.right);

            int data=root.data;
            root.data=leftsum+rightsum;
            return data+root.data;
        }

        // By Saradhya mam
        public static int transfotm_IntoSumetree2(Node root){
            if(root==null){
                return 0;
            }
            int leftchild=transfotm_IntoSumetree2(root.left);
            int righttchild=transfotm_IntoSumetree2(root.right);
            int data=root.data;

            int newleft=root.left==null?0:root.left.data;
            int newright=root.right==null?0:root.right.data;
            root.data=leftchild +newleft+righttchild +newright;
            return data;
        }
        // preorder traerse
        public static void print(Node root) {
            if(root==null){
                return ;
            }
            System.out.print(root.data +" ");

            print(root.left);
            print(root.right);
        }
    public static void main(String[] args) {
         
        //         1
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
      tranf_intoSum(root);
    // transfotm_IntoSumetree2(root);
      print(root  );
    }
}

