public class WordBreak {
    static class Node {
        Node[] Children = new Node[26];
        boolean eow = false;
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.Children[idx] == null) {
                curr.Children[idx] = new Node();
            }
            curr = curr.Children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.Children[idx] == null) {
                return false;
            }
            curr = curr.Children[idx];
        }
        return curr.eow;
    }

    public static boolean Wordbrek(String word) {
        if (word.length() == 0) {
            return true;
        }
        for (int i = 1; i <= word.length(); i++) { // Fixed loop condition
            String Firstpart = word.substring(0, i);
            String Secpart = word.substring(i);
            if (search(Firstpart) && Wordbrek(Secpart)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "samsung" };
        String key = "ilikesamsung";
        for (String word : words) {
            insert(word);
        }
        System.out.println(Wordbrek(key)); // Now returns true
    }
}