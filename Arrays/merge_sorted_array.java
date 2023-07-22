import java.util.Arrays;

public class merge_sorted_array {
    public static void main(String args[]) {
        int n[] = { 1, 2, 3, 0, 0, 0 };
        int m[] = { 2, 5, 6 };
        int a = 3;
        mergeArrays(n, m, a);
    }

    public static void mergeArrays(int m[], int[] n, int a) {
        for (int i = 0; i < n.length; i++) {
            m[a + i] = n[i];
        }
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
    }
}
