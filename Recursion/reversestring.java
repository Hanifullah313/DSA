public class reversestring {
    public static void print(String str, int indx) {
        if (indx == 0) {
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        print(str, indx - 1);
    }

    public static void main(String[] args) {
        String str = "abcde";
        print(str, str.length() - 1);
    }
}
