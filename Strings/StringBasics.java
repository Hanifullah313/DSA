import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        String name = "hanif";
        String lname = "Ullah";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        // String yourName = sc.nextLine();
        // System.out.println(yourName);

        // Calling functions
        String fullName = concatenateStrings(name, lname);
        System.out.println("Concatenated String: " + fullName);

        System.out.println("Length of Full Name: " + getStringLength(fullName));

        System.out.println("Character at index 9: " + getCharAt(fullName, 9));

        compareStrings(name, lname);

        System.out.println("Substring (0,3): " + getSubstring(lname, 0, 3));
        System.out.println("Substring (1,3): " + getSubstring(lname, 1, 3));

        System.out.println("Parsed Integer: " + parseInteger("123"));

        System.out.println("String from Integer: " + toStringConversion(123));
    }

    // Function to concatenate two strings
    public static String concatenateStrings(String s1, String s2) {
        return s1 + s2;
    }

    // Function to get the length of a string
    public static int getStringLength(String str) {
        return str.length();
    }

    // Function to get character at a specific index
    public static char getCharAt(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Function to compare two strings
    public static void compareStrings(String s1, String s2) {
        if (s1.compareTo(s2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

    // Function to get substring of a string
    public static String getSubstring(String str, int start, int end) {
        if (start >= 0 && end <= str.length() && start < end) {
            return str.substring(start, end);
        } else {
            return "Invalid substring range";
        }
    }

    // Function to parse a string into an integer
    public static int parseInteger(String str) {
        return Integer.parseInt(str);
    }

    // Function to convert an integer to a string
    public static String toStringConversion(int number) {
        return Integer.toString(number);
    }
}
