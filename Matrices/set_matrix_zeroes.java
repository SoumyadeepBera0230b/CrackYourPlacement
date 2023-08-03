package Matrices;

import java.util.Arrays;

public class set_matrix_zeroes {

    public static void make_zeros(int matrix[][]) {

        int row[] = new int[matrix.length]; // {0, 0, 0}
        int col[] = new int[matrix[0].length]; // {0, 0 , 0}

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(row) + " " + Arrays.toString(col));
        for (int i = 0; i < matrix.length; i++) {

            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 } };
        make_zeros(matrix);
    }
}
