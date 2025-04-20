public class findoccunrace {
    public static int first = -1;
    public static int last = -1;

    public static void print(String str, int indx, char elemnt) {
        if (indx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar = str.charAt(indx);
        if (currentchar == elemnt) {
            if (first == -1) {
                first = indx;
            } else {
                last = indx;
            }
        }
        print(str, indx + 1, elemnt);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        print(str, 0, 'a');
    }
}
