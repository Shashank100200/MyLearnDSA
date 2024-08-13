////          Binary Tree Implimentation
//public class BinaryTreeYT {
//    class Node{
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data){
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    class BinaryTree{
//        static int idx = -1;
//        public Node buildTree(int node[]){
//            idx++;
//            if(node[idx] == -1){
//                return null;
//            }
//            Node newNode = new Node(node[idx]);
//            newNode.left = buildTree(node);
//            newNode.right = buildTree(node);
//
//            return newNode;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//
//        BinaryTree tree = new BinaryTree();
//        Node root = tree.buildTree(nodes);
//        System.out.println(root);
//    }
//}
//
