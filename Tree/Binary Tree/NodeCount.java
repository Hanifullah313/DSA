public class NodeCount {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }

    public static int CountOFNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = CountOFNodes(root.left);
        int rightNodes = CountOFNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.BuildTree(node);
        System.out.println(CountOFNodes(root));
    }
}
