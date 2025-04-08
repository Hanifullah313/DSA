import java.util.*;

public class towD {

    static public void fun() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row numbers:");
        int row = sc.nextInt();
        System.out.println("Enter columns numbers:");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];

        // Input the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close(); // Close Scanner to prevent resource leak

        // Output the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(""); // Move to the next line after each row
        }

    }

    public static void main(String args[]) {
        fun();
    }
}
