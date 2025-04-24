import java.util.*;

public class uniqueSubseq {
    public static void subsequence(String str, int index, String newstring, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newstring)) {
                return;
            } else {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char currentchar = str.charAt(index);
        // to be
        subsequence(str, index + 1, newstring + currentchar, set);
        // or not to be
        subsequence(str, index + 1, newstring, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);
    }

}
