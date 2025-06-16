
public class Longestword {
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

   public static String ans="";
public static void longestWord(Node root, StringBuilder curr) {

       for(int i=0; i<26; i++) {
           if(root.Children[i] != null && root.Children[i].eow == true) {
               curr.append((char)(i+'a'));
               if(curr.length() > ans.length()) {
                   ans = curr.toString();
               }
               longestWord(root.Children[i], curr);
               curr.deleteCharAt(curr.length()-1);
           }
       }}

    public static void main(String[] args) {
      String words[] = { "a", "ap", "app", "appl", "apple", "apply", "banana" };
        for (String word : words) {
            insert(word);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}