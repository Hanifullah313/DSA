public class StartWith {
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

    public static boolean startsWith(String prefix) {
       Node curr = root;
       for(int i=0; i<prefix.length(); i++) {
           int idx = prefix.charAt(i)-'a';
           if(curr.Children[idx] == null) {
               return false;
           }
           curr = curr.Children[idx];
       }
       return true;
   }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "women", "child"};
        String prefix = "app";
        for (String word : words) {
            insert(word);
        }
        System.out.println(startsWith(prefix)); // Now returns true
    }
}