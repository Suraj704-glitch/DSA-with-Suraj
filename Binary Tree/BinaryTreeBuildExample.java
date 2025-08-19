 
    public class BinaryTreeBuildExample {

        static int idx = -1;
    
        static class Node {
            int data;
            Node left;
            Node right;
    
            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    
        public static Node buildtree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }
    
        public static void printPreorder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    
        public static void main(String[] args) {
            int[] nodes = {-1, 2, -1};
            idx = -1;  // Reset idx before building tree
            Node root = buildtree(nodes);
    
            System.out.print("Preorder traversal of built tree:= ");
            printPreorder(root);
            System.out.println();
        }
    }
    

