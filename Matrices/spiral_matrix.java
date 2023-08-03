import java.util.Arrays;

public class spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] res = new int[matrix.length * matrix[0].length];

        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;

        int index = 0;
        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                res[index] = matrix[top][i];
                index += 1;
            }
            top += 1;

            for (int i = top; i < bottom; i++) {
                res[index] = matrix[i][right - 1];
                index += 1;
            }
            right -= 1;

            for (int i = right - 1; i > left - 1; i--) {
                res[index] = matrix[bottom - 1][i];
                index += 1;
            }
            bottom -= 1;

            for (int i = bottom - 1; i > top - 1; i--) {
                res[index] = matrix[i][left];
                index += 1;
            }
            left += 1;

        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res));
        }

        String name = "soumya";
        upper(name);

    }

    public static String upper(String name) {
        System.out.println((char) (name.charAt(0) - 32));
        return "";
    }
}
