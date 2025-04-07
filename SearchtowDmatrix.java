





//Day 8 .


public class SearchtowDmatrix {
    static public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length; 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (target == matrix[i][j]) {
                   return true;
                } 
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target1 = 3;
        int target2 = 13;
        System.out.println(searchMatrix(matrix1, target1));
        System.out.println(searchMatrix(matrix1, target2));

    }
}