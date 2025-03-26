
/*Take an array of numbers as input and check if it is an array sorted in ascending order.
 */
import java.util.*;

public class Asending {
    static void fun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("enter the elements of array");
        boolean IsAsending = false;
        // input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        // checking condition
        for (int i = 0; i < size - 1; i++) {
            if (marks[0] < marks[i + 1]) {
                IsAsending = true;
            }
        }
        if (IsAsending) {
            System.out.println("The array is sorted in ascending order");

        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
    public static void main(String[] args) {
        fun();
    }
}
