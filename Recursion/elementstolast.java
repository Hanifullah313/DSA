public class elementstolast {
    public static void print(String str, int indx, int count, String newstring) {
        if (indx == str.length()) {
            for(int i=0; i<=count;i++){
              newstring+='a';
            }
            System.out.println(newstring);
            return;
        }
        char currentchar = str.charAt(indx);
        if (currentchar == 'a') {
            count++;
            print(str, indx + 1, count, newstring);
        } else {
            newstring += str.charAt(indx);
            print(str, indx + 1, count, newstring);
        }
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        print(str, 0, 0, "");
    }
}
