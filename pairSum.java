
//pair sum 
import java.util.*;
public class pairSum {
    public static void Fun() {
        int marks[] = { 90, 34, 43,7, 10, 3, 43 };
        int target = 10;
        int pair1 = 0;
        int pair2 = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 1; j < marks.length; j++) {
                if ((marks[i] + marks[j]) == target) {
                    pair1 = marks[i];
                    pair2 = marks[j];
                }
            }   
        }
        System.out.println("This is The value that there sum is == to target " + pair1);
        System.out.println("This is The value that there sum is == to target " + pair2);
    }

    public static void main(String[] args) {
        Fun();
    }
}
