import java.util.*;
class Array {
    void first_method() {
        System.out.println("first method called ");
        int marks[] = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        for (int i = 0; i < 5; i++) {
            System.err.println(marks[i]);
        }
    }

    void Second_method() {
        System.out.println("Second  method called ");
        int marks[] = { 10, 34, 43, 4334, 3, 43 };
        for (int i = 0; i < 6; i++) {
            System.err.println(marks[i]);
        }
    }

    void Third_method() {
        System.out.println("Third  method called ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("enter the elements of array");
        //input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        //output
        for (int i = 0; i < size; i++) {
            System.err.println(marks[i]);
        }
    }
}

public class Man {
    public static void main(String[] args) {
        Array obj = new Array();
       // obj.first_method();
       // obj.Second_method();
        obj.Third_method();
    }
    }

