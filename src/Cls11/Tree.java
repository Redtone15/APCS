package Cls11;

public class Tree {
    public class Node {
        private int key;
        private Node left;
        private Node right;

        public int getKey() {
            return key;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }
        public class BinaryTreeClient {

        public void printTreePreOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.getKey() + " ");
            printTreePreOrder(root.getLeft());
            printTreePreOrder(root.getRight());
        }

        public void printTreeInOrder(Node root) {
            if (root == null) {
                return;
            }
            printTreeInOrder(root.getLeft());
            System.out.print(root.getKey() + " ");
            printTreeInOrder(root.getRight());
        }

        public void printTreePostOrder(Node root) {
            if (root == null) {
                return;
            }
            printTreePostOrder(root.getLeft());
            printTreePostOrder(root.getRight());
            System.out.print(root.getKey() + " ");
        }

        public void printTree(Node root) {
            printTreePreOrder(root);
        }
    }


}
