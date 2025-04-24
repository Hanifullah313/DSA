public class subsequnceinString {
    public static void subsequence(String str, int index, String newstring) {
        if (index == str.length()) {
            System.out.println(newstring);
            return;
        }
        char currentchar = str.charAt(index);
        // to be
        subsequence(str, index + 1, newstring + currentchar);
        // or not to be
        subsequence(str, index + 1, newstring);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
    }
}
