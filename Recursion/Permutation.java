public class Permutation {
    public static void printpermutation(String str, String permutaion) {
        if (str.length() == 0) {
            System.out.println(permutaion);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            // ABC -> AB
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, permutaion + currchar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, "");
       System.out.println(str.substring(0+1));
    }
}