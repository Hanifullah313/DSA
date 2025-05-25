public class DaimeterOfTree{
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

    public static int SumOFNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHieght = SumOFNodes(root.left);
        int rightHieght = SumOFNodes(root.right);
        int myheight = Math.max(leftHieght, rightHieght)+1;
        return myheight;
    }
    // big oh of n square time Complexity 
    public static int DaimeterTree(Node root) {
        if (root == null) {
            return 0;
        }
        int Daim1 = DaimeterTree(root.left);
        int Daim2 = DaimeterTree(root.right);
        int Daim3 = SumOFNodes(root.left)+SumOFNodes(root.right)+ 1;
        return Math.max( Daim3 , Math.max(Daim1, Daim2));
    }
// big oh of n  time Complexity 
 static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    // Single traversal: O(n)
    public static TreeInfo getDiameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = getDiameter(root.left);
        TreeInfo right = getDiameter(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;
        int diameterThroughRoot = left.height + right.height;
        int maxDiameter = Math.max(diameterThroughRoot, Math.max(left.diameter, right.diameter));

        return new TreeInfo(myHeight, maxDiameter);
    }

    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.BuildTree(node);
        System.out.println("Diameter of tree: " + getDiameter(root).diameter);
    }
}
