/* Qs. Take an array as input
 from the user. Search for a given 
number x and print the index at which it occurs.*/

import java.util.*;
public class LinearSearch {
    public static void fun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("enter the elements of array");
        // input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        // solution
        System.out.println("enter the number to search");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (marks[i] == x) {
                System.out.print(" X Found at index " + i);
                break;
            }
        }

    }

    public static void fun2() {
        int marks[] = { 23, 34, 43, 54, 45 };
        int x = 43;

        for (int i = 0; i < 5; i++) {
            if (marks[i] == x) {
                System.out.print(" X Found at index  " + i);
                break;
            }

        }

    }
    public static void main(String[] args) {
        // fun2();
        fun();
    }
}
