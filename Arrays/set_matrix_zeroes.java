public class set_matrix_zeroes {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        // Taking two separate arrays

        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];

        // row = {0, 0, 0}, col = {0, 0, 0}

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // row = {0, 1, 0} col = {0, 1, 0}
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < col.length; i++) {
            for (int j = 0; j < col.length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }

}
