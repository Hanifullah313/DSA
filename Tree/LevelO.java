
import java.util.*;

public class LevelO {

    // Static nested class to define the structure of a Node
    static class Node {
        int data; // Value of the node
        Node left, right; // Left and right child references

        // Constructor to initialize node with data
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Static class to handle binary tree operations
    static class BinaryTree {
        static int idx = -1; // Global index to track current position in array

        // Method to build a binary tree from a pre-order array
        public static Node BuildTree(int[] nodes) {
            idx++; // Move to the next index

            // If current value is -1, it's a null node, return null
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            // Create a new node with the current value
            Node newNode = new Node(nodes[idx]);

            // Recursively build the left subtree
            newNode.left = BuildTree(nodes);

            // Recursively build the right subtree
            newNode.right = BuildTree(nodes);

            // Return the newly created node
            return newNode;
        }
    }

    public static void levelOrder(Node root) {
        if (root==null) {
          return;  
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left!=null) {
                   q.add(currNode.left) ;
                }
                if (currNode.right!=null) {
                   q.add(currNode.right) ;
                }
            }
        }

    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Pre-order array where -1 represents null
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // Call BuildTree to construct the binary tree
        Node root = BinaryTree.BuildTree(node);

        // Print the data of the root node to confirm tree was built

        levelOrder(root);
    }
}
