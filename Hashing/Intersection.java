package Hashing;

import java.util.*;

public class Intersection {
    public static int Intersect(int arr1[], int arr2[]) {
        int count=0;
        HashSet<Integer> Union = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            Union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (Union.contains(arr2[i])) {
                // match
                System.out.print(arr2[i] + "  ");
                System.out.println( "  ");
                Union.remove(arr2[i]);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 45, 6 };
        int arr2[] = { 1, 2, 3, 4, 45,6,6, 6, 0, 9, 8, 7, };
        System.out.println(Intersect(arr1, arr2));
    }
}
