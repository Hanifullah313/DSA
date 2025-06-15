public class TrieDS {
    static class Node { // Made static to allow static context usage
        Node[] Children = new Node[26]; // Fixed initialization
        boolean eow = false;
    }

    static Node root = new Node(); // Root node for the trie

    public static void insert(String word) {
        Node curr = root; // Use temporary pointer for traversal
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.Children[idx] == null) {
                curr.Children[idx] = new Node(); // Create new node if missing
            }
            curr = curr.Children[idx]; // Move to next node
        }
        curr.eow = true; // Mark end of word at LAST character
    }

    public static boolean search(String word) {
        Node curr = root; // Start from root for each search
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.Children[idx] == null) {
                return false; // Character not found
            }
            curr = curr.Children[idx]; // Move to next node
        }
        return curr.eow; // Check if it's a complete word
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any" };
        for (String word : words) {
            insert(word);
        }
        System.out.println(search("null")); // false
        System.out.println(search("the"));   // true
        System.out.println(search("a"));     // true
        System.out.println(search("their")); // true
        System.out.println(search("any"));   // true
        System.out.println(search("an"));     // false (not complete word)
    }
}