package Tree.BST;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val); // Create a new node when root is null
        }
        if (root.data > val) {
            // Insert into the left subtree
            root.left = insert(root.left, val);
        } else {
            // Insert into the right subtree
            root.right = insert(root.right, val);
        }
        return root; // Return the root node after insertion
    }

    public static void inorder(Node root) {
        if (root == null)
            return; // Base case
        inorder(root.left); // Traverse the left subtree
        System.out.print(root.data + " "); // Print the current node
        inorder(root.right); // Traverse the right subtree
    }

    public static boolean search(Node root, int key) { // O(h)
        if (root == null) {
            return false; // Base case: key not found
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) { // O(h)
        if (root == null) {
            return null; // Base case: key not found
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);

        } else { // root.data == val
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root); // Print the tree in in-order traversal
        System.out.println();
        if (search(root, 10)) {
            System.out.println(" Key is found ");
        } else {
            System.out.println(" not found ");
        }
        delete(root, 3);
        inorder(root);  
    }
}
