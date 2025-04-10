import java.util.Arrays;
import java.util.Collections;

public class reversewords {
    static public String reverseWords(String s) {
        s = s.trim();
        String[] words=s.split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s1 = "   the   sky is  blue  ";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println(reverseWords(s1)); // Output: "blue is sky the"
        System.out.println(reverseWords(s2)); // Output: "world hello"
        System.out.println(reverseWords(s3)); // Output: "Java"
    }
}